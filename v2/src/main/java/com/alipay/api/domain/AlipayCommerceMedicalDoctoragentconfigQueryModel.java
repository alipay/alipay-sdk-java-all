package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取最新智能体配置
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalDoctoragentconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6794714122718415743L;

	/**
	 * 智能体id
	 */
	@ApiField("avatar_id")
	private String avatarId;

	public String getAvatarId() {
		return this.avatarId;
	}
	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

}
