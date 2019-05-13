package pers.smalltown.SpringBootTest.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    BigDecimal userid;
    String username;
    String password;
    int status;

	@Override
	public String toString() {
		return "id="+userid+",name="+username+",pwd="+password+",status:"+status;
	}
    
}
