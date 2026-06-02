package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 福利子钱包余额
 *
 * @author auto create
 * @since 1.0, 2026-04-22 16:41:18
 */
public class AccountBalanceInfo extends AlipayObject {

	private static final long serialVersionUID = 2164696846135434641L;

	/**
	 * 费控id
	 */
	@ApiField("rule_group_id")
	private String ruleGroupId;

	/**
	 * 福利资产余额，单位CNY
	 */
	@ApiField("welfare_asset_balance")
	private String welfareAssetBalance;

	/**
	 * 福利资产编号
	 */
	@ApiField("welfare_asset_id")
	private String welfareAssetId;

	public String getRuleGroupId() {
		return this.ruleGroupId;
	}
	public void setRuleGroupId(String ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
	}

	public String getWelfareAssetBalance() {
		return this.welfareAssetBalance;
	}
	public void setWelfareAssetBalance(String welfareAssetBalance) {
		this.welfareAssetBalance = welfareAssetBalance;
	}

	public String getWelfareAssetId() {
		return this.welfareAssetId;
	}
	public void setWelfareAssetId(String welfareAssetId) {
		this.welfareAssetId = welfareAssetId;
	}

}
