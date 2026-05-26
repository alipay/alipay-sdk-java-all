package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-15 21:22:48
 */
public class LifeServiceBookingInfo extends AlipayObject {

	private static final long serialVersionUID = 8389438665982742955L;

	/**
	 * 商家已经发起了核销，此时在待用户确认状态。如果用户一直没确认，会在yyyy-MM-dd HH:mm:ss自动确认核销
	 */
	@ApiField("auto_confirm_deduction_time")
	private String autoConfirmDeductionTime;

	/**
	 * null
	 */
	@ApiListField("booking_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> bookingAttrs;

	/**
	 * 预约创建时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("booking_create_time")
	private String bookingCreateTime;

	/**
	 * 预约日期 yyyy-MM-dd
	 */
	@ApiField("booking_date")
	private String bookingDate;

	/**
	 * 预约单对应的核销单状态。not_start表示没有发起核销，此时没有核销单id。wait_user_confirm对应核销单状态的FROZEN，表示商家已经发起核销，等待用户确认。done表示已经核销完成。processing表示核销正在处理中。
	 */
	@ApiField("booking_deduction_status")
	private String bookingDeductionStatus;

	/**
	 * 预约单id
	 */
	@ApiField("booking_id")
	private String bookingId;

	/**
	 * 核销单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 预约结束时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 预约关联的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 预约人昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 安心生活订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 预约关联的外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 预约的外部场地id
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 预约的外部服务项目id
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 预约关联的外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 预约的外部手艺人id
	 */
	@ApiField("out_technician_id")
	private String outTechnicianId;

	/**
	 * 预约人手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 预约备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 预约场地id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 预约的服务项目id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 预约关联的skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 预约开始时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 预约单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 预约的手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAutoConfirmDeductionTime() {
		return this.autoConfirmDeductionTime;
	}
	public void setAutoConfirmDeductionTime(String autoConfirmDeductionTime) {
		this.autoConfirmDeductionTime = autoConfirmDeductionTime;
	}

	public List<LifeServiceAttr> getBookingAttrs() {
		return this.bookingAttrs;
	}
	public void setBookingAttrs(List<LifeServiceAttr> bookingAttrs) {
		this.bookingAttrs = bookingAttrs;
	}

	public String getBookingCreateTime() {
		return this.bookingCreateTime;
	}
	public void setBookingCreateTime(String bookingCreateTime) {
		this.bookingCreateTime = bookingCreateTime;
	}

	public String getBookingDate() {
		return this.bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingDeductionStatus() {
		return this.bookingDeductionStatus;
	}
	public void setBookingDeductionStatus(String bookingDeductionStatus) {
		this.bookingDeductionStatus = bookingDeductionStatus;
	}

	public String getBookingId() {
		return this.bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getOutTechnicianId() {
		return this.outTechnicianId;
	}
	public void setOutTechnicianId(String outTechnicianId) {
		this.outTechnicianId = outTechnicianId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTechnicianId() {
		return this.technicianId;
	}
	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
