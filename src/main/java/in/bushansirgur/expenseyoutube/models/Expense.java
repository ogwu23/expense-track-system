package in.bushansirgur.expenseyoutube.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_expenses")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Expense {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="description")
	private String expensename;
	
	private BigDecimal amount;
	
	private String note;
	
	@Column(name="created_at")
	private Long createdAt;

}
