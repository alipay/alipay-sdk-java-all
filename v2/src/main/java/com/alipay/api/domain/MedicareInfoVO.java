package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保报销信息
 *
 * @author auto create
 * @since 1.0, 2024-08-29 15:36:40
 */
public class MedicareInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1629467959638972384L;

	/**
	 * 医保个账金额
	 */
	@ApiField("mi_personal_amount")
	private Long miPersonalAmount;

	/**
	 * 医保统筹金额
	 */
	@ApiField("mi_pool_amount")
	private Long miPoolAmount;

	/**
	 * 医保自付金额
	 */
	@ApiField("mi_self_amount")
	private Long miSelfAmount;

	public Long getMiPersonalAmount() {
		return this.miPersonalAmount;
	}
	public void setMiPersonalAmount(Long miPersonalAmount) {
		this.miPersonalAmount = miPersonalAmount;
	}

	public Long getMiPoolAmount() {
		return this.miPoolAmount;
	}
	public void setMiPoolAmount(Long miPoolAmount) {
		this.miPoolAmount = miPoolAmount;
	}

	public Long getMiSelfAmount() {
		return this.miSelfAmount;
	}
	public void setMiSelfAmount(Long miSelfAmount) {
		this.miSelfAmount = miSelfAmount;
	}

}
