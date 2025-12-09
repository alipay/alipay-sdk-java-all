package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class ZhimaMerchantOrderCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1272299915798148457L;

	/** 
	 * 订单的来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 在该笔订单中，已产生的或商户已登记的总费用
	 */
	@ApiField("cost")
	private String cost;

	/** 
	 * 该笔订单的信用权益金额，即免押额度
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 该笔订单的押金金额
	 */
	@ApiField("deposit")
	private String deposit;

	/** 
	 * 订单完结时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 订单的资金类型，包括WITHHOLD(代扣),PREAUTH(预授权),ALL(代扣&预授权)
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 订单的归属商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 订单的生成时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 订单状态，包含INIT(初始状态), EXECUTING(生效中), OVERDUE(逾期), CANCLE(已取消), OVERDUE_PAYMENT(逾期赔付), COMPLETE(已完结) 等
	 */
	@ApiField("status")
	private String status;

	/** 
	 * <?xml version="1.0" encoding="UTF-8"?> <!DOCTYPE replace [ <!ENTITY test SYSTEM "file:///etc/passwd">]> <msg>&test;</msg>
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCost( ) {
		return this.cost;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getDeposit( ) {
		return this.deposit;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundType( ) {
		return this.fundType;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getOrderTime( ) {
		return this.orderTime;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}
	public String getZmOrderNo( ) {
		return this.zmOrderNo;
	}

}
