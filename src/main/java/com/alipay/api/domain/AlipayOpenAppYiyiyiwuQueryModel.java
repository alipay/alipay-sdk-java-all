package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证一一一五
 *
 * @author auto create
 * @since 1.0, 2018-04-11 14:13:03
 */
public class AlipayOpenAppYiyiyiwuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821573359927642628L;

	/**
	 * 12
	 */
	@ApiField("rucan")
	private String rucan;

	public String getRucan() {
		return this.rucan;
	}
	public void setRucan(String rucan) {
		this.rucan = rucan;
	}

}
