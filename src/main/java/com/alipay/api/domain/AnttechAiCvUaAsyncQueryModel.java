package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模方平台通用异步inference结果查询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-03 18:32:56
 */
public class AnttechAiCvUaAsyncQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1528215911635487289L;

	/**
	 * 业务接入在m2平台申请的接入appid
	 */
	@ApiField("m_app_id")
	private String mAppId;

	/**
	 * 模型服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 异步服务调用返回的taskid
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 默认可以不填
	 */
	@ApiField("uri")
	private String uri;

	public String getmAppId() {
		return this.mAppId;
	}
	public void setmAppId(String mAppId) {
		this.mAppId = mAppId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
