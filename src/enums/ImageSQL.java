package enums;

public enum ImageSQL {
	CUST_FILE_UPLOAD;
	
	@Override
	public String toString() {
		StringBuffer query= new StringBuffer();		
	
		switch (this) {
		case CUST_FILE_UPLOAD:
			query.append("INSERT INTO IMAGE(IMAGE_ID, IMGNAME, IMGEXTENTION, OWNER) VALUES(IMAGE_ID.NEXTVAL, ?, ?, ?)");
					break;
		
		default:
			break;
		}
		return query.toString();
	}
}