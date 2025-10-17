package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代用户修改回收订单
 *
 * @author auto create
 * @since 1.0, 2025-07-03 10:20:04
 */
public class AlipayCommerceRecycleOrderDelegateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6745961784184334758L;

	/**
	 * 淘宝品牌店铺：BRAND
	 */
	@ApiField("delegate_type")
	private String delegateType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户收货地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 国家标准区域编码
	 */
	@ApiField("user_area")
	private String userArea;

	/**
	 * 国家标准城市编码
	 */
	@ApiField("user_city")
	private String userCity;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话
	 */
	@ApiField("user_phone")
	private String userPhone;

	/**
	 * 国家标准省份编码
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
