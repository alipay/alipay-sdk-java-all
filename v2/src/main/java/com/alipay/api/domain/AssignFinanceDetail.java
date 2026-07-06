package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AssignFinanceDetail extends AlipayObject {

	private static final long serialVersionUID = 4414154461566249846L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 商户号
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 分配动作：
"ASSIGN"-转入
"CUT"-转出
	 */
	@ApiField("apply_type_str")
	private String applyTypeStr;

	/**
	 * 分配金额(元)
	 */
	@ApiField("format_available_amount")
	private String formatAvailableAmount;

	/**
	 * 普通红包(元)
	 */
	@ApiField("format_benefit_amount")
	private String formatBenefitAmount;

	/**
	 * 授信(元)
	 */
	@ApiField("format_credit_amount")
	private String formatCreditAmount;

	/**
	 * 流量红包(元)
	 */
	@ApiField("format_marketing_amount")
	private String formatMarketingAmount;

	/**
	 * 现金(元)
	 */
	@ApiField("format_principal_amount")
	private String formatPrincipalAmount;

	/**
	 * 商家id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 商家名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 钱包类型名称：
通用钱包-INTELLIGENT
外投钱包-XAB_BP
	 */
	@ApiField("scene_code_str")
	private String sceneCodeStr;

	/**
	 * 分配时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private String time;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getApplyTypeStr() {
		return this.applyTypeStr;
	}
	public void setApplyTypeStr(String applyTypeStr) {
		this.applyTypeStr = applyTypeStr;
	}

	public String getFormatAvailableAmount() {
		return this.formatAvailableAmount;
	}
	public void setFormatAvailableAmount(String formatAvailableAmount) {
		this.formatAvailableAmount = formatAvailableAmount;
	}

	public String getFormatBenefitAmount() {
		return this.formatBenefitAmount;
	}
	public void setFormatBenefitAmount(String formatBenefitAmount) {
		this.formatBenefitAmount = formatBenefitAmount;
	}

	public String getFormatCreditAmount() {
		return this.formatCreditAmount;
	}
	public void setFormatCreditAmount(String formatCreditAmount) {
		this.formatCreditAmount = formatCreditAmount;
	}

	public String getFormatMarketingAmount() {
		return this.formatMarketingAmount;
	}
	public void setFormatMarketingAmount(String formatMarketingAmount) {
		this.formatMarketingAmount = formatMarketingAmount;
	}

	public String getFormatPrincipalAmount() {
		return this.formatPrincipalAmount;
	}
	public void setFormatPrincipalAmount(String formatPrincipalAmount) {
		this.formatPrincipalAmount = formatPrincipalAmount;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneCodeStr() {
		return this.sceneCodeStr;
	}
	public void setSceneCodeStr(String sceneCodeStr) {
		this.sceneCodeStr = sceneCodeStr;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
