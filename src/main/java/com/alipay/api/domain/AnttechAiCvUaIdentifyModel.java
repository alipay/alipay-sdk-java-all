package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模方平台通用inference接口
 *
 * @author auto create
 * @since 1.0, 2021-09-29 14:10:52
 */
public class AnttechAiCvUaIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2531299548967668245L;

	/**
	 * 路由规则、超时时间等模型单次pv的配置，默认可不填，具体值参考模型服务提供者
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * 模方平台应用id,用作访问权限控制
	 */
	@ApiField("m_app_id")
	private String mAppId;

	/**
	 * 模型调用参数jsonstring,具体传参值参考模方服务提供者
	 */
	@ApiField("params")
	private String params;

	/**
	 * 模型服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 具体值需要参考模型服务提供者
	 */
	@ApiField("uri")
	private String uri;

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

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

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
