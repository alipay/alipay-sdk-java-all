package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 13:57:23
 */
public class BizInfo extends AlipayObject {

	private static final long serialVersionUID = 5179253588893345937L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区县
	 */
	@ApiField("county")
	private String county;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
