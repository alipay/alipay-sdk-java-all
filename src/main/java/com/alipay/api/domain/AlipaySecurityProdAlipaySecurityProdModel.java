package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 爱的发的发的是发三福
 *
 * @author auto create
 * @since 1.0, 2016-03-28 22:06:29
 */
public class AlipaySecurityProdAlipaySecurityProdModel extends AlipayObject {

	private static final long serialVersionUID = 5263115552786794834L;

	/**
	 * 测试
	 */
	@ApiField("service")
	private String service;

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

}
