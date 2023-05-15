package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SnakeLibGDX extends ApplicationAdapter {
	SnakePlayer player;
	SpriteBatch batch;
	Texture img;
	@Override
	
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		player = new SnakePlayer(img);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0,0,0,1);
		batch.begin();
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
