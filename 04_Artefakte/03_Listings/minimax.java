/**
	 * Implementation of the recursive minimax algorithm that constructs a complete
	 * gametree for the passed gamefield and derives the optimal moves for each
	 * player in every node The nodes are saved in the transposition table
	 * @param depth  current depth in the game tree of the node for the node to be
	 *               calculated
	 * @param symbol player that is allowed to act in this node
	 * @return Node in the gametree that was analyzed containing optimal actions and
	 *         expected score
	 */
	private Node minimax(int depth, Symbol symbol) {
		int[] legalActions = this.internalGamefield.getLegalActions();
		if (legalActions.length == 0) {
			// if terminal state (leaf) create a leafnode, assign the score and return
			Node leaf = new Node(symbol);
			leaf.setDepth(depth);
			leaf.setScore(this.calculateScore(depth));
			return leaf;
		}
		Node currentNode = new Node(symbol);

		int initialScore = symbol.isX() ? -1 : 1;
		currentNode.setScore(initialScore);

		Symbol nextSymbol = Symbol.getNextSymbol(symbol);

		for (int legalAction : legalActions) {
			this.internalGamefield.applyAction(symbol, legalAction);

			Node nextNode = this.transpositionTable.retrieveNode(this.internalGamefield.getState());

			if (nextNode == null) {
				nextNode = this.minimax(depth + 1, nextSymbol);
				this.transpositionTable.putNode(this.internalGamefield.getState(), nextNode);
			}
			this.updateCurrentNode(currentNode, nextNode, legalAction, symbol);

			this.internalGamefield.undoAction(symbol, legalAction);
		}
		return currentNode;
	}