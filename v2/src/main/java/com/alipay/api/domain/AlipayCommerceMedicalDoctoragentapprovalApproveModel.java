package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交医生智能体审批
 *
 * @author auto create
 * @since 1.0, 2026-02-26 16:27:43
 */
public class AlipayCommerceMedicalDoctoragentapprovalApproveModel extends AlipayObject {

	private static final long serialVersionUID = 2848345117115619923L;

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
