package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部服务订单同步蚂蚁
 *
 * @author auto create
 * @since 1.0, 2020-04-21 10:29:13
 */
public class AlipayInsAutoAutoaftermarketOutorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7381549756858844382L;

	/**
	 * 订单动作，譬如支付、退款、核销
PAY-支付
REFUND-退款
USE-核销使用
	 */
	@ApiField("action")
	private String action;

	/**
	 * 用户实际支付金额
单位：分
譬如：10000分
	 */
	@ApiField("actual_pay_amount")
	private Long actualPayAmount;

	/**
	 * 支付宝用户2088账号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 业务发生时间，不是接口传输时间，譬如支付时间，则就是用户支付的业务动作时间
格式：yyyyMMddHHmmss
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 车辆服务品类
保养-maintenance
轮胎-tyre
洗美-washBeauty
汽车用品-carSupplies
	 */
	@ApiField("category")
	private String category;

	/**
	 * 服务商的订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝唤起收银台的交易单号，不是服务商自己的业务订单号
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/**
	 * 服务商品的标题名称
	 */
	@ApiField("prod_title")
	private String prodTitle;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Long getActualPayAmount() {
		return this.actualPayAmount;
	}
	public void setActualPayAmount(Long actualPayAmount) {
		this.actualPayAmount = actualPayAmount;
	}

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayTradeNo() {
		return this.payTradeNo;
	}
	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}

	public String getProdTitle() {
		return this.prodTitle;
	}
	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

}
