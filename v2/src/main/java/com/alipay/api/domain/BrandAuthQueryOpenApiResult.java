package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class BrandAuthQueryOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 7296388496228693594L;

	/**
	 * null
	 */
	@ApiListField("brand_app_list")
	@ApiField("brand_app_info_open_api")
	private List<BrandAppInfoOpenApi> brandAppList;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌logo
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 品牌所有人
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * true：标准品牌
false：非标品牌
	 */
	@ApiField("standard")
	private Boolean standard;

	/**
	 * 0：已删除 1：已激活 2：审批中 3：已驳回 4：已失效 5：激活时更新审批中 6：授权即将过期 7：失效时更新审批中
	 */
	@ApiField("status")
	private String status;

	public List<BrandAppInfoOpenApi> getBrandAppList() {
		return this.brandAppList;
	}
	public void setBrandAppList(List<BrandAppInfoOpenApi> brandAppList) {
		this.brandAppList = brandAppList;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Boolean getStandard() {
		return this.standard;
	}
	public void setStandard(Boolean standard) {
		this.standard = standard;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
