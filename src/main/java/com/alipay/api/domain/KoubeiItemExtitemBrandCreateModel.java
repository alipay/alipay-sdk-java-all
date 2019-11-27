package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌创建接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:55:19
 */
public class KoubeiItemExtitemBrandCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4718484188433816462L;

	/**
	 * 商品自定义品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌所属国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 品牌描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 父品牌编码（根据业务来，如不需要，可不填）
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
