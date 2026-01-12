package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AxfBookingInfo extends AlipayObject {

	private static final long serialVersionUID = 1466584378728922293L;

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
	 * 预约单id
	 */
	@ApiField("booking_id")
	private String bookingId;

	/**
	 * 预约关联的卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 预约结束时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 预约人昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 外部预约单id
	 */
	@ApiField("out_booking_id")
	private String outBookingId;

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
	 * 预约项目id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 预约开始时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 预约状态（枚举）
pending      预约待确认
confirmed    预约成功（已确认，待履约）
completed    履约完成
canceled     预约取消
expired      预约过期（未履约且超过有效期）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 预约手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

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

	public String getBookingId() {
		return this.bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOutBookingId() {
		return this.outBookingId;
	}
	public void setOutBookingId(String outBookingId) {
		this.outBookingId = outBookingId;
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

}
