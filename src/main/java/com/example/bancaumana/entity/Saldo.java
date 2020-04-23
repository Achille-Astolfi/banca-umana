package com.example.bancaumana.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author Stefano
 *
 */
public class Saldo {
 private String nConto;
 private Date dataSaldo;
 private BigDecimal impSaldo;
 
public String getnConto() {
	return nConto;
}
public void setnConto(String nConto) {
	this.nConto = nConto;
}
public Date getDataSaldo() {
	return dataSaldo;
}
public void setDataSaldo(Date dataSaldo) {
	this.dataSaldo = dataSaldo;
}
public BigDecimal getImpSaldo() {
	return impSaldo;
}
public void setImpSaldo(BigDecimal impSaldo) {
	this.impSaldo = impSaldo;
}
 
}
