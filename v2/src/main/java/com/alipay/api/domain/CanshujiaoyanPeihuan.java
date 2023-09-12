package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ces
 *
 * @author auto create
 * @since 1.0, 2023-07-14 15:58:28
 */
public class CanshujiaoyanPeihuan extends AlipayObject {

	private static final long serialVersionUID = 8527945218745174836L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

}
