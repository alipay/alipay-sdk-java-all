package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约状态变更接口
 *
 * @author auto create
 * @since 1.0, 2023-12-04 21:37:42
 */
public class AlipayOpenMiniOrderDeliveryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7867693672341759269L;

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
	 * CONFIRMED 已确认 用于酒店预订成功
CANCELLED 预约失败 用于酒店预订失败
TO_BE_CHECK_IN 待入住 待入住状态
CHECK_IN 已入住 已入住状态
HAVE_STAY 已续住 已续住状态
TO_CHECK_OUT 待退房
CHECK_OUT 已退房
FINISHED 已完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/05dxgc?pathHash=1a3ecb13">用户授权</a>; 其它场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/open/284/web">网页授权获取用户信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
