package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试页面接口
 *
 * @author auto create
 * @since 1.0, 2017-06-05 22:08:20
 */
public class AlipaySecurityProdTelmoPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3639442184885849264L;

	/**
	 * aaaa
	 */
	@ApiField("aaaa")
	private BoxiuTestDS aaaa;

	public BoxiuTestDS getAaaa() {
		return this.aaaa;
	}
	public void setAaaa(BoxiuTestDS aaaa) {
		this.aaaa = aaaa;
	}

}
