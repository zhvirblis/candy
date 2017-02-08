package by.intexsoft.zhvirblis.candy;

public abstract class Candy {
	private float weight;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public abstract void action();
}
