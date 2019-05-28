package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值订单明细
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:06
 */
public class RechargeDetail extends AlipayObject {

	private static final long serialVersionUID = 8817292415878616152L;

	/**
	 * 真实资金，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 面额，单位元
	 */
	@ApiField("assetamount")
	private String assetamount;

	/**
	 * 内部订单号
	 */
	@ApiField("orderno")
	private String orderno;

	/**
	 * 外部订单号
	 */
	@ApiField("outorderno")
	private String outorderno;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetamount() {
		return this.assetamount;
	}
	public void setAssetamount(String assetamount) {
		this.assetamount = assetamount;
	}

	public String getOrderno() {
		return this.orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getOutorderno() {
		return this.outorderno;
	}
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

}
