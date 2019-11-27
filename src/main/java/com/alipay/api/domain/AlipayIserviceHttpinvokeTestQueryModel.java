package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公奕http调用智能服务测试
 *
 * @author auto create
 * @since 1.0, 2018-04-23 17:37:22
 */
public class AlipayIserviceHttpinvokeTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8392261491745748577L;

	/**
	 * 参数1
	 */
	@ApiField("param_one")
	private String paramOne;

	public String getParamOne() {
		return this.paramOne;
	}
	public void setParamOne(String paramOne) {
		this.paramOne = paramOne;
	}

}
