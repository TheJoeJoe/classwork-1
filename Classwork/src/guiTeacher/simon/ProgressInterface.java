package guiTeacher.simon;

import guiTeacher.components.Visible;

public interface ProgressInterface extends Visible{

	void setRound(int roundNumber);

	void setSequenceLength(int size);

	/**
	 * changes display for when game has ended
	 */
	void gameOver();

}
