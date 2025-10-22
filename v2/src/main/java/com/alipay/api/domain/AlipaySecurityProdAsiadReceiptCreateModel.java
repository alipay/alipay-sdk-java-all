package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运维平台调用风洞创建亚运工单
 *
 * @author auto create
 * @since 1.0, 2023-03-01 17:05:57
 */
public class AlipaySecurityProdAsiadReceiptCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8255828536548173498L;

	/**
	 * 应用的中文
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * INFORM：同步给亚运工单平台
HANDLE：需要亚运工单平台协同处置，并告知处置结果
	 */
	@ApiField("cooperate_mode")
	private String cooperateMode;

	/**
	 * 故障描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 结束时间，uct时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 故障action
	 */
	@ApiField("fault_action")
	private String faultAction;

	/**
	 * 故障影响面
	 */
	@ApiField("fault_effect")
	private String faultEffect;

	/**
	 * 故障影响面的值
	 */
	@ApiField("fault_effect_value")
	private String faultEffectValue;

	/**
	 * 故障处置人
	 */
	@ApiField("fault_handler")
	private String faultHandler;

	/**
	 * 可选枚举数值：X1 X2 X3 X4 Y1 Y2 Y3 Y4 Pre-X Pre-Y
	 */
	@ApiField("fault_level")
	private String faultLevel;

	/**
	 * 故障的责任方
	 */
	@ApiField("fault_responsible")
	private String faultResponsible;

	/**
	 * 监控告警、极光、客户反馈
	 */
	@ApiField("fault_source")
	private String faultSource;

	/**
	 * 故障状态
	 */
	@ApiField("fault_status")
	private String faultStatus;

	/**
	 * 基础设施
	 */
	@ApiField("fault_type")
	private String faultType;

	/**
	 * 应用分组
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 根据此不同的值执行不同流程
	 */
	@ApiField("request_key")
	private String requestKey;

	/**
	 * 故障开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 第十九届亚运会
	 */
	@ApiField("tenant_name")
	private String tenantName;

	/**
	 * 示例：批量ES查询和插入失败
	 */
	@ApiField("title")
	private String title;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getCooperateMode() {
		return this.cooperateMode;
	}
	public void setCooperateMode(String cooperateMode) {
		this.cooperateMode = cooperateMode;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getFaultAction() {
		return this.faultAction;
	}
	public void setFaultAction(String faultAction) {
		this.faultAction = faultAction;
	}

	public String getFaultEffect() {
		return this.faultEffect;
	}
	public void setFaultEffect(String faultEffect) {
		this.faultEffect = faultEffect;
	}

	public String getFaultEffectValue() {
		return this.faultEffectValue;
	}
	public void setFaultEffectValue(String faultEffectValue) {
		this.faultEffectValue = faultEffectValue;
	}

	public String getFaultHandler() {
		return this.faultHandler;
	}
	public void setFaultHandler(String faultHandler) {
		this.faultHandler = faultHandler;
	}

	public String getFaultLevel() {
		return this.faultLevel;
	}
	public void setFaultLevel(String faultLevel) {
		this.faultLevel = faultLevel;
	}

	public String getFaultResponsible() {
		return this.faultResponsible;
	}
	public void setFaultResponsible(String faultResponsible) {
		this.faultResponsible = faultResponsible;
	}

	public String getFaultSource() {
		return this.faultSource;
	}
	public void setFaultSource(String faultSource) {
		this.faultSource = faultSource;
	}

	public String getFaultStatus() {
		return this.faultStatus;
	}
	public void setFaultStatus(String faultStatus) {
		this.faultStatus = faultStatus;
	}

	public String getFaultType() {
		return this.faultType;
	}
	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestKey() {
		return this.requestKey;
	}
	public void setRequestKey(String requestKey) {
		this.requestKey = requestKey;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTenantName() {
		return this.tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
