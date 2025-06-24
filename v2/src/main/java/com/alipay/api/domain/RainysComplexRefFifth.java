package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 弱引用
 *
 * @author auto create
 * @since 1.0, 2025-03-07 17:08:00
 */
public class RainysComplexRefFifth extends AlipayObject {

	private static final long serialVersionUID = 5682569256371941897L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("param_demo")
	private String paramDemo;

	public String getParamDemo() {
		return this.paramDemo;
	}
	public void setParamDemo(String paramDemo) {
		this.paramDemo = paramDemo;
	}

}
