package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店住中订单同步
 *
 * @author auto create
 * @since 1.0, 2021-07-02 09:20:47
 */
public class AlipayBusinessOrderCheckinOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2833433692844147469L;

	/**
	 * 酒店入住小程序
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 入住日期
	 */
	@ApiField("check_in_date")
	private Date checkInDate;

	/**
	 * 系统入住时间
	 */
	@ApiField("check_in_time")
	private String checkInTime;

	/**
	 * 离店日期
	 */
	@ApiField("check_out_date")
	private Date checkOutDate;

	/**
	 * 系统离店时间
	 */
	@ApiField("check_out_time")
	private String checkOutTime;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * 入住人姓名
	 */
	@ApiField("guest_name")
	private String guestName;

	/**
	 * 是否含早
	 */
	@ApiField("has_breakfast")
	private Boolean hasBreakfast;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * 用户会员等级
	 */
	@ApiField("member_level")
	private String memberLevel;

	/**
	 * 入住订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 行业侧的订单id，该字段可选，具体描述分如下场景：
1.若订单是第一次同步，即新增场景，此时无需传该字段。订单同步成功后，在返回值中会将该字段给到isv。
2.若订单不是第一次同步，即更新场景，此时一定要传该字段。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源isv
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 订单状态。具体状态值如下：
CHECK_IN  入住
CHECK_OUT 离店
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 入住订单更新时间
	 */
	@ApiField("order_update_time")
	private Date orderUpdateTime;

	/**
	 * isv侧酒店id
	 */
	@ApiField("outer_hotel_id")
	private String outerHotelId;

	/**
	 * isv侧酒店入住单id
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 入住提醒点击的跳转链接。可以是小程序详情，但不能是订单详情。
	 */
	@ApiField("remind_link")
	private String remindLink;

	/**
	 * 酒店入住信息，包含房型信息和入住人。
	 */
	@ApiListField("room_info")
	@ApiField("hotel_room_info")
	private List<HotelRoomInfo> roomInfo;

	/**
	 * 入住人联系方式
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 入住人支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutTime() {
		return this.checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getGuestName() {
		return this.guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Boolean getHasBreakfast() {
		return this.hasBreakfast;
	}
	public void setHasBreakfast(Boolean hasBreakfast) {
		this.hasBreakfast = hasBreakfast;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getMemberLevel() {
		return this.memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderUpdateTime() {
		return this.orderUpdateTime;
	}
	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public String getOuterHotelId() {
		return this.outerHotelId;
	}
	public void setOuterHotelId(String outerHotelId) {
		this.outerHotelId = outerHotelId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getRemindLink() {
		return this.remindLink;
	}
	public void setRemindLink(String remindLink) {
		this.remindLink = remindLink;
	}

	public List<HotelRoomInfo> getRoomInfo() {
		return this.roomInfo;
	}
	public void setRoomInfo(List<HotelRoomInfo> roomInfo) {
		this.roomInfo = roomInfo;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
