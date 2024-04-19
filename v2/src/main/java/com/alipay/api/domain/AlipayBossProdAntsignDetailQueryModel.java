package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询电子CA多方签约详情信息
 *
 * @author auto create
 * @since 1.0, 2023-05-26 18:05:32
 */
public class AlipayBossProdAntsignDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3425838575634437558L;

	/**
	 * 业务方来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务唯一流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务线
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 场景值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 签署流程ID,传值默认查询签署流程下全部任务状态
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/**
	 * 签署任务id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignFlowId() {
		return this.signFlowId;
	}
	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
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
