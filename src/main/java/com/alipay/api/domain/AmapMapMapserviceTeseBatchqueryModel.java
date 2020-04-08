package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高德默认配置
 *
 * @author auto create
 * @since 1.0, 2019-03-05 17:16:44
 */
public class AmapMapMapserviceTeseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7631592848744438415L;

	/**
	 * 2
	 */
	@ApiField("sed")
	private String sed;

	public String getSed() {
		return this.sed;
	}
	public void setSed(String sed) {
		this.sed = sed;
	}

}
