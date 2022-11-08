package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险结案信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 10:19:44
 */
public class RiskFinishInfo extends AlipayObject {

	private static final long serialVersionUID = 5224922274887519121L;

	/**
	 * 结案选中的标签列表
code 选中的标签code
label 选中的标签
path 选中标签的全路径
	 */
	@ApiListField("finish_label")
	@ApiField("risk_finish_label")
	private List<RiskFinishLabel> finishLabel;

	/**
	 * 任务结案类型
	 */
	@ApiField("finish_type")
	private String finishType;

	/**
	 * 主站审理平台任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public List<RiskFinishLabel> getFinishLabel() {
		return this.finishLabel;
	}
	public void setFinishLabel(List<RiskFinishLabel> finishLabel) {
		this.finishLabel = finishLabel;
	}

	public String getFinishType() {
		return this.finishType;
	}
	public void setFinishType(String finishType) {
		this.finishType = finishType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
