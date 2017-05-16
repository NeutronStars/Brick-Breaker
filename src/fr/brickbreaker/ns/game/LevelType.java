package fr.brickbreaker.ns.game;

import fr.brickbreaker.ns.game.level.DefaultLevel;

public enum LevelType {

	DEFAULT(0, DefaultLevel.class);
	
	private final int id;
	private final Class<? extends Level> levelClass;
	
	private LevelType(int id, Class<? extends Level> levelClass) {
		this.id = id;
		this.levelClass = levelClass;
	}
	
	public int getId() {
		return id;
	}
	
	public Class<? extends Level> getLevel() {
		return levelClass;
	}
	
	public static Level getLevel(int id) throws Exception{
		for(LevelType level : LevelType.values()){
			if(level.getId() == id) return level.getLevel().newInstance();
		}
		return DEFAULT.getLevel().newInstance();
	}
}
