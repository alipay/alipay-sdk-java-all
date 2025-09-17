package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款码链接申请
 *
 * @author auto create
 * @since 1.0, 2025-07-14 13:42:33
 */
public class AlipayFundWalletPayurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1515847799438923732L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付参数, 当前仅支持WalletPriority（红包 > 钱包 > 主支付工具）
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
