package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-客流预测体验变化任务-创建
 *
 * @author auto create
 * @since 1.0, 2023-04-26 19:47:47
 */
public class AlipayCommerceTransportIntelligentizeOdpredictionexpCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8184168965299169771L;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公交地铁企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 服务任务扩展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 客流预测任务响应返回的任务id作为入参创建客流预测体验变化任务
	 */
	@ApiField("od_prediction_service_task_id")
	private String odPredictionServiceTaskId;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 客流预测体验变化任务名称
	 */
	@ApiField("service_task_name")
	private String serviceTaskName;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOdPredictionServiceTaskId() {
		return this.odPredictionServiceTaskId;
	}
	public void setOdPredictionServiceTaskId(String odPredictionServiceTaskId) {
		this.odPredictionServiceTaskId = odPredictionServiceTaskId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskName() {
		return this.serviceTaskName;
	}
	public void setServiceTaskName(String serviceTaskName) {
		this.serviceTaskName = serviceTaskName;
	}

}
