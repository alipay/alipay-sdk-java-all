package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公奕form表单复杂转换测试
 *
 * @author auto create
 * @since 1.0, 2020-06-12 15:53:22
 */
public class AlipayEbppEbppConfirmpayurlTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5751142215932421946L;

	/**
	 * ss
	 */
	@ApiField("tess")
	private String tess;

	public String getTess() {
		return this.tess;
	}
	public void setTess(String tess) {
		this.tess = tess;
	}

}
