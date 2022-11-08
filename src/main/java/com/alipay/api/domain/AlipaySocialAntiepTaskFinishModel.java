package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区互娱平台完成任务接口
 *
 * @author auto create
 * @since 1.0, 2022-10-26 15:25:49
 */
public class AlipaySocialAntiepTaskFinishModel extends AlipayObject {

	private static final long serialVersionUID = 3513172648467795157L;

	/**
	 * 发放可变奖励的条件
	 */
	@ApiField("condition_for_variable_award")
	private Long conditionForVariableAward;

	/**
	 * 完成时的业务定制信息
	 */
	@ApiField("finish_business_info")
	private String finishBusinessInfo;

	/**
	 * 外部请求方式
	 */
	@ApiField("request_mode")
	private String requestMode;

	/**
	 * 外部请求类型
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 业务类型
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 业务来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 任务token
	 */
	@ApiField("task_token")
	private String taskToken;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 任务实例id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 时区
	 */
	@ApiField("zone_id")
	private String zoneId;

	public Long getConditionForVariableAward() {
		return this.conditionForVariableAward;
	}
	public void setConditionForVariableAward(Long conditionForVariableAward) {
		this.conditionForVariableAward = conditionForVariableAward;
	}

	public String getFinishBusinessInfo() {
		return this.finishBusinessInfo;
	}
	public void setFinishBusinessInfo(String finishBusinessInfo) {
		this.finishBusinessInfo = finishBusinessInfo;
	}

	public String getRequestMode() {
		return this.requestMode;
	}
	public void setRequestMode(String requestMode) {
		this.requestMode = requestMode;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTaskToken() {
		return this.taskToken;
	}
	public void setTaskToken(String taskToken) {
		this.taskToken = taskToken;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getZoneId() {
		return this.zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

}
