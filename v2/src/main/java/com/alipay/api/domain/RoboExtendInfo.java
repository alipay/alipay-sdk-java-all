package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用扩展属性说明
type	类型描述	扩展属性
1	起步费	[{"key":"distance","value": X},{"key":"duration","value":Y}]
2	里程费	[{"key":"distance","value": N}]
3	时长费	[{"key":"duration","value":K}]
4	远途费	[{"key":"distance","value": A}]
5	一口价	[]
 *
 * @author auto create
 * @since 1.0, 2025-12-18 15:47:11
 */
public class RoboExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 4376637253736257525L;

	/**
	 * 补充属性key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 补充属性值
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
