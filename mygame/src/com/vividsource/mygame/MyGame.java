package com.vividsource.mygame;

import com.badlogic.gdx.Game;

public class MyGame extends Game{

	public GameScreen game_screen;
	
	@Override
	public void create() {
		Assests.load();
		
		game_screen = new GameScreen(this);
		
		setScreen(game_screen);
	
}
}