package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MANPRIVATE
 *
 * @author auto create
 * @since 1.0, 2024-02-04 16:10:51
 */
public class MANPRIVATE extends AlipayObject {

	private static final long serialVersionUID = 7871175964652636385L;

	/**
	 * 1
	 */
	@ApiField("ss")
	private String ss;

	public String getSs() {
		return this.ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}

}
