package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2133
 *
 * @author auto create
 * @since 1.0, 2020-02-05 14:16:13
 */
public class AlipaySecurityProdDfesfDefBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3756258324597247497L;

	/**
	 * 11
	 */
	@ApiField("dd")
	private GavintestNewLeveaOne dd;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public GavintestNewLeveaOne getDd() {
		return this.dd;
	}
	public void setDd(GavintestNewLeveaOne dd) {
		this.dd = dd;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
