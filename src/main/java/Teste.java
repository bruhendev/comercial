import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bruno.comercial.model.Cliente;
import com.bruno.comercial.model.Endereco;
import com.bruno.comercial.model.TipoPessoa;

public class Teste {

	
	public static void main (String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mariaDBPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setNome("João das Couves2");
		cliente.setEmail("joao@dascouves.com");
		cliente.setDocumentoReceitaFederal("123.123.123-12");
		cliente.setTipoPessoa(TipoPessoa.FISICA);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Aboboras Vermelhas");
		endereco.setNumero("111");
		endereco.setCidade("Uberlândia");
		endereco.setUf("MG");
		endereco.setCep("38400-000");
		endereco.setCliente(cliente);
		
		
		cliente.getEnderecos().add(endereco);		
		
		
		manager.persist(cliente);
		
		trx.commit();
	}
}
