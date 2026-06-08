package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转入划账接口
 *
 * @author auto create
 * @since 1.0, 2026-04-01 13:37:44
 */
public class AlipayDataDataserviceAdBudgetassignTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4396247712438517272L;

	/**
	 * 转出总金额（元）,支持两位小数
	 */
	@ApiField("amount_total")
	private String amountTotal;

	/**
	 * 分配模式：
自动分配-AUTO
自定义分配-CUSTOM
如选择了自定义分配，则必须输入现金金额、授信金额、流量红包金额、普通红包金额
	 */
	@ApiField("assign_mod")
	private String assignMod;

	/**
	 * 普通红包金额（元）,支持两位小数
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 钱包类型：
通用钱包-INTELLIGENT
外投钱包-XAB_BP
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 授信金额（元）,支持两位小数
	 */
	@ApiField("credit_principal_amount")
	private String creditPrincipalAmount;

	/**
	 * 流量红包金额（元）,支持两位小数
	 */
	@ApiField("marketing_amount")
	private String marketingAmount;

	/**
	 * 现金金额（元）,支持两位小数
	 */
	@ApiField("principal_amount")
	private String principalAmount;

	/**
	 * 根据此tag反查principal_id。转入方tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getAmountTotal() {
		return this.amountTotal;
	}
	public void setAmountTotal(String amountTotal) {
		this.amountTotal = amountTotal;
	}

	public String getAssignMod() {
		return this.assignMod;
	}
	public void setAssignMod(String assignMod) {
		this.assignMod = assignMod;
	}

	public String getBenefitAmount() {
		return this.benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCreditPrincipalAmount() {
		return this.creditPrincipalAmount;
	}
	public void setCreditPrincipalAmount(String creditPrincipalAmount) {
		this.creditPrincipalAmount = creditPrincipalAmount;
	}

	public String getMarketingAmount() {
		return this.marketingAmount;
	}
	public void setMarketingAmount(String marketingAmount) {
		this.marketingAmount = marketingAmount;
	}

	public String getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
