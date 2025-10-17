package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-14 19:17:39
 */
public class AlipayEbppIndustrySupervisionOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3439281669121582924L;

	/** 
	 * 冻资单地址
	 */
	@ApiField("alipay_order_detail_url")
	private String alipayOrderDetailUrl;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 订单金额（整数，单位：分）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 冻资订单所需用户签署协议列表
	 */
	@ApiListField("authorization_list")
	@ApiField("string")
	private List<String> authorizationList;

	/** 
	 * 默认CNY
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 冻资订单剩余冻资金额（整数，单位：分）
	 */
	@ApiField("order_balance")
	private String orderBalance;

	/** 
	 * 冻资单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部请求下单时传入订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 外部商户订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 已缴金额（整数，单位：分）
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/** 
	 * 订单转出金额（整数，单位：分）
	 */
	@ApiField("transfer_out_amount")
	private String transferOutAmount;

	/** 
	 * 待缴金额（整数，单位：分）
	 */
	@ApiField("unpaid_amount")
	private String unpaidAmount;

	public void setAlipayOrderDetailUrl(String alipayOrderDetailUrl) {
		this.alipayOrderDetailUrl = alipayOrderDetailUrl;
	}
	public String getAlipayOrderDetailUrl( ) {
		return this.alipayOrderDetailUrl;
	}

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setAuthorizationList(List<String> authorizationList) {
		this.authorizationList = authorizationList;
	}
	public List<String> getAuthorizationList( ) {
		return this.authorizationList;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOrderBalance(String orderBalance) {
		this.orderBalance = orderBalance;
	}
	public String getOrderBalance( ) {
		return this.orderBalance;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPaidAmount( ) {
		return this.paidAmount;
	}

	public void setTransferOutAmount(String transferOutAmount) {
		this.transferOutAmount = transferOutAmount;
	}
	public String getTransferOutAmount( ) {
		return this.transferOutAmount;
	}

	public void setUnpaidAmount(String unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	public String getUnpaidAmount( ) {
		return this.unpaidAmount;
	}

}
