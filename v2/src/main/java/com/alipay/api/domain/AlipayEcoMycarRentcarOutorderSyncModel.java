package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车外部订单同步
 *
 * @author auto create
 * @since 1.0, 2023-08-02 17:33:45
 */
public class AlipayEcoMycarRentcarOutorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4855363838328392153L;

	/**
	 * 车生活车型id
	 */
	@ApiField("carlife_vehicle_id")
	private String carlifeVehicleId;

	/**
	 * 还车门店名称
	 */
	@ApiField("drop_off_store_name")
	private String dropOffStoreName;

	/**
	 * 还车时间，精确到分，日期格式yyyy-MM-dd HH:mm
	 */
	@ApiField("drop_off_time")
	private String dropOffTime;

	/**
	 * 车生活订单号，订单首次同步时不需要传，首次同步时通过响应参数获取订单号，后续同步时需带上订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 状态机与车生活订单同步的状态机保持一致，详情见 https://adccloud.yuque.com/adccloud/aqkbzc/bg8fiw#BE7wh
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部三方服务商的租车订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 下单时间
	 */
	@ApiField("out_order_time")
	private Date outOrderTime;

	/**
	 * 取车门店名称
	 */
	@ApiField("pick_up_store_name")
	private String pickUpStoreName;

	/**
	 * 取车时间，精确到分钟，日期格式yyyy-MM-dd HH:mm
	 */
	@ApiField("pick_up_time")
	private String pickUpTime;

	/**
	 * 订单总价，单位分，例如订单总价200元，传20000
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户开放平台id
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getCarlifeVehicleId() {
		return this.carlifeVehicleId;
	}
	public void setCarlifeVehicleId(String carlifeVehicleId) {
		this.carlifeVehicleId = carlifeVehicleId;
	}

	public String getDropOffStoreName() {
		return this.dropOffStoreName;
	}
	public void setDropOffStoreName(String dropOffStoreName) {
		this.dropOffStoreName = dropOffStoreName;
	}

	public String getDropOffTime() {
		return this.dropOffTime;
	}
	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getOutOrderTime() {
		return this.outOrderTime;
	}
	public void setOutOrderTime(Date outOrderTime) {
		this.outOrderTime = outOrderTime;
	}

	public String getPickUpStoreName() {
		return this.pickUpStoreName;
	}
	public void setPickUpStoreName(String pickUpStoreName) {
		this.pickUpStoreName = pickUpStoreName;
	}

	public String getPickUpTime() {
		return this.pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
