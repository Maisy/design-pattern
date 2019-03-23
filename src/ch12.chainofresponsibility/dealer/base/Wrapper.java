package dealer.base;

import java.sql.Connection;
import java.sql.Statement;

import dealer.goods.Exchange;
import dealer.goods.Fund;
import dealer.goods.Stock;

//DB server wrapper
public class Wrapper {
	private static final String url = "";
	private static final String id = "";
	private static final String pw = "";
	private static final String driver = "";

	private Connection con;
	private Statement stmt;

	private static Wrapper wrapper = new Wrapper();

	public static Wrapper getInstance() {
		return wrapper;
	}

	private Wrapper() {
		loadDriver();
		getConnection();
	}

	private void getConnection() {
		// TODO Auto-generated method stub

	}

	private void loadDriver() {
		// TODO Auto-generated method stub

	}

	public Stock[] getAllStocks() {
		// get data from db
		Stock[] stocks = new Stock[10];
		String query = "select * from stock";
		return stocks;
	}
	
	
	public Fund[] getAllFunds() {
		// get data from db
		Fund[] funds = new Fund[10];
		String query = "select * from fund";
		return funds;
	}
	
	
	public Exchange[] getAllExchanges() {
		// get data from db
		Exchange[] exchanges = new Exchange[10];
		String query = "select * from exchange";
		return exchanges;
	}
	
	

}
