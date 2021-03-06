package tuto.game;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.primitive.Rectangle;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.extension.physics.box2d.PhysicsConnector;
import org.anddev.andengine.extension.physics.box2d.PhysicsFactory;
import org.anddev.andengine.extension.physics.box2d.PhysicsWorld;
import org.anddev.andengine.sensor.accelerometer.AccelerometerData;
import org.anddev.andengine.sensor.accelerometer.IAccelerometerListener;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.os.Bundle;


public class Game extends BaseGameActivity implements IAccelerometerListener {
   
	private PhysicsWorld w;
	private int camera_width;
	private int camera_height;
	private Camera c;
	private Rectangle ball;
   
    
    @Override
	public Engine onLoadEngine() {
		return null;
	}

	@Override
	public void onLoadResources() {

	}

	@Override
	public Scene onLoadScene() {

		return null;
	}

	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccelerometerChanged(AccelerometerData pAccelerometerData) {

	}
}