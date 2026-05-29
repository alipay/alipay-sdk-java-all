package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人像克隆
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoravatarinfoCopyModel extends AlipayObject {

	private static final long serialVersionUID = 8665436574561791566L;

	/**
	 * 智能体id
	 */
	@ApiField("avatar_id")
	private String avatarId;

	/**
	 * 文件地址
	 */
	@ApiField("url")
	private String url;

	public String getAvatarId() {
		return this.avatarId;
	}
	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
