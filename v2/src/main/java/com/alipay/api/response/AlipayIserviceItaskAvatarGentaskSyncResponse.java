package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AvatarHumanTaskResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.avatar.gentask.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 13:37:11
 */
public class AlipayIserviceItaskAvatarGentaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535279986398568435L;

	/** 
	 * 数字人视频结果
	 */
	@ApiField("avatar_task_result")
	private AvatarHumanTaskResultDTO avatarTaskResult;

	public void setAvatarTaskResult(AvatarHumanTaskResultDTO avatarTaskResult) {
		this.avatarTaskResult = avatarTaskResult;
	}
	public AvatarHumanTaskResultDTO getAvatarTaskResult( ) {
		return this.avatarTaskResult;
	}

}
