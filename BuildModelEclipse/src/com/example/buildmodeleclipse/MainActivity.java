package com.example.buildmodeleclipse;


//import android.os.Bundle;
//import android.widget.FrameLayout;
//import android.widget.Toast;
//import min3d.core.Object3dContainer;
//import min3d.core.RendererActivity;
//import min3d.parser.IParser;
//import min3d.parser.Parser;
//
///**
//* How to load a model from a .obj file
//*
//* @author dennis.ippel
//*
//*/
//public class MainActivity extends RendererActivity {
//	private Object3dContainer objModel;
//
//    @Override  
//    protected void onCreate(Bundle savedInstanceState) {  
//        super.onCreate(savedInstanceState);  
//        setContentView(R.layout.activity_main);  
//  
//        FrameLayout ll = (FrameLayout) this.findViewById(R.id.frame3d);//Show FrameLayout in XML     
//          
//        ll.addView(_glSurfaceView);//Display in _glSurfaceView     
//        Toast.makeText(MainActivity.this, "Runin Well", Toast.LENGTH_SHORT).show();    
//    } 
//    
//	@Override
//	public void initScene() {
//
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


//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//
//public class MainActivity extends Activity {
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//          this.startActivity( new Intent(this,ObjView.class));
//    }
//}

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

