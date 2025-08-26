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
 * @since 1.0, 2024-10-08 10:03:50
 */
public class AlipayCommerceCommonTasktemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8828413224964218886L;

	/** 
	 * 任务模板信息列表
	 */
	@ApiListField("task_list")
	@ApiField("tao_ke_task_template_info_d_t_o")
	private List<TaoKeTaskTemplateInfoDTO> taskList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setTaskList(List<TaoKeTaskTemplateInfoDTO> taskList) {
		this.taskList = taskList;
	}
	public List<TaoKeTaskTemplateInfoDTO> getTaskList( ) {
		return this.taskList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
