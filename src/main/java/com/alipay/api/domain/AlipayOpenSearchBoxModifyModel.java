package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改搜索直达
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:28:21
 */
public class AlipayOpenSearchBoxModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6777376244688225785L;

	/**
	 * 品牌介绍，5-15个中文字符。当module_type=BOX_EXCLUSIVE_BASE时传入，当brand_id为空时不支持修改
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 自定义关键词，最多可配置6个，限1-8个中文字符。当module_type=BOX_EXCLUSIVE_KEYWORD传入，当brand_id为空时不支持修改
	 */
	@ApiField("custom_keywords")
	private String customKeywords;

	/**
	 * 氛围图片id，调用<a href="https://opendocs.alipay.com/pre-open/032j4c"> 支付宝文件上传接口 </a>上传图片获取图片id。当module_type=BOX_ATMOSPHERE_IMAGE时传入，当brand_id为空时不支持修改。<a href="https://opendocs.alipay.com/mini/operation/atmospheredesign"> 图片规范 </a>
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 氛围图片名，当module_type=BOX_ATMOSPHERE_IMAGE时传入，当brand_id为空时不支持修改
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
	 * 搜索直达模块类型，BOX_EXCLUSIVE_BASE-基础信息/BOX_EXCLUSIVE_KEYWORD-关键词/BOX_EXCLUSIVE_FUNCTIONS-功能服务/BOX_EXCLUSIVE_ACCOUNTS-关联账号/BOX_ATMOSPHERE_IMAGE-氛围图
	 */
	@ApiField("module_type")
	private String moduleType;

	/**
	 * 关联账号信息，可配置1-2个。当module_type=BOX_EXCLUSIVE_ACCOUNTS时传入。当brand_id为空时不支持修改
	 */
	@ApiListField("related_accounts")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> relatedAccounts;

	/**
	 * 服务信息，可配置1-4个。当module_type=BOX_EXCLUSIVE_FUNCTIONS时传入
	 */
	@ApiListField("service_infos")
	@ApiField("search_box_service_info")
	private List<SearchBoxServiceInfo> serviceInfos;

	/**
	 * 小程序id，brand_id为空时必传
	 */
	@ApiField("target_appid")
	private String targetAppid;

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
