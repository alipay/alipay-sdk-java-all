package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.process.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-18 15:26:50
 */
public class AlipayCommerceTaskProcessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343284253537322842L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 业务id，比如芝麻任务模版id
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 当前任务指标数值
	 */
	@ApiField("current")
	private String current;

	/** 
	 * 任务指标数值
	 */
	@ApiField("target")
	private String target;

	/** 
	 * 任务指标类型
	 */
	@ApiField("target_type")
	private String targetType;

	/** 
	 * 行业任务实例id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 任务类型
	 */
	@ApiField("type")
	private String type;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setCurrent(String current) {
		this.current = current;
	}
	public String getCurrent( ) {
		return this.current;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	public String getTarget( ) {
		return this.target;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	public String getTargetType( ) {
		return this.targetType;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
