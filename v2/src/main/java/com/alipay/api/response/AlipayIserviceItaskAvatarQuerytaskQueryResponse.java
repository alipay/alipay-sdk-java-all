package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AvatarHumanTaskResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.avatar.querytask.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-25 17:07:02
 */
public class AlipayIserviceItaskAvatarQuerytaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7655278588561531649L;

	/** 
	 * 请求结果
	 */
	@ApiListField("avatar_task_results")
	@ApiField("avatar_human_task_result_d_t_o")
	private List<AvatarHumanTaskResultDTO> avatarTaskResults;

	public void setAvatarTaskResults(List<AvatarHumanTaskResultDTO> avatarTaskResults) {
		this.avatarTaskResults = avatarTaskResults;
	}
	public List<AvatarHumanTaskResultDTO> getAvatarTaskResults( ) {
		return this.avatarTaskResults;
	}

}
