package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2019-10-21 17:48:31
 */
public class GavintestNewLeveaOne extends AlipayObject {

	private static final long serialVersionUID = 6446737215842257826L;

	/**
	 * 2
	 */
	@ApiField("boolen")
	private Boolean boolen;

	/**
	 * 21
	 */
	@ApiListField("ces")
	@ApiField("number")
	private List<Long> ces;

	/**
	 * 12
	 */
	@ApiField("des")
	private String des;

	/**
	 * 1
	 */
	@ApiListField("str")
	@ApiField("string")
	private List<String> str;

	public Boolean getBoolen() {
		return this.boolen;
	}
	public void setBoolen(Boolean boolen) {
		this.boolen = boolen;
	}

	public List<Long> getCes() {
		return this.ces;
	}
	public void setCes(List<Long> ces) {
		this.ces = ces;
	}

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public List<String> getStr() {
		return this.str;
	}
	public void setStr(List<String> str) {
		this.str = str;
	}

}
