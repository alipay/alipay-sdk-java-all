package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部员工消费通知
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:05:35
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1454847378984218634L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 消费金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 交易发生时间
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工账号类型
	 */
	@ApiField("employee_id_type")
	private Long employeeIdType;

	/**
	 * 员工开放id
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 拓展参数
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 交易类型
	 */
	@ApiField("is_off_set")
	private Long isOffSet;

	/**
	 * 外部交易支付单号
	 */
	@ApiField("out_source_id")
	private String outSourceId;

	/**
	 * 外部平台编码
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 外部交易退款单号
	 */
	@ApiField("relate_no")
	private String relateNo;

	/**
	 * 费控规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getDealTime() {
		return this.dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Long getEmployeeIdType() {
		return this.employeeIdType;
	}
	public void setEmployeeIdType(Long employeeIdType) {
		this.employeeIdType = employeeIdType;
	}

	public String getEmployeeOpenId() {
		return this.employeeOpenId;
	}
	public void setEmployeeOpenId(String employeeOpenId) {
		this.employeeOpenId = employeeOpenId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public Long getIsOffSet() {
		return this.isOffSet;
	}
	public void setIsOffSet(Long isOffSet) {
		this.isOffSet = isOffSet;
	}

	public String getOutSourceId() {
		return this.outSourceId;
	}
	public void setOutSourceId(String outSourceId) {
		this.outSourceId = outSourceId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getRelateNo() {
		return this.relateNo;
	}
	public void setRelateNo(String relateNo) {
		this.relateNo = relateNo;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

}
