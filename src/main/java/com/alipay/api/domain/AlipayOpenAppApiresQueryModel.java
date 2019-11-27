package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isp预发验证专用
 *
 * @author auto create
 * @since 1.0, 2019-10-12 18:38:33
 */
public class AlipayOpenAppApiresQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7423649394942964488L;

	/**
	 * 时间
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
