package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步用于数据驱动的外部源数据
 *
 * @author auto create
 * @since 1.0, 2017-10-27 11:03:31
 */
public class AlipaySocialBaseIdpsourceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3744444819815276843L;

	/**
	 * 数据内容为json格式的字符串，要求数据内容所有字段平铺，不支持复杂数据结构，时间类型请统一使用unix毫秒时间戳。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 能唯一标识一份外部数据的名称，确定后不可变更，不可重复
	 */
	@ApiField("name")
	private String name;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
