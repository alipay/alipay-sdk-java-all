package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-预付申请单创建
 *
 * @author auto create
 * @since 1.0, 2022-07-21 17:39:50
 */
public class MybankCreditSupplychainPrepaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6319759476675681996L;

	/**
	 * 买家身份信息。
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 贷款支付金额，单位人民币元。
	 */
	@ApiField("loan_pay_amount")
	private String loanPayAmount;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 客户自付金额，一般为订单首付，单位人民币元。
	 */
	@ApiField("self_pay_amount")
	private String selfPayAmount;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getLoanPayAmount() {
		return this.loanPayAmount;
	}
	public void setLoanPayAmount(String loanPayAmount) {
		this.loanPayAmount = loanPayAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSelfPayAmount() {
		return this.selfPayAmount;
	}
	public void setSelfPayAmount(String selfPayAmount) {
		this.selfPayAmount = selfPayAmount;
	}

}
