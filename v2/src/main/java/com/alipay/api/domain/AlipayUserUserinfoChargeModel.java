package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wwwgh
 *
 * @author auto create
 * @since 1.0, 2024-01-19 16:10:25
 */
public class AlipayUserUserinfoChargeModel extends AlipayObject {

	private static final long serialVersionUID = 3532296989886187784L;

	/**
	 * 详细地址
	 */
	@ApiField("address_type")
	private String addressType;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("sdddd")
	private Boolean sdddd;

	/**
	 * 1
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAddressType() {
		return this.addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getSdddd() {
		return this.sdddd;
	}
	public void setSdddd(Boolean sdddd) {
		this.sdddd = sdddd;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
