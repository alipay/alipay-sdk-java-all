package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户发起提现
 *
 * @author auto create
 * @since 1.0, 2024-08-08 20:18:51
 */
public class AlipayFundWalletWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 4892714727767678447L;

	/**
	 * 提现金额，单位：元（人民币）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 定制化的提现策略
	 */
	@ApiField("extend_strategy")
	private ExtendStrategy extendStrategy;

	/**
	 * 提现标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/**
	 * 钱包营销规则
	 */
	@ApiField("wallet_marketing_rule")
	private WalletMarketingRule walletMarketingRule;

	/**
	 * 提现扩展参数
	 */
	@ApiField("withdraw_extend")
	private WithdrawExtend withdrawExtend;

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

	public ExtendStrategy getExtendStrategy() {
		return this.extendStrategy;
	}
	public void setExtendStrategy(ExtendStrategy extendStrategy) {
		this.extendStrategy = extendStrategy;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
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

	public WalletMarketingRule getWalletMarketingRule() {
		return this.walletMarketingRule;
	}
	public void setWalletMarketingRule(WalletMarketingRule walletMarketingRule) {
		this.walletMarketingRule = walletMarketingRule;
	}

	public WithdrawExtend getWithdrawExtend() {
		return this.withdrawExtend;
	}
	public void setWithdrawExtend(WithdrawExtend withdrawExtend) {
		this.withdrawExtend = withdrawExtend;
	}

}
