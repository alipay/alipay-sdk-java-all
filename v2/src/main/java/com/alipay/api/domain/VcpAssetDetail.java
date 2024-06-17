package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产详情
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:20
 */
public class VcpAssetDetail extends AlipayObject {

	private static final long serialVersionUID = 7346682638782485135L;

	/**
	 * 资金金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产金额
	 */
	@ApiField("assetamount")
	private String assetamount;

	/**
	 * 正常充值
	 */
	@ApiField("assetusechannel")
	private String assetusechannel;

	/**
	 * 收款用户id
	 */
	@ApiField("settleuserid")
	private String settleuserid;

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

	public String getAssetusechannel() {
		return this.assetusechannel;
	}
	public void setAssetusechannel(String assetusechannel) {
		this.assetusechannel = assetusechannel;
	}

	public String getSettleuserid() {
		return this.settleuserid;
	}
	public void setSettleuserid(String settleuserid) {
		this.settleuserid = settleuserid;
	}

}
