package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建搜索直达
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:28:02
 */
public class AlipayOpenSearchBoxApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4395358486315389695L;

	/**
	 * 品牌介绍，5-15个中文字符
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 自定义触发词，可配置1个，限1-8个中文字符
	 */
	@ApiListField("custom_keywords")
	@ApiField("string")
	private List<String> customKeywords;

	/**
	 * 氛围图片id，调用接口alipay.open.file.upload上传图片获取图片id。图片规范：https://opendocs.alipay.com/mini/operation/atmospheredesign
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 氛围图片名
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 商户id，代运营模式下传入
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 关联账号信息，1-2个
	 */
	@ApiListField("related_accounts")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> relatedAccounts;

	/**
	 * 服务信息
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

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
