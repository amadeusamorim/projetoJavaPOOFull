
public class TesteReferencias {
	
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Amadeus");
		g1.setSalario(5000); // 5250
		
		Funcionario f = new Gerente();
		f.setSalario(2000); // 100 
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500); // 225
		
		Designer d = new Designer();
		d.setSalario(2000); // 200 
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
