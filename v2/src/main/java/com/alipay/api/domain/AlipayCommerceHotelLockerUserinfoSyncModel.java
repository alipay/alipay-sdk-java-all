package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店智慧住用户信息同步
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:52:39
 */
public class AlipayCommerceHotelLockerUserinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1882546541212754382L;

	/**
	 * 用户支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * MEMBER_ID时必传
	 */
	@ApiField("org_group_code")
	private String orgGroupCode;

	/**
	 * 用户支付宝user_id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 关联用户ID
	 */
	@ApiField("user_relate_id")
	private String userRelateId;

	/**
	 * 关联用户ID类型
	 */
	@ApiField("user_relate_type")
	private String userRelateType;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgGroupCode() {
		return this.orgGroupCode;
	}
	public void setOrgGroupCode(String orgGroupCode) {
		this.orgGroupCode = orgGroupCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRelateId() {
		return this.userRelateId;
	}
	public void setUserRelateId(String userRelateId) {
		this.userRelateId = userRelateId;
	}

	public String getUserRelateType() {
		return this.userRelateType;
	}
	public void setUserRelateType(String userRelateType) {
		this.userRelateType = userRelateType;
	}

}
