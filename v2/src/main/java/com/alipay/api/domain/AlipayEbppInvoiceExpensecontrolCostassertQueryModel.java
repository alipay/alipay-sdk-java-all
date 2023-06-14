package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消耗资产查询
 *
 * @author auto create
 * @since 1.0, 2023-04-13 09:59:33
 */
public class AlipayEbppInvoiceExpensecontrolCostassertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4171158693165368261L;

	/**
	 * 企业共同账户id，和授权签约协议号共同使用。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 描述：支付宝交易号，根据支付宝交易号查询交易消耗资产明细；
条件必选：（out_source_id、alipay_bill_no有且只能传一个）；
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 切换open_id后请使用此字段：员工ID 特殊说明：根据员工账号类型来决定为open_id、员工工号、员工企业码ID或者员工手机号
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 描述：外部唯一交易ID，同外部消费同步入参out_source_id，根据外部交易号查询交易消耗资产明细；
条件必选：（out_source_id、alipay_bill_no有且只能传一个）；
	 */
	@ApiField("out_source_id")
	private String outSourceId;

	/**
	 * 调用平台标识，需同外部消费同步接口一致
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

	public String getAlipayBillNo() {
		return this.alipayBillNo;
	}
	public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
