package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台礼物列表获取
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:47:41
 */
public class AlipayContentLivePlatformGiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1237628767116953161L;

	/**
	 * 鉴权token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 主播生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
