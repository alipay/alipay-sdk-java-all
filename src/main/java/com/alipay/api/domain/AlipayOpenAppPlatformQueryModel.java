package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台查询
 *
 * @author auto create
 * @since 1.0, 2018-02-09 11:40:19
 */
public class AlipayOpenAppPlatformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5583823818981896598L;

	/**
	 * 111
	 */
	@ApiField("asd")
	private String asd;

	public String getAsd() {
		return this.asd;
	}
	public void setAsd(String asd) {
		this.asd = asd;
	}

}
