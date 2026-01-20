package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析流量分析-来源渠道列表返回体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:49
 */
public class OpenApiTrafficSourceChannelVO extends AlipayObject {

	private static final long serialVersionUID = 8541491683921238112L;

	/**
	 * 一级来源渠道
	 */
	@ApiField("first_source_type")
	private String firstSourceType;

	/**
	 * 二级来源渠道,隶属于一级渠道
	 */
	@ApiField("second_source_type")
	private String secondSourceType;

	public String getFirstSourceType() {
		return this.firstSourceType;
	}
	public void setFirstSourceType(String firstSourceType) {
		this.firstSourceType = firstSourceType;
	}

	public String getSecondSourceType() {
		return this.secondSourceType;
	}
	public void setSecondSourceType(String secondSourceType) {
		this.secondSourceType = secondSourceType;
	}

}
