package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户ID转换OpenID接口专用，返回用户的openId和unionId
 *
 * @author auto create
 * @since 1.0, 2023-06-27 21:17:14
 */
public class OpenIdValue extends AlipayObject {

	private static final long serialVersionUID = 7117128565867456714L;

	/**
	 * 用户OpenID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户UnionID
	 */
	@ApiField("union_id")
	private String unionId;

	/**
	 * 支付宝用户ID
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
