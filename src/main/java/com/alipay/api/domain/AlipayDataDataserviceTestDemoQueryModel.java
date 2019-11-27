package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试一下
 *
 * @author auto create
 * @since 1.0, 2019-01-18 13:02:15
 */
public class AlipayDataDataserviceTestDemoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2463248462238588433L;

	/**
	 * 测试
	 */
	@ApiField("param")
	private Long param;

	public Long getParam() {
		return this.param;
	}
	public void setParam(Long param) {
		this.param = param;
	}

}
