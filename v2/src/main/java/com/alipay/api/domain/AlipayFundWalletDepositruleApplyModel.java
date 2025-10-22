package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包充值规则申请
 *
 * @author auto create
 * @since 1.0, 2025-05-07 11:18:09
 */
public class AlipayFundWalletDepositruleApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4366456837864759424L;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 充值后通知地址
	 */
	@ApiField("deposit_notify_url")
	private String depositNotifyUrl;

	/**
	 * 充值规则业务扩展参数
	 */
	@ApiField("deposit_rule_biz_param")
	private DepositRuleBizParam depositRuleBizParam;

	/**
	 * 充值规则类型
	 */
	@ApiField("deposit_rule_type")
	private String depositRuleType;

	/**
	 * 外部请求业务单号，保持幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 充值规则申请主体
	 */
	@ApiField("principal_info")
	private ParticipantForm principalInfo;

	/**
	 * 场景钱包
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

	public String getDepositNotifyUrl() {
		return this.depositNotifyUrl;
	}
	public void setDepositNotifyUrl(String depositNotifyUrl) {
		this.depositNotifyUrl = depositNotifyUrl;
	}

	public DepositRuleBizParam getDepositRuleBizParam() {
		return this.depositRuleBizParam;
	}
	public void setDepositRuleBizParam(DepositRuleBizParam depositRuleBizParam) {
		this.depositRuleBizParam = depositRuleBizParam;
	}

	public String getDepositRuleType() {
		return this.depositRuleType;
	}
	public void setDepositRuleType(String depositRuleType) {
		this.depositRuleType = depositRuleType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ParticipantForm getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(ParticipantForm principalInfo) {
		this.principalInfo = principalInfo;
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
