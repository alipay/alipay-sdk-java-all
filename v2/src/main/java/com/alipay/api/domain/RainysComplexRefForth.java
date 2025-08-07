package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-03-07 17:08:00
 */
public class RainysComplexRefForth extends AlipayObject {

	private static final long serialVersionUID = 7217682114828153967L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("object_string")
	private String objectString;

	public String getObjectString() {
		return this.objectString;
	}
	public void setObjectString(String objectString) {
		this.objectString = objectString;
	}

}
