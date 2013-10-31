package com.vividsource.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assests {

	public static Texture texture_back;
	public static Sprite sprite_back;
	
	public static Texture texture_sheet;
	public static TextureRegion[] sheet_frames;
	public static TextureRegion current_frame;
	public static Animation loading_animation;
	
	
	public static void load(){
		
		texture_back = new Texture(Gdx.files.internal("menu/storyboard_4.jpg"));
		texture_back.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		sprite_back = new Sprite(texture_back);
		sprite_back.flip(false, true);
		
		texture_sheet = new Texture(Gdx.files.internal("sprite_cow.png"));
		TextureRegion[][] temp = TextureRegion.split(texture_sheet, 600, 600);
		sheet_frames = new TextureRegion[9];
		
		
		int index = 0;
		for(int i=0; i < 3; i++){
			for(int j=0; j < 3; j++){
				sheet_frames[index++] = temp[i][j];
			}
		}
		for(int i=0; i<9; i++){
			sheet_frames[i].flip(false, true);
		}
		loading_animation = new Animation(0.15F, sheet_frames);
		loading_animation.setPlayMode(Animation.NORMAL); 

	}
}
