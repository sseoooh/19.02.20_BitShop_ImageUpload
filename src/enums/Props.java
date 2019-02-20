package enums;
import java.io.File;
public enum Props {
	ORA_DRIVER("oracle.jdbc.OracleDriver"),
	DB_USER("ORACLE"),
	DB_PASS("password"),
	DB_URL("jdbc:oracle:thin:@localhost:1521:xe"),
	IMAGE("C:"
			+File.separator+"Users"
			+File.separator+"hanbit"
			+File.separator+"java_basic"
			+File.separator+"All days"
			+File.separator+"jee_workspace"
			+File.separator+"BitShop2_v4"
			+File.separator+"WebContent"
			+File.separator+"resources"
			+File.separator+"img"
			+File.separator);
	private String value;
	
	private Props(String value) {//생성자
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}