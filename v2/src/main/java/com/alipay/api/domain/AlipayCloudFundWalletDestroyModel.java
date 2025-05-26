package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包销户
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:53:00
 */
public class AlipayCloudFundWalletDestroyModel extends AlipayObject {

	private static final long serialVersionUID = 8212881862326864936L;

	/**
	 * 单位元，退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户id
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
