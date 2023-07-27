package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试参数校验接口
 *
 * @author auto create
 * @since 1.0, 2023-07-24 11:29:33
 */
public class AlipayOpenOperationOpenbizmockTestparameterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7595681561543897143L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 1
	 */
	@ApiField("e")
	private Boolean e;

	/**
	 * 1
	 */
	@ApiField("f")
	private String f;

	/**
	 * 1
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 1
	 */
	@ApiField("price")
	private String price;

	/**
	 * 1
	 */
	@ApiListField("ss_list")
	@ApiField("string")
	private List<String> ssList;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getE() {
		return this.e;
	}
	public void setE(Boolean e) {
		this.e = e;
	}

	public String getF() {
		return this.f;
	}
	public void setF(String f) {
		this.f = f;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<String> getSsList() {
		return this.ssList;
	}
	public void setSsList(List<String> ssList) {
		this.ssList = ssList;
	}

}
