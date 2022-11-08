package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape实验操作接口
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:58
 */
public class AlipayDigitalopUcdpApeexperimentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7624588374795193333L;

	/**
	 * 主要有四种操作类型createExperiment（创建新实验），adjustFlow(调整流量），offlineExperiment（下线当前实验），launchExperiment(推全算法版本),closeExperiment(关闭推荐)
	 */
	@ApiField("action")
	private String action;

	/**
	 * 调整的实验流量
	 */
	@ApiField("flow_rate")
	private Long flowRate;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Long getFlowRate() {
		return this.flowRate;
	}
	public void setFlowRate(Long flowRate) {
		this.flowRate = flowRate;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
