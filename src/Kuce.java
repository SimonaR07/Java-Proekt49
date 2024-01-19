
public class Kuce {
	public void osobina () {
		System.out.println("Kuceto lae");
	}
	}

class LoveckoKuce extends Kuce {
	public void osobina() {
		System.out.println("Loveckoto kuce duska");
	}
	}

class glavna {
	public static void main(String[] args) {
		Kuce reks = new Kuce();
		reks.osobina();
		LoveckoKuce lovec = new LoveckoKuce();
		lovec.osobina();

	}

}
