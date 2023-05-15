package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.MathUtils;

public class Point {

	public Vector2 position;
	public float speed;
	public Sprite sprite;
	public Random rnd;
	
	public Point(Texture img) {
		rnd = new Random();

		sprite = new Sprite(img);
		position = new Vector2(rnd.nextInt(Gdx.graphics.getWidth()), rnd.nextInt(Gdx.graphics.getHeight()));
		//position = new Vector2(200,20);
	}
	
	public void draw(SpriteBatch batch) {
		sprite.setPosition(position.x, position.y);
		sprite.draw(batch);
		update(Gdx.graphics.getDeltaTime());

	}

	public void update(float deltaTime) {

	}
}
