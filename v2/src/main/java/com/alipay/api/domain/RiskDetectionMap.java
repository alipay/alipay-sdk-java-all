package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于结算风险咨询请求入参里的Map类型参数
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionMap extends AlipayObject {

	private static final long serialVersionUID = 1199293113527824972L;

	/**
	 * 参数的名字
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数的值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
