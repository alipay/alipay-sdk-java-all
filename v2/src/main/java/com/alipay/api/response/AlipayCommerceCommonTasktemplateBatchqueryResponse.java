package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaoKeTaskTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:59
 */
public class AlipayCommerceCommonTasktemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1186443177523853341L;

	/** 
	 * 任务模板信息列表
	 */
	@ApiListField("task_list")
	@ApiField("tao_ke_task_template_info_d_t_o")
	private List<TaoKeTaskTemplateInfoDTO> taskList;

	public void setTaskList(List<TaoKeTaskTemplateInfoDTO> taskList) {
		this.taskList = taskList;
	}
	public List<TaoKeTaskTemplateInfoDTO> getTaskList( ) {
		return this.taskList;
	}

}
