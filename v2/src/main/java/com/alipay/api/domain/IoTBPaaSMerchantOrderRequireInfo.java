package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单必填信息
 *
 * @author auto create
 * @since 1.0, 2021-01-28 20:26:20
 */
public class IoTBPaaSMerchantOrderRequireInfo extends AlipayObject {

	private static final long serialVersionUID = 2468185284921749175L;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否必填
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
