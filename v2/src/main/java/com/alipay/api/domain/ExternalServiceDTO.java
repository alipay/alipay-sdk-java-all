package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安诊儿外部服务模型
 *
 * @author auto create
 * @since 1.0, 2024-03-22 15:05:34
 */
public class ExternalServiceDTO extends AlipayObject {

	private static final long serialVersionUID = 5116973311678691794L;

	/**
	 * 租户服务介绍说明
	 */
	@ApiField("service_introduce")
	private String serviceIntroduce;

	/**
	 * 租户服务的关键词
	 */
	@ApiField("service_key_words")
	private String serviceKeyWords;

	/**
	 * 租户的服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getServiceIntroduce() {
		return this.serviceIntroduce;
	}
	public void setServiceIntroduce(String serviceIntroduce) {
		this.serviceIntroduce = serviceIntroduce;
	}

	public String getServiceKeyWords() {
		return this.serviceKeyWords;
	}
	public void setServiceKeyWords(String serviceKeyWords) {
		this.serviceKeyWords = serviceKeyWords;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
