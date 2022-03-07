public int getState() {
		int stateAsInt = 0;
		int bitBoardXASInt = Gamefield.convertBitBoardToInt(this.bitboardX);
		int bitBoardOASInt = Gamefield.convertBitBoardToInt(this.bitboardO);

		// bitshift the state number for X by the symbolspecific offset to avoid overlap
		int bitBoardXWithOffset = bitBoardXASInt << getSymbolSpecificOffset(Symbol.SYMBOL_X);

		stateAsInt = bitBoardXWithOffset + bitBoardOASInt;
		return stateAsInt;
	}