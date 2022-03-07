public int move(int state, int[] legalActions, float reward) {
		this.qTable.initialiseQTableEntryIfNotExistent(state, legalActions);
		// The TD update is not executed if it is the first state of a new episode for
		// the agent
		if (!this.isFirstStateOfNewEpisode) {
			this.updateQValueOfLastSATuple(state, this.qTable.getBestAction(state, legalActions), reward);
		}
		int bestAction = this.qTable.getBestAction(state, legalActions);
		int chosenAction = this.pickActionUsingEpsilonGreedy(bestAction, legalActions);

		this.isFirstStateOfNewEpisode = false;
		this.lastState = state;
		this.lastAction = chosenAction;
		return chosenAction;
	}