package com.coderanch.gol.vilda;

enum Cell {

	ALIVE {
		@Override
		public Cell next(int neighbors) {
			if (neighbors == 2)
				return ALIVE;
			if (neighbors == 3)
				return ALIVE;
			return DEAD;
		}
	},

	DEAD {
		@Override
		public Cell next(int neighbors) {
			if (neighbors == 3)
				return ALIVE;
			return DEAD;
		}
	};

	public abstract Cell next(int neighbors);
}
