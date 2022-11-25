
public class Main {

	public static void main(String[] args) {

		String[] t = new String[3];

		t[0] = ".1.3.6.1.2.1.1.6.0";

		ValorMib valorMib = new ValorMib();

		t = valorMib.valorMib("192.168.0.100", t, 161);

		for (int i = 0; i < t.length; i++) {

			System.out.println(t[i]);
		}

	}
}