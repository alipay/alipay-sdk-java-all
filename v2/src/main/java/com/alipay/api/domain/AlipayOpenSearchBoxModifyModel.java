package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改搜索直达
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:43:53
 */
public class AlipayOpenSearchBoxModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6875378554627428253L;

	/**
	 * 小程序直达配置的常用服务中带有门店信息时，可添加简称触发词
	 */
	@ApiListField("area_keywords")
	@ApiField("string")
	private List<String> areaKeywords;

	/**
	 * 品牌介绍，5-15个中文字符。当修改品牌介绍模块(module_type=BOX_EXCLUSIVE_BASE)时传入。
小程序直达时不支持设置
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 搜索直达配置id
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
	 * 1024
	 */
	@ApiField("custom_keywords")
	private String customKeywords;

	/**
	 * 氛围图片id，调用 <a href="https://opendocs.alipay.com/mini/03hvl1?ref=api">支付宝文件上传接口</a> 上传图片获取图片id(bizCode：search_box_atmosphere)。 <a href="https://opendocs.alipay.com/b/03al6f">图片规范</a> 
小程序直达不支持设置此项。
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 氛围图片名，当修改氛围图模块(module_type=BOX_ATMOSPHERE_IMAGE)时传入。
小程序直达不支持设置
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 搜索直达模块配置id，新增模块时可不传，更新模块时必传。从alipay.open.search.box.query详情接口查询可获取已存在模块的配置id
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型，参考<a href="https://opendocs.alipay.com/mini/03fjba#%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E"> 搜索直达模块说明 </a>。
	 */
	@ApiField("module_type")
	private String moduleType;

	/**
	 * "关联账号信息，可配置1-2个。传入账号需归属于商家主体。品牌直达修改官方账号(module_type=BOX_EXCLUSIVE_ACCOUNTS)时传入，小程序直达修改常用服务模块时也需传值。 当为品牌直达时，数组中的第1个账号会被设置为"账号1"，也就是将作为搜索直达专区头部的跳转地址。"
	 */
	@ApiListField("related_accounts")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> relatedAccounts;

	/**
	 * 服务信息，服务必须审核通过才能申请搜索直达，可配置1-4个。当修改常用服务模块(module_type=BOX_EXCLUSIVE_FUNCTIONS)时传入
	 */
	@ApiListField("service_infos")
	@ApiField("search_box_service_info")
	private List<SearchBoxServiceInfo> serviceInfos;

	/**
	 * 小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合<a href="https://opendocs.alipay.com/b/03al6e"> 准入类目 </a>
	 */
	@ApiField("target_appid")
	private String targetAppid;

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

	public String getCustomKeywords() {
		return this.customKeywords;
	}
	public void setCustomKeywords(String customKeywords) {
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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleType() {
		return this.moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
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

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}
