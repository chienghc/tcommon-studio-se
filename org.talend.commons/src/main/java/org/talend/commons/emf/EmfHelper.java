// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.emf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

/***/
public class EmfHelper {

    /**
     * WARNING : you may face StackOverflowError if you have bidirectional relationships or circular references it was
     * only tested with containment references.
     */
    @SuppressWarnings("unchecked")
    public static void visitChilds(EObject object) {
        List<EObject> toVisit = new ArrayList<EObject>();
        for (Iterator iterator = object.eClass().getEAllReferences().iterator(); iterator.hasNext();) {
            EReference reference = (EReference) iterator.next();
            if (reference.isMany()) {
                List list = (List) object.eGet(reference);
                for (Iterator iterator2 = list.iterator(); iterator2.hasNext();) {
                    Object get = iterator2.next();
                    if (get instanceof EObject) {
                        toVisit.add((EObject) get);
                    }
                }
            } else {
                Object get = object.eGet(reference);
                if (get instanceof EObject) {
                    toVisit.add((EObject) get);
                }
            }
        }

        for (EObject eObject : toVisit) {
            visitChilds(eObject);
        }
    }

    /**
     * Load emf model from file.
     * 
     * 
     * @param pkg EPackage of your emf model.
     * @param file The file that contains your emf model.
     * @return A list of emf object.
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> loadEmfModel(EPackage pkg, String file) throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();

        Resource.Factory.Registry registry = resourceSet.getResourceFactoryRegistry();
        registry.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        registry.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
        registry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        EPackage.Registry reg = resourceSet.getPackageRegistry();
        reg.put(pkg.getNsURI(), pkg);

        List<T> list = new ArrayList<T>();

        URI uri = URI.createFileURI(file);
        Resource resource = resourceSet.getResource(uri, true);
        resource.load(null);

        for (EObject obj : resource.getContents()) {
            list.add((T) obj);
        }
        return list;
    }

    /**
     * Save emf model to file.
     * 
     * @param pkg EPackage of your emf model.
     * @param models A list of emf object.
     * @param file The file that will store your emf model.
     * @throws IOException
     */
    public static void saveEmfModel(EPackage pkg, List<? extends EObject> models, String file) throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();

        Resource.Factory.Registry registry = resourceSet.getResourceFactoryRegistry();
        registry.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        registry.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
        registry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        EPackage.Registry reg = resourceSet.getPackageRegistry();
        reg.put(pkg.getNsURI(), pkg);

        URI uri = URI.createFileURI(file);

        Resource resource = resourceSet.createResource(uri);

        for (EObject model : models) {
            resource.getContents().add(model);
        }

        resource.save(null);
    }

}
