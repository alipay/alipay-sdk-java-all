package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建应用在云中环境密钥
 *
 * @author auto create
 * @since 1.0, 2025-02-28 15:49:24
 */
public class AlipayOpenCloudAppSecCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2247162948514431638L;

	/**
	 * 云id
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 云环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 调用应用id
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	/**
	 * 请求签名算法
	 */
	@ApiField("req_sign_type")
	private String reqSignType;

	/**
	 * 密钥内容
	 */
	@ApiField("sec_content")
	private String secContent;

	/**
	 * 密钥类型
	 */
	@ApiField("sec_type")
	private String secType;

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

	public String getReqSignType() {
		return this.reqSignType;
	}
	public void setReqSignType(String reqSignType) {
		this.reqSignType = reqSignType;
	}

	public String getSecContent() {
		return this.secContent;
	}
	public void setSecContent(String secContent) {
		this.secContent = secContent;
	}

	public String getSecType() {
		return this.secType;
	}
	public void setSecType(String secType) {
		this.secType = secType;
	}

}
