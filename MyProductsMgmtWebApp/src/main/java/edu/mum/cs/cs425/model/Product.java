 package edu.mum.cs.cs425.model;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "productdb")
public class Product {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
//   @Column(name = "product_id")
   private long id;
   
   @Column(name = "product_Number")
   private long ProductNumber;
	@Column(name = "name")
    private  String name;
    @Column(name = "unit_price")
    private float unitPrice;
    
    @DateTimeFormat(pattern= "mm/dd/yyyy")
    @Column(name = "date_mfd")
    private Date dateMfd;

    public Product(long ProductNumber, String name, float unitPrice,Date dateMfd) {
        this.ProductNumber = ProductNumber;
        this.name = name;
        this.unitPrice = unitPrice;
        this.dateMfd=dateMfd;
    }

    public Product() {
    }

	public long getId() {
		return id;
	}

	public void setId(long pid) {
		this.id = pid;
	}

	public long getProductNumber() {
		return ProductNumber;
	}

	public void setProductNumber(long productNumber) {
		ProductNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDateMfd() {
		return dateMfd;
	}

	public void setDateMfd(Date dateMfd) {
		this.dateMfd = dateMfd;
	}
    
    

}
