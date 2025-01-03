package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序升级成品牌直达
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:43:33
 */
public class AlipayOpenSearchboxUpgradeSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5295779514227312196L;

	/**
	 * 小程序直达配置的常用服务中带有门店信息时，可添加简称触发词
	 */
	@ApiListField("area_keywords")
	@ApiField("string")
	private List<String> areaKeywords;

	/**
	 * 品牌介绍，5-15个中文字符。小程序直达时不支持设置
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 搜索直达boxId
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 品牌id，参考<a href="https://opendocs.alipay.com/rules/029uy4"> 品牌认证说明 </a>
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 可通过配置来开启商圈权益模块，关闭后搜索直达不展示商圈权益模块
	 */
	@ApiField("business_benefit_switch")
	private Boolean businessBenefitSwitch;

	/**
	 * 小程序已关联商圈时，可添加商圈id（目前仅对品牌直达开放，小程序直达暂未开放）
	 */
	@ApiListField("business_district_ids")
	@ApiField("string")
	private List<String> businessDistrictIds;

	/**
	 * 自定义触发词，最多可配置6个，限1-8个中文字符。 小程序直达不支持设置此项
	 */
	@ApiListField("custom_keywords")
	@ApiField("string")
	private List<String> customKeywords;

	/**
	 * 氛围图片id，调用 <a href="https://opendocs.alipay.com/mini/03hvl1?ref=api">支付宝文件上传接口</a> 上传图片获取图片id(bizCode：search_box_atmosphere)。 <a href="https://opendocs.alipay.com/b/03al6f">图片规范</a> 
小程序直达不支持设置此项。
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 氛围图片名。 小程序直达不支持设置此项
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 关联账号信息，1-2个。 内部字段均需设置。当为品牌直达时，数组中的第1个账号会被设置为"账号1"，也就是将作为搜索直达专区头部的跳转地址
	 */
	@ApiListField("related_accounts")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> relatedAccounts;

	/**
	 * 服务信息，服务必须审核通过才能申请搜索直达。品牌直达最多可配置同一品牌认证下的小程序4个，小程序直达最多可配置2个。 内部字段均需设置。
	 */
	@ApiListField("service_infos")
	@ApiField("search_box_service_info")
	private List<SearchBoxServiceInfo> serviceInfos;

	public List<String> getAreaKeywords() {
		return this.areaKeywords;
	}
	public void setAreaKeywords(List<String> areaKeywords) {
		this.areaKeywords = areaKeywords;
	}

	public String getBoxDesc() {
		return this.boxDesc;
	}
	public void setBoxDesc(String boxDesc) {
		this.boxDesc = boxDesc;
	}

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public Boolean getBusinessBenefitSwitch() {
		return this.businessBenefitSwitch;
	}
	public void setBusinessBenefitSwitch(Boolean businessBenefitSwitch) {
		this.businessBenefitSwitch = businessBenefitSwitch;
	}

	public List<String> getBusinessDistrictIds() {
		return this.businessDistrictIds;
	}
	public void setBusinessDistrictIds(List<String> businessDistrictIds) {
		this.businessDistrictIds = businessDistrictIds;
	}

	public List<String> getCustomKeywords() {
		return this.customKeywords;
	}
	public void setCustomKeywords(List<String> customKeywords) {
		this.customKeywords = customKeywords;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public List<SearchBoxAppInfo> getRelatedAccounts() {
		return this.relatedAccounts;
	}
	public void setRelatedAccounts(List<SearchBoxAppInfo> relatedAccounts) {
		this.relatedAccounts = relatedAccounts;
	}

	public List<SearchBoxServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}
	public void setServiceInfos(List<SearchBoxServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;
	}

}
