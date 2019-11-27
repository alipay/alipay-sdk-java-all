package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试ISP20180912
 *
 * @author auto create
 * @since 1.0, 2018-09-18 14:27:59
 */
public class AlipayOpenAppIpaytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4885387151379131739L;

	/**
	 * test
	 */
	@ApiField("test_1_ipay")
	private String test1Ipay;

	public String getTest1Ipay() {
		return this.test1Ipay;
	}
	public void setTest1Ipay(String test1Ipay) {
		this.test1Ipay = test1Ipay;
	}

}
