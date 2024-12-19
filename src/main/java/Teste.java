import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bruno.comercial.model.Cliente;
import com.bruno.comercial.model.TipoPessoa;

public class Teste {

	
	public static void main (String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mariaDBPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setNome("João das Couves");
		cliente.setEmail("joao@email.com");
		cliente.setDocumentoReceitaFederal("123.123.123-12");
		cliente.setTipo(TipoPessoa.FISICA);
		
		manager.persist(cliente);
		
		trx.commit();
	}
}
