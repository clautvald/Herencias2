
import java.util.ArrayList;

public class SuperLista extends ArrayList<Integer> {

	public boolean add(Integer i) {
		
		System.out.println("Agregando " + i);
		
		return super.add(i);
	}

	public void ImprimirLista() {

		for (Integer i : this) {
			System.out.println(i + "");
		}
	}

	public double CalcularPromedio() {
		double res = 0;
		for (Integer i : this) {
			res += i;
		}
		res = res / size();
		return res;
	}
}
