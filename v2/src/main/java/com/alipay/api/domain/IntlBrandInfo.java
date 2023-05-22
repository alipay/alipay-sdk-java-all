package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:45:20
 */
public class IntlBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 5518962964272368499L;

	/**
	 * 品牌多语言描述信息
	 */
	@ApiField("brand_description")
	private String brandDescription;

	/**
	 * 品牌的logo图片信息
	 */
	@ApiField("brand_logo")
	private PhotoInfo brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 版本信息
	 */
	@ApiField("brand_version")
	private Long brandVersion;

	/**
	 * 简体中文的字段
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * 扩展信息，map的格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 品牌id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 售卖区域
	 */
	@ApiField("region")
	private String region;

	public String getBrandDescription() {
		return this.brandDescription;
	}
	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public PhotoInfo getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(PhotoInfo brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getBrandVersion() {
		return this.brandVersion;
	}
	public void setBrandVersion(Long brandVersion) {
		this.brandVersion = brandVersion;
	}

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
