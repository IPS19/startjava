CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE Jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark TEXT,
	height FLOAT,
	weight FLOAT,
	status TEXT,
	origin TEXT,
	launch INTEGER,
	kaijuKill INTEGER
	);