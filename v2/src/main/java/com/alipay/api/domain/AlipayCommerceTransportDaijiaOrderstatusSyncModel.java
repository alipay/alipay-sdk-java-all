package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代驾订单状态同步
 *
 * @author auto create
 * @since 1.0, 2025-12-12 10:22:54
 */
public class AlipayCommerceTransportDaijiaOrderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5741143784551339365L;

	/**
	 * 订单产生费用
服务完成后进入到待支付状态，或取消产生取消费进入到待支付时必传
	 */
	@ApiField("bill")
	private OrderBillReq bill;

	/**
	 * 司机信息，当司机接单后返回
	 */
	@ApiField("driver_info")
	private DesignatedDriverInfo driverInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 品类
	 */
	@ApiField("order_category")
	private String orderCategory;

	/**
	 * 车生活订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 供给名称
	 */
	@ApiField("order_supply_name")
	private String orderSupplyName;

	/**
	 * 服务商侧订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public OrderBillReq getBill() {
		return this.bill;
	}
	public void setBill(OrderBillReq bill) {
		this.bill = bill;
	}

	public DesignatedDriverInfo getDriverInfo() {
		return this.driverInfo;
	}
	public void setDriverInfo(DesignatedDriverInfo driverInfo) {
		this.driverInfo = driverInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderCategory() {
		return this.orderCategory;
	}
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
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

	public String getOrderSupplyName() {
		return this.orderSupplyName;
	}
	public void setOrderSupplyName(String orderSupplyName) {
		this.orderSupplyName = orderSupplyName;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
