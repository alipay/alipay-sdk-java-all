package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询docusign多方签署任务
 *
 * @author auto create
 * @since 1.0, 2024-08-02 16:35:14
 */
public class AlipayBossProdAntlescenterDocusignresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7297974548966666923L;

	/**
	 * 申请方系统标识
	 */
	@ApiField("application_system")
	private String applicationSystem;

	/**
	 * 业务线编码
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 签署中心：签署受理唯一流水号
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 签署任务流水id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/**
	 * 合同租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getApplicationSystem() {
		return this.applicationSystem;
	}
	public void setApplicationSystem(String applicationSystem) {
		this.applicationSystem = applicationSystem;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignTaskId() {
		return this.signTaskId;
	}
	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
