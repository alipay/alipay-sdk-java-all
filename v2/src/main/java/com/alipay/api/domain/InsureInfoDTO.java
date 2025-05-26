package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保主体信息
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:44:03
 */
public class InsureInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4354843226677216341L;

	/**
	 * 投保渠道（直接投保必选）
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 事件类型（直接投保必选)
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 员工工种信息（直接投模式必选） 当前字段已废弃(该字段废弃，详情看员工职业信息字段)
	 */
	@ApiField("job")
	@Deprecated
	private String job;

	/**
	 * 职业级别。 第一级：1 第二级：2 ... （直接投模式必选） 当前字段已废弃(该字段废弃，详情看员工职业信息字段)
	 */
	@ApiField("job_level")
	@Deprecated
	private String jobLevel;

	/**
	 * 外部员工id
	 */
	@ApiField("out_employee_id")
	private String outEmployeeId;

	/**
	 * 产品订购方案id（直接投保必选）
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 投保场景（直接投保必选）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getJobLevel() {
		return this.jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getOutEmployeeId() {
		return this.outEmployeeId;
	}
	public void setOutEmployeeId(String outEmployeeId) {
		this.outEmployeeId = outEmployeeId;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
