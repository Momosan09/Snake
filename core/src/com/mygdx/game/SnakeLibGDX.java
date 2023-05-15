package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SnakeLibGDX extends ApplicationAdapter {
	SnakePlayer player;
	Point point;
	SpriteBatch batch;
	Texture img;
	Texture imgPoint;
	@Override
	
	public void create () {
		batch = new SpriteBatch();
		
		img = new Texture("snake.png");
		player = new SnakePlayer(img);
		
		imgPoint = new Texture("punto.png");
		point = new Point(imgPoint);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0,0,0,1);
		batch.begin();
		point.draw(batch);
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		imgPoint.dispose();
	}
}
