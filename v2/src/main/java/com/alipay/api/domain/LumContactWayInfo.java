package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-11 15:32:57
 */
public class LumContactWayInfo extends AlipayObject {

	private static final long serialVersionUID = 7128158163543849817L;

	/**
	 * 联系方式类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 联系方式值，手机号码：13800138000，固定电话（区号-电话）：0571-888888XX，其他电话：10位400/800电话
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
