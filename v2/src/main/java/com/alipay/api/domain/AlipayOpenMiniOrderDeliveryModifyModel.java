package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约状态变更接口
 *
 * @author auto create
 * @since 1.0, 2024-08-01 19:33:51
 */
public class AlipayOpenMiniOrderDeliveryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4233994483356694361L;

	/**
	 * 需要修改的活动信息列表
	 */
	@ApiListField("activity_infos")
	@ApiField("activity_info_modify_d_t_o")
	private List<ActivityInfoModifyDTO> activityInfos;

	/**
	 * 酒店预订信息
	 */
	@ApiField("booking_info")
	private BookingInfoDTO bookingInfo;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_info")
	private ContactInfoDTO contactInfo;

	/**
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单的履约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 需要修改的票务信息列表
	 */
	@ApiListField("ticket_infos")
	@ApiField("ticket_info_modify_d_t_o")
	private List<TicketInfoModifyDTO> ticketInfos;

	/**
	 * 出游信息
	 */
	@ApiField("tour_info")
	private TourInfoDTO tourInfo;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

	public List<ActivityInfoModifyDTO> getActivityInfos() {
		return this.activityInfos;
	}
	public void setActivityInfos(List<ActivityInfoModifyDTO> activityInfos) {
		this.activityInfos = activityInfos;
	}

	public BookingInfoDTO getBookingInfo() {
		return this.bookingInfo;
	}
	public void setBookingInfo(BookingInfoDTO bookingInfo) {
		this.bookingInfo = bookingInfo;
	}

	public ContactInfoDTO getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfoDTO contactInfo) {
		this.contactInfo = contactInfo;
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<TicketInfoModifyDTO> getTicketInfos() {
		return this.ticketInfos;
	}
	public void setTicketInfos(List<TicketInfoModifyDTO> ticketInfos) {
		this.ticketInfos = ticketInfos;
	}

	public TourInfoDTO getTourInfo() {
		return this.tourInfo;
	}
	public void setTourInfo(TourInfoDTO tourInfo) {
		this.tourInfo = tourInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
