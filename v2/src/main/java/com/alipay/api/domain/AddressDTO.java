package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * poi信息
 *
 * @author auto create
 * @since 1.0, 2019-07-29 21:24:32
 */
public class AddressDTO extends AlipayObject {

	private static final long serialVersionUID = 5387776746984573993L;

	/**
	 * POI编码
	 */
	@ApiField("poi_code")
	private String poiCode;

	/**
	 * POI访问URL
	 */
	@ApiField("poi_url")
	private String poiUrl;

	public String getPoiCode() {
		return this.poiCode;
	}
	public void setPoiCode(String poiCode) {
		this.poiCode = poiCode;
	}

	public String getPoiUrl() {
		return this.poiUrl;
	}
	public void setPoiUrl(String poiUrl) {
		this.poiUrl = poiUrl;
	}

}
