package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 21
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:08:54
 */
public class AlipayOpenAuthUnifygwtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3152686919529575939L;

	/**
	 * 1
	 */
	@ApiField("str")
	private String str;

	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
