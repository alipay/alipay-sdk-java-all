package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz cell 模型
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:47
 */
public class NimitzCell extends AlipayObject {

	private static final long serialVersionUID = 6267577865311292844L;

	/**
	 * Boolean 值
	 */
	@ApiField("b_val")
	private Boolean bVal;

	/**
	 * Double 值
	 */
	@ApiField("d_val")
	private String dVal;

	/**
	 * Int 值
	 */
	@ApiField("i_64_val")
	private String i64Val;

	/**
	 * String 值
	 */
	@ApiField("s_val")
	private String sVal;

	public Boolean getbVal() {
		return this.bVal;
	}
	public void setbVal(Boolean bVal) {
		this.bVal = bVal;
	}

	public String getdVal() {
		return this.dVal;
	}
	public void setdVal(String dVal) {
		this.dVal = dVal;
	}

	public String getI64Val() {
		return this.i64Val;
	}
	public void setI64Val(String i64Val) {
		this.i64Val = i64Val;
	}

	public String getsVal() {
		return this.sVal;
	}
	public void setsVal(String sVal) {
		this.sVal = sVal;
	}

}
