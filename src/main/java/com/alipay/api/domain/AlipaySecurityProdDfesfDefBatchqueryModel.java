package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2133
 *
 * @author auto create
 * @since 1.0, 2019-09-21 14:29:35
 */
public class AlipaySecurityProdDfesfDefBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1128199284637961479L;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
