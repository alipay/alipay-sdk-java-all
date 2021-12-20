package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗权益关闭和停止
 *
 * @author auto create
 * @since 1.0, 2019-02-19 20:32:32
 */
public class AlipayPcreditHuabeiBenefitOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7662711486372155642L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户端业务发生时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 权益订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户请求场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
