package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.housing.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-26 16:27:11
 */
public class AlipayEbppIndustryRentHousingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4477519374733547552L;

	/** 
	 * 账单中公积金支付的总金额，单位(元)精确到分
	 */
	@ApiField("acc_amount")
	private String accAmount;

	/** 
	 * 租房平台请求支付时的预创单编号
	 */
	@ApiField("biz_seq")
	private String bizSeq;

	/** 
	 * 订单状态说明
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 公积金中心的租房提取编号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/** 
	 * 账单中自付费金额，单位(元)精确到分
	 */
	@ApiField("self_amount")
	private String selfAmount;

	/** 
	 * 租房平台房源租赁账单标题
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 租房账单的总金额，单位(元)精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAccAmount(String accAmount) {
		this.accAmount = accAmount;
	}
	public String getAccAmount( ) {
		return this.accAmount;
	}

	public void setBizSeq(String bizSeq) {
		this.bizSeq = bizSeq;
	}
	public String getBizSeq( ) {
		return this.bizSeq;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

	public void setSelfAmount(String selfAmount) {
		this.selfAmount = selfAmount;
	}
	public String getSelfAmount( ) {
		return this.selfAmount;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
