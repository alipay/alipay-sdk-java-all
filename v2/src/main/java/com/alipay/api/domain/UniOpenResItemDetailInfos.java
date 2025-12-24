package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合开通结果项详情信息
 *
 * @author auto create
 * @since 1.0, 2025-11-05 17:57:46
 */
public class UniOpenResItemDetailInfos extends AlipayObject {

	private static final long serialVersionUID = 5855233597824874195L;

	/**
	 * 当default_settle_type为alipayWallet时，default_settle_target为钱包id；当default_settle_type为alipayAccount时，default_settle_target为支付宝登录号（脱敏）
	 */
	@ApiField("default_settle_target")
	private String defaultSettleTarget;

	/**
	 * 默认结算账号类型。
alipayWallet：支付宝钱包
alipayAccount：支付宝登录号
	 */
	@ApiField("default_settle_type")
	private String defaultSettleType;

	/**
	 * PERSONAL:个人用户（默认值） PERSONAL_MERCHANTS：个人商户
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 个人收款方smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 进件申请单id，与开通时传入的一致
	 */
	@ApiField("sub_merchant_order_id")
	private String subMerchantOrderId;

	/**
	 * 用户钱包ID，需要商户保存起来
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getDefaultSettleTarget() {
		return this.defaultSettleTarget;
	}
	public void setDefaultSettleTarget(String defaultSettleTarget) {
		this.defaultSettleTarget = defaultSettleTarget;
	}

	public String getDefaultSettleType() {
		return this.defaultSettleType;
	}
	public void setDefaultSettleType(String defaultSettleType) {
		this.defaultSettleType = defaultSettleType;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSubMerchantOrderId() {
		return this.subMerchantOrderId;
	}
	public void setSubMerchantOrderId(String subMerchantOrderId) {
		this.subMerchantOrderId = subMerchantOrderId;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
