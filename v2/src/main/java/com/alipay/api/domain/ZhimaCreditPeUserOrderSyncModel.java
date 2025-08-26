package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理订单信息同步
 *
 * @author auto create
 * @since 1.0, 2023-10-19 18:57:29
 */
public class ZhimaCreditPeUserOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5368435642547663711L;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 芝麻信用服务业务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 买家的支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额，单位：元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单待同步信息，不能为空，json格式字符串，自定义key需要提前与接口owner进行沟通确认
	 */
	@ApiField("order_info")
	private String orderInfo;

	/**
	 * 商家订单号，需要保证在商家侧唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求幂等号，代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 卖家的支付宝id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商家业务子订单号，一个子订单号只能属于一个主订单号(out_order_no)
	 */
	@ApiField("sub_out_order_no")
	private String subOutOrderNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSubOutOrderNo() {
		return this.subOutOrderNo;
	}
	public void setSubOutOrderNo(String subOutOrderNo) {
		this.subOutOrderNo = subOutOrderNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
