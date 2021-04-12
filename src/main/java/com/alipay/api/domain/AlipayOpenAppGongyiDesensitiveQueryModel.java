package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱敏转换测试
 *
 * @author auto create
 * @since 1.0, 2021-04-09 17:21:00
 */
public class AlipayOpenAppGongyiDesensitiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3427226299634578441L;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
