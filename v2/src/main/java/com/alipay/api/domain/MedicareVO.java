package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款订单中医保信息
 *
 * @author auto create
 * @since 1.0, 2024-08-28 19:28:41
 */
public class MedicareVO extends AlipayObject {

	private static final long serialVersionUID = 8566839862448195683L;

	/**
	 * 医保个账退款金额
	 */
	@ApiField("mi_personal_amount")
	private String miPersonalAmount;

	/**
	 * 医保统筹退款金额
	 */
	@ApiField("mi_pool_amount")
	private String miPoolAmount;

	/**
	 * 医保自付退款金额，单位：元
	 */
	@ApiField("mi_self_amount")
	private String miSelfAmount;

	public String getMiPersonalAmount() {
		return this.miPersonalAmount;
	}
	public void setMiPersonalAmount(String miPersonalAmount) {
		this.miPersonalAmount = miPersonalAmount;
	}

	public String getMiPoolAmount() {
		return this.miPoolAmount;
	}
	public void setMiPoolAmount(String miPoolAmount) {
		this.miPoolAmount = miPoolAmount;
	}

	public String getMiSelfAmount() {
		return this.miSelfAmount;
	}
	public void setMiSelfAmount(String miSelfAmount) {
		this.miSelfAmount = miSelfAmount;
	}

}
