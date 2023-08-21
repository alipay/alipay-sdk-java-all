package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 思蓝灰度Zone测试接口one
 *
 * @author auto create
 * @since 1.0, 2018-07-12 16:34:09
 */
public class AlipayOpenAppSilanApigrayoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4895954933345393757L;

	/**
	 * param
	 */
	@ApiField("param_1")
	private String param1;

	public String getParam1() {
		return this.param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}

}
