package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新蓝海活动报名申请
 *
 * @author auto create
 * @since 1.0, 2020-11-25 17:36:17
 */
public class AlipayOpenSpBlueseaactivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2295891373693767281L;

	/**
	 * 详细地址。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("address")
	private String address;

	/**
	 * 蓝海活动的场景，支持场景如下：
* 直连餐饮（BLUE_SEA_FOOD_APPLY）；
* 直连快消（BLUE_SEA_FMCG_APPLY）；
* 间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）；
* 间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 营业执照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("business_lic")
	private String businessLic;

	/**
	 * 城市编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'> 统计用区划和城乡划分代码</a>）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'> 统计用区划和城乡划分代码</a>）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 食品经营许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("food_business_lic")
	private String foodBusinessLic;

	/**
	 * 食品流通许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("food_circulate_lic")
	private String foodCirculateLic;

	/**
	 * 食品卫生许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("food_health_lic")
	private String foodHealthLic;

	/**
	 * 食品生产许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("food_production_lic")
	private String foodProductionLic;

	/**
	 * 餐饮服务许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("food_service_lic")
	private String foodServiceLic;

	/**
	 * 内景照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时必填，间连场景可空。
	 */
	@ApiField("merchant_logon")
	private String merchantLogon;

	/**
	 * 省份编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'>  统计用区划和城乡划分代码</a>）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门头照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时必填，直连场景可空。
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 烟草专卖零售许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。
请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 
该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。
	 */
	@ApiField("tobacco_lic")
	private String tobaccoLic;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessLic() {
		return this.businessLic;
	}
	public void setBusinessLic(String businessLic) {
		this.businessLic = businessLic;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getFoodBusinessLic() {
		return this.foodBusinessLic;
	}
	public void setFoodBusinessLic(String foodBusinessLic) {
		this.foodBusinessLic = foodBusinessLic;
	}

	public String getFoodCirculateLic() {
		return this.foodCirculateLic;
	}
	public void setFoodCirculateLic(String foodCirculateLic) {
		this.foodCirculateLic = foodCirculateLic;
	}

	public String getFoodHealthLic() {
		return this.foodHealthLic;
	}
	public void setFoodHealthLic(String foodHealthLic) {
		this.foodHealthLic = foodHealthLic;
	}

	public String getFoodProductionLic() {
		return this.foodProductionLic;
	}
	public void setFoodProductionLic(String foodProductionLic) {
		this.foodProductionLic = foodProductionLic;
	}

	public String getFoodServiceLic() {
		return this.foodServiceLic;
	}
	public void setFoodServiceLic(String foodServiceLic) {
		this.foodServiceLic = foodServiceLic;
	}

	public String getIndoorPic() {
		return this.indoorPic;
	}
	public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}

	public String getMerchantLogon() {
		return this.merchantLogon;
	}
	public void setMerchantLogon(String merchantLogon) {
		this.merchantLogon = merchantLogon;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopEntrancePic() {
		return this.shopEntrancePic;
	}
	public void setShopEntrancePic(String shopEntrancePic) {
		this.shopEntrancePic = shopEntrancePic;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getTobaccoLic() {
		return this.tobaccoLic;
	}
	public void setTobaccoLic(String tobaccoLic) {
		this.tobaccoLic = tobaccoLic;
	}

}
