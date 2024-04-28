package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2018-11-12 15:38:41
 */
public class BudgetVO extends AlipayObject {

	private static final long serialVersionUID = 5765853463471551465L;

	/**
	 * 应还总金额 = 正常本金+逾期本金+正常利息+逾期利息+逾期本金罚息+逾期利息罚息
	 */
	@ApiField("need_repay_total")
	private String needRepayTotal;

	/**
	 * 正常利息
	 */
	@ApiField("nom_int")
	private String nomInt;

	/**
	 * 正常本金
	 */
	@ApiField("nom_prin")
	private String nomPrin;

	/**
	 * 逾期利息
	 */
	@ApiField("ovd_int")
	private String ovdInt;

	/**
	 * 逾期利息罚息
	 */
	@ApiField("ovd_int_pen_int")
	private String ovdIntPenInt;

	/**
	 * 逾期本金
	 */
	@ApiField("ovd_prin")
	private String ovdPrin;

	/**
	 * 逾期本金罚息
	 */
	@ApiField("ovd_prin_pen_int")
	private String ovdPrinPenInt;

	public String getNeedRepayTotal() {
		return this.needRepayTotal;
	}
	public void setNeedRepayTotal(String needRepayTotal) {
		this.needRepayTotal = needRepayTotal;
	}

	public String getNomInt() {
		return this.nomInt;
	}
	public void setNomInt(String nomInt) {
		this.nomInt = nomInt;
	}

	public String getNomPrin() {
		return this.nomPrin;
	}
	public void setNomPrin(String nomPrin) {
		this.nomPrin = nomPrin;
	}

	public String getOvdInt() {
		return this.ovdInt;
	}
	public void setOvdInt(String ovdInt) {
		this.ovdInt = ovdInt;
	}

	public String getOvdIntPenInt() {
		return this.ovdIntPenInt;
	}
	public void setOvdIntPenInt(String ovdIntPenInt) {
		this.ovdIntPenInt = ovdIntPenInt;
	}

	public String getOvdPrin() {
		return this.ovdPrin;
	}
	public void setOvdPrin(String ovdPrin) {
		this.ovdPrin = ovdPrin;
	}

	public String getOvdPrinPenInt() {
		return this.ovdPrinPenInt;
	}
	public void setOvdPrinPenInt(String ovdPrinPenInt) {
		this.ovdPrinPenInt = ovdPrinPenInt;
	}

}
