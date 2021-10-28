package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部员工消费通知
 *
 * @author auto create
 * @since 1.0, 2021-10-14 15:58:39
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8633699267332459778L;

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
	 * 消费金额（单位：分）正整数，金额必须大于0， 200 表示金额为2元
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
	 * 定制化字段传入,当前无约定规则（例如：部分调用方传入餐补餐期-中餐（L），晚餐(D)）
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
	 * 调用者身份（道安- DAO_AN，企业福利平台WELFARE_PLATFORM），接入接口分配的身份标记
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 退款流水ID，多次退款此ID不同，退款必须传入
	 */
	@ApiField("relate_no")
	private String relateNo;

	/**
	 * 制度id
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
