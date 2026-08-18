package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车JV租车订单同步
 *
 * @author auto create
 * @since 1.0, 2026-08-14 14:42:58
 */
public class AlipayEcoMycarRentcarJvorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4295372911769219286L;

	/**
	 * 实际取车时间，即为完单时间
	 */
	@ApiField("actual_pick_up_time")
	private Date actualPickUpTime;

	/**
	 * 订单优惠总金额，单位分。
	 */
	@ApiField("discount_amount")
	private Long discountAmount;

	/**
	 * 还车门店名称
	 */
	@ApiField("drop_off_store_name")
	private String dropOffStoreName;

	/**
	 * 完单时间，当正常完单时即为实际取车时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * JV出资优惠金额，单位分
	 */
	@ApiField("jv_discount_amount")
	private Long jvDiscountAmount;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单渠道
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单状态，状态机：
CREATED—>WAIT_ISV_SUBMIT—>CONFIRMING—>WAIT_PICK_UP—>PICKED_UP—>COMPLETED。除了PICKED_UP和COMPLETED不能流转为CANCELED，其他状态均可流转为CANCELED
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 非JV出资优惠金额，单位分
	 */
	@ApiField("other_discount_amount")
	private Long otherDiscountAmount;

	/**
	 * JV租车订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * JV租车收款商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 订单实付金额，单位分。订单总金额-订单优惠金额=订单实付金额。
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 取车门店名称
	 */
	@ApiField("pick_up_store_name")
	private String pickUpStoreName;

	/**
	 * 预计还车时间
	 */
	@ApiField("plan_drop_off_time")
	private Date planDropOffTime;

	/**
	 * 预计取车时间
	 */
	@ApiField("plan_pick_up_time")
	private Date planPickUpTime;

	/**
	 * 券前订单总金额，单位分。
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车型品牌名
	 */
	@ApiField("vehicle_brand_name")
	private String vehicleBrandName;

	/**
	 * 车辆颜色
	 */
	@ApiField("vehicle_color")
	private String vehicleColor;

	/**
	 * 车牌号码
	 */
	@ApiField("vehicle_plate_no")
	private String vehiclePlateNo;

	/**
	 * 座位数
	 */
	@ApiField("vehicle_seat_num")
	private String vehicleSeatNum;

	/**
	 * 车型车系名
	 */
	@ApiField("vehicle_series_name")
	private String vehicleSeriesName;

	/**
	 * 车型展示名称
	 */
	@ApiField("vehicle_show_name")
	private String vehicleShowName;

	public Date getActualPickUpTime() {
		return this.actualPickUpTime;
	}
	public void setActualPickUpTime(Date actualPickUpTime) {
		this.actualPickUpTime = actualPickUpTime;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDropOffStoreName() {
		return this.dropOffStoreName;
	}
	public void setDropOffStoreName(String dropOffStoreName) {
		this.dropOffStoreName = dropOffStoreName;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Long getJvDiscountAmount() {
		return this.jvDiscountAmount;
	}
	public void setJvDiscountAmount(Long jvDiscountAmount) {
		this.jvDiscountAmount = jvDiscountAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Long getOtherDiscountAmount() {
		return this.otherDiscountAmount;
	}
	public void setOtherDiscountAmount(Long otherDiscountAmount) {
		this.otherDiscountAmount = otherDiscountAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPickUpStoreName() {
		return this.pickUpStoreName;
	}
	public void setPickUpStoreName(String pickUpStoreName) {
		this.pickUpStoreName = pickUpStoreName;
	}

	public Date getPlanDropOffTime() {
		return this.planDropOffTime;
	}
	public void setPlanDropOffTime(Date planDropOffTime) {
		this.planDropOffTime = planDropOffTime;
	}

	public Date getPlanPickUpTime() {
		return this.planPickUpTime;
	}
	public void setPlanPickUpTime(Date planPickUpTime) {
		this.planPickUpTime = planPickUpTime;
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

	public String getVehicleBrandName() {
		return this.vehicleBrandName;
	}
	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getVehicleColor() {
		return this.vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehiclePlateNo() {
		return this.vehiclePlateNo;
	}
	public void setVehiclePlateNo(String vehiclePlateNo) {
		this.vehiclePlateNo = vehiclePlateNo;
	}

	public String getVehicleSeatNum() {
		return this.vehicleSeatNum;
	}
	public void setVehicleSeatNum(String vehicleSeatNum) {
		this.vehicleSeatNum = vehicleSeatNum;
	}

	public String getVehicleSeriesName() {
		return this.vehicleSeriesName;
	}
	public void setVehicleSeriesName(String vehicleSeriesName) {
		this.vehicleSeriesName = vehicleSeriesName;
	}

	public String getVehicleShowName() {
		return this.vehicleShowName;
	}
	public void setVehicleShowName(String vehicleShowName) {
		this.vehicleShowName = vehicleShowName;
	}

}
