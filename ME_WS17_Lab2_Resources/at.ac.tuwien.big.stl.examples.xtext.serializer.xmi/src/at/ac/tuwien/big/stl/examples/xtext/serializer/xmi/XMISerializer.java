package at.ac.tuwien.big.stl.examples.xtext.serializer.xmi;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;

import com.google.inject.Injector;

import at.ac.tuwien.big.StlStandaloneSetup;
import at.ac.tuwien.big.stl.STLPackage;

public class XMISerializer {

	@Test
	public void example1() {
		try {
			serialize("model/Example1-IAFProductLine.stltxt", "model-gen/Example1-IAFProductLine.stl");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	@Test
	public void example2() {
		try {
			serialize("model/Example2-ShelfSawingProductionLine.stltxt", "model-gen/Example2-ShelfSawingProductionLine.stl");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void serialize(String xtextUriString, String xmiURIString) throws IOException {
		// register XMI resource factory for .stl extension
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("stl", new XMIResourceFactoryImpl());
		
		// get Xtext resource set
		Injector injector = new StlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// register STL metamodel
		resourceSet.getPackageRegistry().put(STLPackage.eINSTANCE.getNsURI(), STLPackage.eINSTANCE);
		
		// load Xtext model
		URI uri = URI.createURI(xtextUriString);
		Resource xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		
		// create XMI model
		Resource xmiResource = resourceSet.createResource(URI.createURI(xmiURIString));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		xmiResource.save(null);
	}

}
