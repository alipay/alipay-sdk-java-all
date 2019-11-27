package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * http同步调用测试
 *
 * @author auto create
 * @since 1.0, 2018-04-25 10:55:21
 */
public class AlipayOpenAppHttpinvokeTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4264584755575288582L;

	/**
	 * 参数1
	 */
	@ApiField("parma_one")
	private String parmaOne;

	public String getParmaOne() {
		return this.parmaOne;
	}
	public void setParmaOne(String parmaOne) {
		this.parmaOne = parmaOne;
	}

}
