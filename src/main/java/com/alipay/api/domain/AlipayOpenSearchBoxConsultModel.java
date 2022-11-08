package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索直达准入咨询
 *
 * @author auto create
 * @since 1.0, 2022-08-09 11:05:24
 */
public class AlipayOpenSearchBoxConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8819877891918592349L;

	/**
	 * 品牌介绍，5-15个中文字符。 
小程序直达不支持设置此项
	 */
	@ApiField("box_desc")
	private String boxDesc;

	/**
	 * 品牌id，参考<a href="https://opendocs.alipay.com/rules/029uy4">品牌认证说明</a>
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 自定义触发词，最多可配置6个，限1-8个中文字符。 
小程序直达不支持设置此项
	 */
	@ApiListField("custom_keywords")
	@ApiField("string")
	private List<String> customKeywords;

	/**
	 * 氛围图片id，调用 <a href="https://opendocs.alipay.com/pre-open/032j4c">支付宝文件上传接口</a> 上传图片获取图片id(bizCode：search_box_atmosphere)。 <a href="https://opendocs.alipay.com/mini/operation/atmospheredesign">图片规范</a> 
小程序直达不支持设置此项。
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 氛围图片名。 
小程序直达不支持设置此项
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 关联账号信息，1-2个。 内部字段均需设置。
	 */
	@ApiListField("related_accounts")
	@ApiField("search_box_app_info")
	private List<SearchBoxAppInfo> relatedAccounts;

	/**
	 * 服务信息，服务必须审核通过才能申请搜索直达。 内部字段均需设置。
	 */
	@ApiListField("service_infos")
	@ApiField("search_box_service_info")
	private List<SearchBoxServiceInfo> serviceInfos;

	/**
	 * 小程序id，小程序直达时必传，需要和申请的商户主体保持一致，且符合<a href="https://opendocs.alipay.com/b/03al6e">准入类目</a>
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
