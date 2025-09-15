package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业N支付订单创建
 *
 * @author auto create
 * @since 1.0, 2025-03-18 11:25:56
 */
public class AlipayCommerceTransportNpayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3332944731982312264L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 设备序列号，为一串数字或字母，一般为电子产品的标识码
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 行程信息
	 */
	@ApiField("trip_info")
	private String tripInfo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTripInfo() {
		return this.tripInfo;
	}
	public void setTripInfo(String tripInfo) {
		this.tripInfo = tripInfo;
	}

}
