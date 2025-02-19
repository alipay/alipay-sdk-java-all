package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益展示信息
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:51:56
 */
public class MEquityDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 3748447191967716326L;

	/**
	 * 品牌名
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 权益LOGO
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 权益名称
	 */
	@ApiField("name")
	private String name;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
