package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-异步服务任务-查询
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:44:59
 */
public class AlipayCommerceTransportIntelligentizeServicetaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1894469691725915976L;

	/**
	 * 公交企业ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务任务ID
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceTaskId() {
		return this.serviceTaskId;
	}
	public void setServiceTaskId(String serviceTaskId) {
		this.serviceTaskId = serviceTaskId;
	}

}
