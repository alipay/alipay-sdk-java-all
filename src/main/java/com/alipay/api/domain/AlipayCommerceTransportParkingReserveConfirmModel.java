package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝车位运营预约单创建确认
 *
 * @author auto create
 * @since 1.0, 2020-06-22 17:13:30
 */
public class AlipayCommerceTransportParkingReserveConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6269451528359273963L;

	/**
	 * true-预约成功，false-预约失败
	 */
	@ApiField("conf_reslut")
	private String confReslut;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 支付宝预约单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * isv内部生成唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝返回停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getConfReslut() {
		return this.confReslut;
	}
	public void setConfReslut(String confReslut) {
		this.confReslut = confReslut;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
