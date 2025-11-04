package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员订单支付结果同步
 *
 * @author auto create
 * @since 1.0, 2025-07-31 23:44:02
 */
public class AlipayCommerceOperationMallhomePayresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1459241695865236276L;

	/**
	 * 28码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 商家外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 已支付完成的支付方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

}
