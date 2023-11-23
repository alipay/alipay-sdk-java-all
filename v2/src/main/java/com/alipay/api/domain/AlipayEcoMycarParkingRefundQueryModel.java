package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车支付退款查询API
 *
 * @author auto create
 * @since 1.0, 2021-11-10 14:29:58
 */
public class AlipayEcoMycarParkingRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3699678622285635477L;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部退款订单号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
