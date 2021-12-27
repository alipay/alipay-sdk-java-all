package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模型查询参数
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:26
 */
public class ModelQueryParam extends AlipayObject {

	private static final long serialVersionUID = 8776813471527793646L;

	/**
	 * 条件查询参数
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作计算符，目前仅支持EQ
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 查询参数值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
