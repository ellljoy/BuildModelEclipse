//package com.example.buildmodeleclipse;
//
//
//
//import min3d.core.Object3dContainer;
//import min3d.core.RendererActivity;
//import min3d.parser.IParser;
//import min3d.parser.Parser;
//
///**
// * How to load a model from a .obj file
// *
// * @author dennis.ippel
// *
// */
//public class ObjView extends RendererActivity {
//	private Object3dContainer objModel;
//
//	@Override
//	public void initScene() {
//		IParser parser = Parser.createParser(Parser.Type.OBJ, 
//				getResources(), "com.example.buildmodeleclipse:raw/lowpolytree_obj",false);
//		parser.parse();
//
//		objModel = parser.getParsedObject();
//		objModel.scale().x = objModel.scale().y = objModel.scale().z = .7f;
//		scene.addChild(objModel);
//	}
//
//	@Override
//	public void updateScene() {
//		objModel.rotation().x++;
//		objModel.rotation().z++;
//	}
//}

//import min3d.*;
//import min3d.core.*;
//import min3d.vos.*;
//import min3d.objectPrimitives.*;

//public class MainActivity extends RendererActivity
//{
//Object3dContainer box;
//
//@Override
//public void initScene()
//{
//box = new Box(1f,1f,1f);
//scene.lights().add(new Light());
//scene.addChild(box);
//}
//
//@Override
//public void updateScene()
//{
//box.rotation().x++;
//}
//}

