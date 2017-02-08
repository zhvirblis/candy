package by.intexsoft.zhvirblis.candy;

public class Program {

	public static void main(String[] args) {
		ChocoCandy mars = new Mars();
		mars.setCacao(50);
		mars.setWeight(3);
		System.out.println(mars.getWeight());
		System.out.println(mars.getCacao());
	}

}
