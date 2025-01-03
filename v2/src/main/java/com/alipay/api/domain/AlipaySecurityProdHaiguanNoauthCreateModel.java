package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 海关测试验收--无用户授权有打标
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:31:24
 */
public class AlipaySecurityProdHaiguanNoauthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2887555277971597699L;

	/**
	 * 12
	 */
	@ApiField("haha")
	private String haha;

	/**
	 * 证件类型
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	public String getHaha() {
		return this.haha;
	}
	public void setHaha(String haha) {
		this.haha = haha;
	}

	public List<String> getTest() {
		return this.test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

}
