package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业凭证核销
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:22:45
 */
public class AlipayCommerceTransportTourVoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7317234668981983456L;

	/**
	 * 核销凭证的门店ID
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 核销流水号,要求唯一
	 */
	@ApiField("operate_serial_id")
	private String operateSerialId;

	/**
	 * 实际的核销时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 需要核销的商品凭证
	 */
	@ApiField("voucher_verify_info")
	private VoucherVerifyInfo voucherVerifyInfo;

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateSerialId() {
		return this.operateSerialId;
	}
	public void setOperateSerialId(String operateSerialId) {
		this.operateSerialId = operateSerialId;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public VoucherVerifyInfo getVoucherVerifyInfo() {
		return this.voucherVerifyInfo;
	}
	public void setVoucherVerifyInfo(VoucherVerifyInfo voucherVerifyInfo) {
		this.voucherVerifyInfo = voucherVerifyInfo;
	}

}
