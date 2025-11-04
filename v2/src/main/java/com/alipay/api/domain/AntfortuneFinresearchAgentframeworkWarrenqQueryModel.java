package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚源异步轮执行query
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:47:20
 */
public class AntfortuneFinresearchAgentframeworkWarrenqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1361991726916886974L;

	/**
	 * 要执行的query
	 */
	@ApiField("input")
	private String input;

	/**
	 * 所请求的agent服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 要检索的文档
	 */
	@ApiField("tags")
	private String tags;

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

}
