package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平安银行用户券通知
 *
 * @author auto create
 * @since 1.0, 2024-12-04 19:37:27
 */
public class XingheLendassistAwtloanfrontPinganuservoucherNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2175574142663621411L;

	/**
	 * 利息抵扣券核销时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("coupon_bind_time")
	private Date couponBindTime;

	/**
	 * 利息抵扣券过期时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("coupon_expire_time")
	private Date couponExpireTime;

	/**
	 * 平安侧利息抵扣券id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 利息抵扣券发放时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("coupon_receive_time")
	private Date couponReceiveTime;

	/**
	 * 利息抵扣券状态：1-已发放，2-已核销，3-已过期
	 */
	@ApiField("coupon_status")
	private String couponStatus;

	/**
	 * 对应平安测的couponTemplateId券模板id
	 */
	@ApiField("coupon_template_id")
	private String couponTemplateId;

	/**
	 * VOUCHER_RECEIVE：券领取通知（用户优惠券领取后）
VOUCHER_USE：券核销通知（用于优惠券核销后）
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 平安测的订单号orderNo
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 蚂蚁侧进行权益登记时传到平安侧的requestId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 格式yyyy-MM-dd HH:mm:ss，对应平安侧的submitTime
	 */
	@ApiField("submit_time")
	private Date submitTime;

	public Date getCouponBindTime() {
		return this.couponBindTime;
	}
	public void setCouponBindTime(Date couponBindTime) {
		this.couponBindTime = couponBindTime;
	}

	public Date getCouponExpireTime() {
		return this.couponExpireTime;
	}
	public void setCouponExpireTime(Date couponExpireTime) {
		this.couponExpireTime = couponExpireTime;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Date getCouponReceiveTime() {
		return this.couponReceiveTime;
	}
	public void setCouponReceiveTime(Date couponReceiveTime) {
		this.couponReceiveTime = couponReceiveTime;
	}

	public String getCouponStatus() {
		return this.couponStatus;
	}
	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	public String getCouponTemplateId() {
		return this.couponTemplateId;
	}
	public void setCouponTemplateId(String couponTemplateId) {
		this.couponTemplateId = couponTemplateId;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
