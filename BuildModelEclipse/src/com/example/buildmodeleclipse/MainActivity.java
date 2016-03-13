package com.example.buildmodeleclipse;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

/**
 * How to load a model from a .obj file
 * 

 * @author dennis.ippel, modified by Jin Yao
 * 

 */
public class MainActivity extends RendererActivity {
	private Object3dContainer objModel;
	private Object3dContainer objModel2;

	@Override
	public void initScene() {
		
		scene.lights().add(new Light());

		// Model#1
		IParser parser = Parser.createParser(Parser.Type.OBJ,
				getResources(), "com.example.buildmodeleclipse:raw/camaro_obj", true);
		parser.parse();

		objModel = parser.getParsedObject();
		objModel.position().x = -0.5f; 
		objModel.scale().x = objModel.scale().y = objModel.scale().z = .5f;
		scene.addChild(objModel);
		
		// Model#2
		IParser parser2 = Parser.createParser(Parser.Type.OBJ,
				getResources(), "com.example.buildmodeleclipse:raw/camaro2_obj", true);
		parser2.parse();

		objModel2 = parser2.getParsedObject();
		objModel2.position().x = 0.5f;
		objModel2.scale().x = objModel2.scale().y = objModel2.scale().z = .3f;
		scene.addChild(objModel2);
	}

	@Override
	public void updateScene() {
		objModel.rotation().x++;
		objModel.rotation().z++;
	}
}

/*
import min3d.*;
import min3d.core.*;
import min3d.vos.*;
import min3d.objectPrimitives.*;

public class MainActivity extends RendererActivity
{
	Object3dContainer box;

	@Override
	public void initScene()
	{
		box = new Box(1f,1f,1f);
		scene.lights().add(new Light());
		scene.addChild(box);
	}

	@Override
	public void updateScene()
	{
		box.rotation().x++;
		box.rotation().y++;
	}
}
*/
