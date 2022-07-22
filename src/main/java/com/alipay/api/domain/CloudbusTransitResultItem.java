package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客流走廊
 *
 * @author auto create
 * @since 1.0, 2019-12-10 22:35:28
 */
public class CloudbusTransitResultItem extends AlipayObject {

	private static final long serialVersionUID = 7641181988273682665L;

	/**
	 * 接口状态码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 公交客流走廊列表
	 */
	@ApiListField("data")
	@ApiField("cloudbus_transit_item")
	private List<CloudbusTransitItem> data;

	/**
	 * 消息描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<CloudbusTransitItem> getData() {
		return this.data;
	}
	public void setData(List<CloudbusTransitItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
