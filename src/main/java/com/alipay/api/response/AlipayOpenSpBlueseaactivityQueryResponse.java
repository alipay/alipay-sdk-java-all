package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.blueseaactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 21:01:48
 */
public class AlipayOpenSpBlueseaactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8275268416115619522L;

	/** 
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 蓝海活动的场景，包括直连餐饮（BLUE_SEA_FOOD_APPLY）、直连快消（BLUE_SEA_FMCG_APPLY）、间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）、间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 营业执照，要求证件文本信息清晰可见。 资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("business_lic")
	private String businessLic;

	/** 
	 * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 食品经营许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("food_business_lic")
	private String foodBusinessLic;

	/** 
	 * 食品流通许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("food_circulate_lic")
	private String foodCirculateLic;

	/** 
	 * 食品卫生许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("food_health_lic")
	private String foodHealthLic;

	/** 
	 * 食品生产许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("food_production_lic")
	private String foodProductionLic;

	/** 
	 * 餐饮服务许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("food_service_lic")
	private String foodServiceLic;

	/** 
	 * 门头照，要求内景照片清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/** 
	 * 审核驳回原因，在订单状态为失败时有效
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时才返回
	 */
	@ApiField("merchant_logon")
	private String merchantLogon;

	/** 
	 * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门头照，要求店铺外观照片清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/** 
	 * 申请单状态，状态机参考（AUDITING:审核中，FAIL:报名失败，PASS:报名成功）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时才返回
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/** 
	 * 烟草专卖零售许可证，要求证件文本信息清晰可见。资质信息请参见<a href="https://opendocs.alipay.com/open/01hd83">报名资质要求</a>
	 */
	@ApiField("tobacco_lic")
	private String tobaccoLic;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setBusinessLic(String businessLic) {
		this.businessLic = businessLic;
	}
	public String getBusinessLic( ) {
		return this.businessLic;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setFoodBusinessLic(String foodBusinessLic) {
		this.foodBusinessLic = foodBusinessLic;
	}
	public String getFoodBusinessLic( ) {
		return this.foodBusinessLic;
	}

	public void setFoodCirculateLic(String foodCirculateLic) {
		this.foodCirculateLic = foodCirculateLic;
	}
	public String getFoodCirculateLic( ) {
		return this.foodCirculateLic;
	}

	public void setFoodHealthLic(String foodHealthLic) {
		this.foodHealthLic = foodHealthLic;
	}
	public String getFoodHealthLic( ) {
		return this.foodHealthLic;
	}

	public void setFoodProductionLic(String foodProductionLic) {
		this.foodProductionLic = foodProductionLic;
	}
	public String getFoodProductionLic( ) {
		return this.foodProductionLic;
	}

	public void setFoodServiceLic(String foodServiceLic) {
		this.foodServiceLic = foodServiceLic;
	}
	public String getFoodServiceLic( ) {
		return this.foodServiceLic;
	}

	public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}
	public String getIndoorPic( ) {
		return this.indoorPic;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantLogon(String merchantLogon) {
		this.merchantLogon = merchantLogon;
	}
	public String getMerchantLogon( ) {
		return this.merchantLogon;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setShopEntrancePic(String shopEntrancePic) {
		this.shopEntrancePic = shopEntrancePic;
	}
	public String getShopEntrancePic( ) {
		return this.shopEntrancePic;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

	public void setTobaccoLic(String tobaccoLic) {
		this.tobaccoLic = tobaccoLic;
	}
	public String getTobaccoLic( ) {
		return this.tobaccoLic;
	}

}
