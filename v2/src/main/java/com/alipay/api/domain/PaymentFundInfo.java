package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付资金明细
 *
 * @author auto create
 * @since 1.0, 2025-06-17 23:47:48
 */
public class PaymentFundInfo extends AlipayObject {

	private static final long serialVersionUID = 6378368376245357332L;

	/**
	 * 收款方资产信息
	 */
	@ApiField("payee_asset_info")
	private PaymentAssetInfo payeeAssetInfo;

	/**
	 * 付款方资产信息
	 */
	@ApiField("payer_asset_info")
	private PaymentAssetInfo payerAssetInfo;

	public PaymentAssetInfo getPayeeAssetInfo() {
		return this.payeeAssetInfo;
	}
	public void setPayeeAssetInfo(PaymentAssetInfo payeeAssetInfo) {
		this.payeeAssetInfo = payeeAssetInfo;
	}

	public PaymentAssetInfo getPayerAssetInfo() {
		return this.payerAssetInfo;
	}
	public void setPayerAssetInfo(PaymentAssetInfo payerAssetInfo) {
		this.payerAssetInfo = payerAssetInfo;
	}

}
