package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容安全分析同步调用结果
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class InfoSecAnalyzeSyncResult extends AlipayObject {

	private static final long serialVersionUID = 3244549646855361868L;

	/**
	 * 数据ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 风险识别标签内容
	 */
	@ApiListField("detect_check_labels")
	@ApiField("detect_check_label")
	private List<DetectCheckLabel> detectCheckLabels;

	/**
	 * 处置建议
	 */
	@ApiField("suggestion")
	private String suggestion;

	/**
	 * 检测任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public List<DetectCheckLabel> getDetectCheckLabels() {
		return this.detectCheckLabels;
	}
	public void setDetectCheckLabels(List<DetectCheckLabel> detectCheckLabels) {
		this.detectCheckLabels = detectCheckLabels;
	}

	public String getSuggestion() {
		return this.suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
