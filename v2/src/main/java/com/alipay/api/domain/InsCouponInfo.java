package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:12:51
 */
public class InsCouponInfo extends AlipayObject {

	private static final long serialVersionUID = 1283648552355528131L;

	/**
	 * 权益关联的券id，权益查询接口返回的权益信息中有，使用该值传值
	 */
	@ApiField("bind_voucher_id")
	private String bindVoucherId;

	/**
	 * 权益配置id，权益查询接口返回的权益信息中有，使用该值传值
	 */
	@ApiField("coupon_config_id")
	private String couponConfigId;

	/**
	 * 权益发放流水id，权益查询接口返回的权益信息中有，使用该值传值
	 */
	@ApiField("coupon_send_flow_id")
	private String couponSendFlowId;

	/**
	 * 权益状态
	 */
	@ApiField("coupon_status")
	private String couponStatus;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益有效期开始时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 权益有效期结束时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	public String getBindVoucherId() {
		return this.bindVoucherId;
	}
	public void setBindVoucherId(String bindVoucherId) {
		this.bindVoucherId = bindVoucherId;
	}

	public String getCouponConfigId() {
		return this.couponConfigId;
	}
	public void setCouponConfigId(String couponConfigId) {
		this.couponConfigId = couponConfigId;
	}

	public String getCouponSendFlowId() {
		return this.couponSendFlowId;
	}
	public void setCouponSendFlowId(String couponSendFlowId) {
		this.couponSendFlowId = couponSendFlowId;
	}

	public String getCouponStatus() {
		return this.couponStatus;
	}
	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

}
