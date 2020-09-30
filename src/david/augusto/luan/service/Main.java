package david.augusto.luan.service;

import david.augusto.luan.*;
import david.augusto.luan.heranca.*;
import david.augusto.luan.entidades.*;;

public class Main {

	public static void main(String[] args) {

		Carro c1 = new Carro("Volksvagem", "FIAT", 2020, 4, 15.50);
		c1.calcularImposto();
		System.out.println(c1);
		
		Moto m1 = new Moto("HONDA", "Bros", 2020, 160, 12.50);
		m1.calcularImposto();
		System.out.println(m1);
	}
}
