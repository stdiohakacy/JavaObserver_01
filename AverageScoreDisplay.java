package behavior.Observer._01;

public class AverageScoreDisplay {
	private float runRate;
	private int predictedScore;

	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

	public void display() {
		System.out.println("\nAverage Score Display:\n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
	}
}