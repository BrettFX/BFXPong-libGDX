package io.github.brettfx.bfxpong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class BFXPong extends ApplicationAdapter {
	SpriteBatch batch;
	Texture texture;
	Image img;
	Stage stage;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		texture = new Texture("background/backgroundzero.png");

		img = new Image(texture);
		img.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		Viewport viewport = new FitViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),
				new OrthographicCamera());
		
		stage = new Stage(viewport);
		stage.addActor(img);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
		stage.dispose();
	}
}
