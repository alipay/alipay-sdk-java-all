package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户ID转换OpenID接口专用，返回用户的openId和unionId
 *
 * @author auto create
 * @since 1.0, 2023-12-28 10:22:49
 */
public class OpenIdValue extends AlipayObject {

	private static final long serialVersionUID = 4217364981636432722L;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户unionid
	 */
	@ApiField("union_id")
	private String unionId;

	/**
	 * 支付宝用户userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUnionId() {
		return this.unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
