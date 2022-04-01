
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);

		Administrador a = new Administrador();
		a.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g); // -> Pode entrar no sistema;
		si.autentica(a); // out-> Não pode entrar no sistema pois a senha é diferente da setada em SistemaInterno;
		si.autentica(cliente); // out-> Pode entrar no sistema!
	}
}
