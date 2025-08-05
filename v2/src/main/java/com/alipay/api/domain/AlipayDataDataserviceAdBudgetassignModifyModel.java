package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金划拨转入接口
 *
 * @author auto create
 * @since 1.0, 2025-03-18 15:56:11
 */
public class AlipayDataDataserviceAdBudgetassignModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8145488944881818845L;

	/**
	 * 后付金额，单位：元，支持两位小数
	 */
	@ApiField("after_principal_amount_yuan")
	private String afterPrincipalAmountYuan;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串。登录校验和可反查出user_id。
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 划拨金额，单位：元，支持两位小数
	 */
	@ApiField("amount_yuan")
	private String amountYuan;

	/**
	 * 划拨模式：
"CUSTOM" - 自定义分配，该模式下，根据marketing_amount_yuan, benefit_amount, after_principal_amount_yuan, principal_amount_yuan分配。
"AUTO" - 自动分配，该模式下根据入参amount_yuan自动分配金额
	 */
	@ApiField("assign_mod")
	private String assignMod;

	/**
	 * 权益金额，单位：元，支持两位小数
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 划拨场景编码目前固定：INTELLIGENT- 通用钱包
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 权限token,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 营销金额，单位：元，支持两位小数
	 */
	@ApiField("marketing_amount_yuan")
	private String marketingAmountYuan;

	/**
	 * 现金金额，单位：元，支持两位小数
	 */
	@ApiField("principal_amount_yuan")
	private String principalAmountYuan;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getAfterPrincipalAmountYuan() {
		return this.afterPrincipalAmountYuan;
	}
	public void setAfterPrincipalAmountYuan(String afterPrincipalAmountYuan) {
		this.afterPrincipalAmountYuan = afterPrincipalAmountYuan;
	}

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getAmountYuan() {
		return this.amountYuan;
	}
	public void setAmountYuan(String amountYuan) {
		this.amountYuan = amountYuan;
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

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getMarketingAmountYuan() {
		return this.marketingAmountYuan;
	}
	public void setMarketingAmountYuan(String marketingAmountYuan) {
		this.marketingAmountYuan = marketingAmountYuan;
	}

	public String getPrincipalAmountYuan() {
		return this.principalAmountYuan;
	}
	public void setPrincipalAmountYuan(String principalAmountYuan) {
		this.principalAmountYuan = principalAmountYuan;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
