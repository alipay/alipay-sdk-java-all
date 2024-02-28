package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.order.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:01:59
 */
public class AlipayCommerceAcommunicationOrderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5479139896878749472L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 详情链接，一般作为客服使用
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/** 
	 * 订单金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态
TRADE_FINISHED交易成功
TRADE_CLOSED交易失败
WAIT_SELLER_SEND_GOODS买家付款成功充值进行中
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public Date getModifiedTime( ) {
		return this.modifiedTime;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
