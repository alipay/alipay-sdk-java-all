package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保报销信息
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:55:20
 */
public class MedicareInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1357423778857883964L;

	/**
	 * 医保个账金额 当前字段已废弃(字段类型修改为price)
	 */
	@ApiField("mi_personal_amount")
	@Deprecated
	private Long miPersonalAmount;

	/**
	 * 医保个账金额
	 */
	@ApiField("mi_personal_amt")
	private String miPersonalAmt;

	/**
	 * 医保统筹金额 当前字段已废弃(字段类型修改为price)
	 */
	@ApiField("mi_pool_amount")
	@Deprecated
	private Long miPoolAmount;

	/**
	 * 医保统筹金额
	 */
	@ApiField("mi_pool_amt")
	private String miPoolAmt;

	/**
	 * 医保自付金额 当前字段已废弃(字段类型修改为price)
	 */
	@ApiField("mi_self_amount")
	@Deprecated
	private Long miSelfAmount;

	/**
	 * 自付金额
	 */
	@ApiField("mi_self_amt")
	private String miSelfAmt;

	public Long getMiPersonalAmount() {
		return this.miPersonalAmount;
	}
	public void setMiPersonalAmount(Long miPersonalAmount) {
		this.miPersonalAmount = miPersonalAmount;
	}

	public String getMiPersonalAmt() {
		return this.miPersonalAmt;
	}
	public void setMiPersonalAmt(String miPersonalAmt) {
		this.miPersonalAmt = miPersonalAmt;
	}

	public Long getMiPoolAmount() {
		return this.miPoolAmount;
	}
	public void setMiPoolAmount(Long miPoolAmount) {
		this.miPoolAmount = miPoolAmount;
	}

	public String getMiPoolAmt() {
		return this.miPoolAmt;
	}
	public void setMiPoolAmt(String miPoolAmt) {
		this.miPoolAmt = miPoolAmt;
	}

	public Long getMiSelfAmount() {
		return this.miSelfAmount;
	}
	public void setMiSelfAmount(Long miSelfAmount) {
		this.miSelfAmount = miSelfAmount;
	}

	public String getMiSelfAmt() {
		return this.miSelfAmt;
	}
	public void setMiSelfAmt(String miSelfAmt) {
		this.miSelfAmt = miSelfAmt;
	}

}
