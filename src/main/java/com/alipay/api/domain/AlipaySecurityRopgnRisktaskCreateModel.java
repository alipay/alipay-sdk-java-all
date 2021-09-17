package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * B类汇款订单生成审理任务接口
 *
 * @author auto create
 * @since 1.0, 2021-08-31 20:09:12
 */
public class AlipaySecurityRopgnRisktaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3535411611277365974L;

	/**
	 * 任务扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 业务系统流水号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 任务来源
	 */
	@ApiField("task_source")
	private String taskSource;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 租户，目前只有ALIPW3CN这一个租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
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
