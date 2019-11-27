package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:18
 */
public class AlipayInsCooperationTestRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 2123271518564891754L;

	/**
	 * 11
	 */
	@ApiField("xxx")
	private String xxx;

	public String getXxx() {
		return this.xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

}
