package com.vividsource.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen{
	
	MyGame game;
	OrthographicCamera camera;
	SpriteBatch batch;
	
	float stateTime;
	
	
	public GameScreen(MyGame game){
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true,1920,1080);
		
		generalUpdate(); 
		
		batch = new SpriteBatch();
		
		stateTime = 0F;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1F, 1F, 1F, 1F);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		
		stateTime += Gdx.graphics.getDeltaTime();
		Assests.current_frame = Assests.loading_animation.getKeyFrame(stateTime, true);
		
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
			batch.draw(Assests.sprite_back, 0, 0);
		batch.end();
		
	}

	public  void generalUpdate() {
		if(Gdx.input.isKeyPressed(Keys.A)){
			
		}
	}
	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

}
