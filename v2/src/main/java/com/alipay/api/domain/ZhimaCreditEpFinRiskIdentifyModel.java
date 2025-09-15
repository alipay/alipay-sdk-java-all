package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融风控决策
 *
 * @author auto create
 * @since 1.0, 2024-05-09 16:53:08
 */
public class ZhimaCreditEpFinRiskIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3711778995628738129L;

	/**
	 * 标识所属的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 风控咨询的业务入参，需要JSON序列化后传入
	 */
	@ApiField("params")
	private String params;

	/**
	 * 请求id，用于链路追踪，方便双方排查
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 标识所属的风控场景或环节
	 */
	@ApiField("risk_scene")
	private String riskScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRiskScene() {
		return this.riskScene;
	}
	public void setRiskScene(String riskScene) {
		this.riskScene = riskScene;
	}

}
