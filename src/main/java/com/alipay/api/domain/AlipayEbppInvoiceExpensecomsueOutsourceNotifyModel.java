package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部员工消费通知
 *
 * @author auto create
 * @since 1.0, 2021-07-09 19:25:36
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8412597539858496389L;

	/**
	 * 企业码账号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 消费金额（单位：分）
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
	 * 0 员工支付宝账号，1 员工公司员工号
	 */
	@ApiField("employee_id_type")
	private Long employeeIdType;

	/**
	 * 扩展参数
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 0 是扣款，1 退款
	 */
	@ApiField("is_off_set")
	private Long isOffSet;

	/**
	 * 外部唯一交易ID（幂等）
	 */
	@ApiField("out_source_id")
	private String outSourceId;

	/**
	 * 调用者身份（道安- DAO_AN）
	 */
	@ApiField("platform")
	private String platform;

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

}
