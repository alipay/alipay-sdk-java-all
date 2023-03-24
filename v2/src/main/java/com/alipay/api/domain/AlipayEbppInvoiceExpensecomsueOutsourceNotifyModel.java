package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部员工消费通知
 *
 * @author auto create
 * @since 1.0, 2023-02-27 20:03:45
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1714724941124173811L;

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
特殊说明：单位为分的正整数
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 交易发生时间
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 切换open_id前请使用此字段：员工ID
特殊说明：根据员工账号类型来决定为员工UID、员工工号、员工企业码ID或者员工手机号
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 员工账号类型
枚举值：
0（员工支付宝账号/open_id）
1（ 员工工号）
2（员工企业码id）
3（员工手机号）
	 */
	@ApiField("employee_id_type")
	private Long employeeIdType;

	/**
	 * 切换open_id后请使用此字段：员工ID 特殊说明：根据员工账号类型来决定为open_id、员工工号、员工企业码ID或者员工手机号
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 拓展参数，如果控制消费的城市，可传入消费城市的adcode，如需使用，请联系技术支持
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 交易类型
枚举值：
0（扣款）
1（退款）
	 */
	@ApiField("is_off_set")
	private Long isOffSet;

	/**
	 * 外部交易支付单号
	 */
	@ApiField("out_source_id")
	private String outSourceId;

	/**
	 * 外部平台编码（联系技术支持分配）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 外部交易退款单号
特殊说明：交易类型为退款的时候传入，多次退款传入不同的退款单号
	 */
	@ApiField("relate_no")
	private String relateNo;

	/**
	 * 费控规则ID
特殊说明：该交易绑定的支付宝费控规则ID
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
