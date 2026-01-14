package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单支付主动同步
 *
 * @author auto create
 * @since 1.0, 2025-11-26 15:17:18
 */
public class AlipayCommerceRentOrderPaySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8833337169876295876L;

	/**
	 * 租赁售后单号
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 租金支付外部请求号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 订单费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("rent_pay_item_d_t_o")
	private List<RentPayItemDTO> payItems;

	/**
	 * 支付时间，特指主动同步、非支付宝渠道下可以传入用户支付完成的时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 对应支付渠道的支付单号，ALIPAY时必传
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
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

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public List<RentPayItemDTO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<RentPayItemDTO> payItems) {
		this.payItems = payItems;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
