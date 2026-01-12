package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主播鉴权token获取
 *
 * @author auto create
 * @since 1.0, 2025-11-06 15:27:41
 */
public class AlipayContentLiveAnchorAccesstokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1467869468687777671L;

	/**
	 * 当action=REFRESH时，必须传入原access_token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 生成：CREATE
删除：DELETE
刷新：REFRESH

	 */
	@ApiField("action")
	private String action;

	/**
	 * 主播的生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
