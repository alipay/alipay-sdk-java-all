package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车品牌信息
 *
 * @author auto create
 * @since 1.0, 2024-11-29 14:33:42
 */
public class CardBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 3697158861785764148L;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 首字母
	 */
	@ApiField("firstletter")
	private String firstletter;

	/**
	 * 品牌logo图片链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 品牌名称
	 */
	@ApiField("name")
	private String name;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getFirstletter() {
		return this.firstletter;
	}
	public void setFirstletter(String firstletter) {
		this.firstletter = firstletter;
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
