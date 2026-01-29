package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 添加品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7224986947499415157L;

	/**
	 * 品牌英文名/英文名至少填写一个
	 */
	@ApiField("brand_chs_name")
	private String brandChsName;

	/**
	 * 品牌英文名/英文名至少填写一个
	 */
	@ApiField("brand_eng_name")
	private String brandEngName;

	/**
	 * 修改品牌时传入，新建不需要传
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 关于品牌的文字描述
	 */
	@ApiField("brand_story")
	private String brandStory;

	/**
	 * null
	 */
	@ApiListField("brand_trademark_infos")
	@ApiField("brand_trademark_info_open_api")
	private List<BrandTrademarkInfoOpenApi> brandTrademarkInfos;

	/**
	 * 需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 品牌归属人，比如商标的注册人
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * true：标准品牌
false：非标准品牌
	 */
	@ApiField("standard")
	private Boolean standard;

	/**
	 * 非标品牌信息
	 */
	@ApiField("unstandard_brand_info")
	private UnStandardBrandAddInfoOpenApi unstandardBrandInfo;

	public String getBrandChsName() {
		return this.brandChsName;
	}
	public void setBrandChsName(String brandChsName) {
		this.brandChsName = brandChsName;
	}

	public String getBrandEngName() {
		return this.brandEngName;
	}
	public void setBrandEngName(String brandEngName) {
		this.brandEngName = brandEngName;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandStory() {
		return this.brandStory;
	}
	public void setBrandStory(String brandStory) {
		this.brandStory = brandStory;
	}

	public List<BrandTrademarkInfoOpenApi> getBrandTrademarkInfos() {
		return this.brandTrademarkInfos;
	}
	public void setBrandTrademarkInfos(List<BrandTrademarkInfoOpenApi> brandTrademarkInfos) {
		this.brandTrademarkInfos = brandTrademarkInfos;
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

	public UnStandardBrandAddInfoOpenApi getUnstandardBrandInfo() {
		return this.unstandardBrandInfo;
	}
	public void setUnstandardBrandInfo(UnStandardBrandAddInfoOpenApi unstandardBrandInfo) {
		this.unstandardBrandInfo = unstandardBrandInfo;
	}

}
