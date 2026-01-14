package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合开通请求项详情信息
 *
 * @author auto create
 * @since 1.0, 2025-11-05 17:00:06
 */
public class UniOpenReqItemDetailInfos extends AlipayObject {

	private static final long serialVersionUID = 1323884872572497877L;

	/**
	 * default_settle_type为空，默认为alipayAccount，结算账号默认为支付宝余额户；
当default_settle_type为alipayWallet时，default_settle_target为钱包id；
	 */
	@ApiField("default_settle_target")
	private String defaultSettleTarget;

	/**
	 * 默认结算账号类型。
开通个人收款时，若聚合开通钱包，则无需填写该参数，默认会将钱包设置为默认结算账号
若钱包已经开通，仅需开通个人收款且需要将钱包设置为默认结算账号需传入该值为alipayWallet
	 */
	@ApiField("default_settle_type")
	private String defaultSettleType;

	/**
	 * PERSONAL:个人用户（默认值） PERSONAL_MERCHANTS：个人商户
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 钱包提现时平台是否需要收取提现手续费
	 */
	@ApiField("need_withdraw_platform_fee")
	private String needWithdrawPlatformFee;

	/**
	 * 进件申请单id，与接口中传入的申请单id一致
	 */
	@ApiField("sub_merchant_order_id")
	private String subMerchantOrderId;

	/**
	 * 固定值
	 */
	@ApiField("wallet_biz_product")
	private String walletBizProduct;

	/**
	 * 固定值
	 */
	@ApiField("wallet_biz_scene")
	private String walletBizScene;

	/**
	 * 钱包模版id
调用alipay.fund.wallet.template.create接口返回的wallet_template_id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

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

	public String getNeedWithdrawPlatformFee() {
		return this.needWithdrawPlatformFee;
	}
	public void setNeedWithdrawPlatformFee(String needWithdrawPlatformFee) {
		this.needWithdrawPlatformFee = needWithdrawPlatformFee;
	}

	public String getSubMerchantOrderId() {
		return this.subMerchantOrderId;
	}
	public void setSubMerchantOrderId(String subMerchantOrderId) {
		this.subMerchantOrderId = subMerchantOrderId;
	}

	public String getWalletBizProduct() {
		return this.walletBizProduct;
	}
	public void setWalletBizProduct(String walletBizProduct) {
		this.walletBizProduct = walletBizProduct;
	}

	public String getWalletBizScene() {
		return this.walletBizScene;
	}
	public void setWalletBizScene(String walletBizScene) {
		this.walletBizScene = walletBizScene;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
