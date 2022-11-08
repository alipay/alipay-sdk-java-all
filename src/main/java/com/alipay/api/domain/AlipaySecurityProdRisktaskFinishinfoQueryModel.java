package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险任务结案信息查询
 *
 * @author auto create
 * @since 1.0, 2022-11-02 18:41:30
 */
public class AlipaySecurityProdRisktaskFinishinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1121549765769961661L;

	/**
	 * task_id_list 查询指定taskId列表
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

}
