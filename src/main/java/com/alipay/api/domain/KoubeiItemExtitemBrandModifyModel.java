package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌修改接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:55:09
 */
public class KoubeiItemExtitemBrandModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3116931619924963358L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 所属国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 品牌描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 父品牌编码（可不填）
	 */
	@ApiField("parent_brand_code")
	private String parentBrandCode;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentBrandCode() {
		return this.parentBrandCode;
	}
	public void setParentBrandCode(String parentBrandCode) {
		this.parentBrandCode = parentBrandCode;
	}

}
