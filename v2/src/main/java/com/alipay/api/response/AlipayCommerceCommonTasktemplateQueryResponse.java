package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaoKeTaskTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:03:48
 */
public class AlipayCommerceCommonTasktemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536544888143174821L;

	/** 
	 * 任务模板信息
	 */
	@ApiField("task_template_info")
	private TaoKeTaskTemplateInfoDTO taskTemplateInfo;

	public void setTaskTemplateInfo(TaoKeTaskTemplateInfoDTO taskTemplateInfo) {
		this.taskTemplateInfo = taskTemplateInfo;
	}
	public TaoKeTaskTemplateInfoDTO getTaskTemplateInfo( ) {
		return this.taskTemplateInfo;
	}

}
