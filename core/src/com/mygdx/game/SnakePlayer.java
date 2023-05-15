package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class SnakePlayer {
	
	int lastPressed = 0;
	public boolean alive = true;
	
	public Vector2 position;
	//public Rectangle body;
	//public ShapeRenderer bodyColor;
	public float speed = 100;
	public float scale = 1;
	public Sprite sprite;

	
	public SnakePlayer(Texture img){
		sprite = new Sprite(img);	
		//sprite.scale(scale);
		position = new Vector2((Gdx.graphics.getWidth()/2)-(sprite.getWidth()/2), (Gdx.graphics.getHeight()/2)-(sprite.getHeight()/2));
	}
	
	public void draw(SpriteBatch batch) {
		sprite.setPosition(position.x, position.y);
		sprite.draw(batch);
		update(Gdx.graphics.getDeltaTime());

	}
	
	public void update(float deltaTime) {
		
		if(alive) {
		if(Gdx.input.isKeyPressed(Keys.A))lastPressed = 1;
		if(Gdx.input.isKeyPressed(Keys.D))lastPressed = 2;
		if(Gdx.input.isKeyPressed(Keys.W))lastPressed = 3;
		if(Gdx.input.isKeyPressed(Keys.S))lastPressed = 4;
		
		if(lastPressed == 1)position.x -= deltaTime*speed;
		else if(lastPressed == 2)position.x += deltaTime*speed;
		else if(lastPressed == 3)position.y += deltaTime*speed;
		else if(lastPressed == 4)position.y -= deltaTime*speed;
		}
		checkOutOfLimits();

		
	}
	
	public void checkOutOfLimits() {
		//if(((sprite.getX()-(sprite.getWidth()*scale)) <= 0 - (sprite.getWidth()*scale)/2)) alive = false;//izquierda
		//if(sprite.getX()+(sprite.getWidth()*scale)>= Gdx.graphics.getWidth())alive = false;//derecha
		//if(((sprite.getY()*scale) <= 0)) alive = false;//arriba
		//if(sprite.getY()+(sprite.getHeight()*scale) >= Gdx.graphics.getHeight())alive = false;//abajo
		
		if(sprite.getX() <= 0)alive=false;//izquierda
		if((sprite.getX()+sprite.getHeight()) >= Gdx.graphics.getWidth())alive=false;//derecha
		if(sprite.getY() <= 0)alive=false;//arriba
		if((sprite.getY()+sprite.getHeight()) >= Gdx.graphics.getHeight())alive=false;//abajo

	}
	
	
}
