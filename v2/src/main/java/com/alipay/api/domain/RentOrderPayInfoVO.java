package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁支付单信息
 *
 * @author auto create
 * @since 1.0, 2025-08-08 18:31:33
 */
public class RentOrderPayInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5125151624725132845L;

	/**
	 * 租赁售后单号
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 租赁订单支付外部请求号，由商家自定义
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 主动同步支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 支付费项明细
	 */
	@ApiListField("pay_items")
	@ApiField("rent_pay_item_v_o")
	private List<RentPayItemVO> payItems;

	/**
	 * 支付方式
	 */
	@ApiField("pay_method")
	private String payMethod;

	/**
	 * 支付状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public List<RentPayItemVO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<RentPayItemVO> payItems) {
		this.payItems = payItems;
	}

	public String getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
