package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放pipeline配置
 *
 * @author auto create
 * @since 1.0, 2025-09-24 11:06:12
 */
public class DeliveryDetailPositionPipelineConfigVO extends AlipayObject {

	private static final long serialVersionUID = 3165336652554166389L;

	/**
	 * 展位投放pipeline节点配置
	 */
	@ApiField("pipeline_node_config")
	private String pipelineNodeConfig;

	/**
	 * pipeline节点表达式，stockpromotion使用节点表达式进行pipeline计算
	 */
	@ApiField("pipeline_node_expressions")
	private String pipelineNodeExpressions;

	/**
	 * 展位码
	 */
	@ApiField("position_code")
	private String positionCode;

	public String getPipelineNodeConfig() {
		return this.pipelineNodeConfig;
	}
	public void setPipelineNodeConfig(String pipelineNodeConfig) {
		this.pipelineNodeConfig = pipelineNodeConfig;
	}

	public String getPipelineNodeExpressions() {
		return this.pipelineNodeExpressions;
	}
	public void setPipelineNodeExpressions(String pipelineNodeExpressions) {
		this.pipelineNodeExpressions = pipelineNodeExpressions;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

}
