package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * PublicTestProd
 *
 * @author auto create
 * @since 1.0, 2023-12-11 15:38:19
 */
public class PublicTestProd extends AlipayObject {

	private static final long serialVersionUID = 4474572933115216247L;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

}
