package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代用户拒绝回收订单
 *
 * @author auto create
 * @since 1.0, 2025-07-21 14:28:37
 */
public class AlipayCommerceRecycleOrderDelegateRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 4823732946571951287L;

	/**
	 * BRAND:淘宝品牌店铺
	 */
	@ApiField("delegate_type")
	private String delegateType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 请参考回收订单终止原因枚举
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 用户收货地址， 如果是商户邮寄，创单时候用户已经存入且不传入，则默认用创单的作为收货地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 地区
	 */
	@ApiField("user_area")
	private String userArea;

	/**
	 * 城市
	 */
	@ApiField("user_city")
	private String userCity;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 1241414142
	 */
	@ApiField("user_phone")
	private String userPhone;

	/**
	 * 省份
	 */
	@ApiField("user_province")
	private String userProvince;

	public String getDelegateType() {
		return this.delegateType;
	}
	public void setDelegateType(String delegateType) {
		this.delegateType = delegateType;
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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserArea() {
		return this.userArea;
	}
	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}

	public String getUserCity() {
		return this.userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserProvince() {
		return this.userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

}
