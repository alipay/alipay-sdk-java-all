package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模方平台通用异步inference提交接口
 *
 * @author auto create
 * @since 1.0, 2022-07-04 15:14:00
 */
public class AnttechAiCvUaAsyncIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6742539242385474462L;

	/**
	 * 调用来源的app_id，需要在m2接入的申请注册
	 */
	@ApiField("m_app_id")
	private String mAppId;

	/**
	 * 模型输入参数，具体跟模型相关
	 */
	@ApiField("params")
	private String params;

	/**
	 * 模型服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 该次调用的唯一id，用于日志排查
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 模型服务的uri信息，默认是inference
	 */
	@ApiField("uri")
	private String uri;

	public String getmAppId() {
		return this.mAppId;
	}
	public void setmAppId(String mAppId) {
		this.mAppId = mAppId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
