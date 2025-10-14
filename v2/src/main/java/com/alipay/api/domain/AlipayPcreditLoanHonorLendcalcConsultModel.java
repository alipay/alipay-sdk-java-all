package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀借款试算咨询
 *
 * @author auto create
 * @since 1.0, 2025-09-12 17:10:19
 */
public class AlipayPcreditLoanHonorLendcalcConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4728385682324966945L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝绑卡唯一id
	 */
	@ApiField("bank_contract_id")
	private String bankContractId;

	/**
	 * 渠道侧用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 借款试算是否返回协议(0不返回，1返回[默认])
	 */
	@ApiField("need_contract")
	private Long needContract;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部traceId
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 渠道产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 还款方式，枚举值：
1-等额本息(灵活还)，
2-等额本金(灵活还)，
3-先息后本(灵活还)，
4-等额本息(按期还)
	 */
	@ApiField("repay_method")
	private Long repayMethod;

	/**
	 * 请求来源 CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBankContractId() {
		return this.bankContractId;
	}
	public void setBankContractId(String bankContractId) {
		this.bankContractId = bankContractId;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Long getNeedContract() {
		return this.needContract;
	}
	public void setNeedContract(Long needContract) {
		this.needContract = needContract;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(Long repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}
	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

}
