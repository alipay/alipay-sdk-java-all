package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭服务订单状态同步
 *
 * @author auto create
 * @since 1.0, 2024-11-11 10:35:52
 */
public class AlipayCloudCloudpromoHouseholdOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2773942765657491881L;

	/**
	 * 支付宝生成的订单id，没有则不传
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 主单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	/**
	 * 订单金额，单位为元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 工单id，没有则不传
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用于描述订单状态
	 */
	@ApiField("order_stat")
	private String orderStat;

	/**
	 * yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 订单展示标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 订单来源平台
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 订单的预估金额，单位为元。和订单金额不可同时为空
	 */
	@ApiField("pre_amount")
	private String preAmount;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getMainOrderId() {
		return this.mainOrderId;
	}
	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStat() {
		return this.orderStat;
	}
	public void setOrderStat(String orderStat) {
		this.orderStat = orderStat;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPreAmount() {
		return this.preAmount;
	}
	public void setPreAmount(String preAmount) {
		this.preAmount = preAmount;
	}

}
