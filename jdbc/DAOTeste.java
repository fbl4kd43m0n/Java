package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		//dao.incluir(sql, "Andres Robert");
		//dao.incluir(sql, "Ximena");
		//dao.incluir(sql, "Ana Liz");
		System.out.println(dao.incluir(sql, "Sandra",1000));
		System.out.println(dao.incluir(sql, "Rosa",1001));
		System.out.println(dao.incluir(sql, "Milagros",1002));
		
		dao.close();
		
	}

}
