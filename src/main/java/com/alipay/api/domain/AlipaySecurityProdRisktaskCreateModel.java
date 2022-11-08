package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站风险审理任务创建
 *
 * @author auto create
 * @since 1.0, 2022-11-02 18:42:01
 */
public class AlipaySecurityProdRisktaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5253349662924153767L;

	/**
	 * 外部业务流水号，可支持根据外部业务流水号判断任务重复创建
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 任务风险信息，描述业务场景或者审理上下文的键值对,可在任务审理阶段展示
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 风险任务备注
	 */
	@ApiField("risk_task_memo")
	private String riskTaskMemo;

	/**
	 * 任务来源
	 */
	@ApiField("task_source")
	private String taskSource;

	/**
	 * 生成的审理任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 审理任务对应的租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public String getRiskTaskMemo() {
		return this.riskTaskMemo;
	}
	public void setRiskTaskMemo(String riskTaskMemo) {
		this.riskTaskMemo = riskTaskMemo;
	}

	public String getTaskSource() {
		return this.taskSource;
	}
	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
