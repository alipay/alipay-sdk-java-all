package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * share
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipaySecurityDeleteFollowcountModel extends AlipayObject {

	private static final long serialVersionUID = 6583382796823944766L;

	/**
	 * share
	 */
	@ApiField("share")
	private String share;

	public String getShare() {
		return this.share;
	}
	public void setShare(String share) {
		this.share = share;
	}

}
