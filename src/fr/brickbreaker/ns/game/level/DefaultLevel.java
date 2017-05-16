package fr.brickbreaker.ns.game.level;

import fr.brickbreaker.ns.balls.DefaultBall;
import fr.brickbreaker.ns.blocks.DefaultBlock;
import fr.brickbreaker.ns.game.Level;

public class DefaultLevel extends Level {

	public DefaultLevel() {
		super("Level #001");
		super.addBall(new DefaultBall(350, 401));
		
		for(int x = 40; x < 670; x+=64){
			for(int y = 20; y < 100; y+=21){
				super.addBlock(new DefaultBlock(x, y));
			}
		}
	}
}
