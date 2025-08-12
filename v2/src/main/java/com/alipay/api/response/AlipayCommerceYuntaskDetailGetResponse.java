package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.YunTaskTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 14:52:06
 */
public class AlipayCommerceYuntaskDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7811664263277123326L;

	/** 
	 * 任务详情
	 */
	@ApiField("task")
	private YunTaskTemplateInfoDTO task;

	public void setTask(YunTaskTemplateInfoDTO task) {
		this.task = task;
	}
	public YunTaskTemplateInfoDTO getTask( ) {
		return this.task;
	}

}
