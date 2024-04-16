package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 曹亚峰测试灰度接口
 *
 * @author auto create
 * @since 1.0, 2023-12-09 10:42:51
 */
public class AlipaySecurityProdCyftestGreyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8511192234494566479L;

	/**
	 * asdf
	 */
	@ApiField("testone")
	private String testone;

	public String getTestone() {
		return this.testone;
	}
	public void setTestone(String testone) {
		this.testone = testone;
	}

}
