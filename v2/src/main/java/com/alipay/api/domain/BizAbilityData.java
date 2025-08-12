package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务业务能力数据
 *
 * @author auto create
 * @since 1.0, 2019-05-31 14:16:02
 */
public class BizAbilityData extends AlipayObject {

	private static final long serialVersionUID = 3541535186452175585L;

	/**
	 * 业务能力数据json值
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据key
	 */
	@ApiField("key")
	private String key;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
