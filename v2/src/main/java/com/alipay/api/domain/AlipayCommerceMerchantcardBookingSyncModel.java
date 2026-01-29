package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约信息同步
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AlipayCommerceMerchantcardBookingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1839433283797254231L;

	/**
	 * 预约动作（枚举）
create   - 创建预约单
confirm  - 确认预约单
cancel   - 取消预约单
update   - 修改预约单（如改期、换服务等）
complete - 将预约单置为履约完成
	 */
	@ApiField("action")
	private String action;

	/**
	 * 预约日期 yyyy-MM-dd
	 */
	@ApiField("booking_date")
	private String bookingDate;

	/**
	 * 预约单id【confirm/cancel/update/complete必填】
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
	private Date endTime;

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
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 预约开始时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 预约手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTechnicianId() {
		return this.technicianId;
	}
	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

}
