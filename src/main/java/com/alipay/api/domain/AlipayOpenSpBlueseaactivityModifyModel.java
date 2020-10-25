package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新蓝海活动报名申请单修改
 *
 * @author auto create
 * @since 1.0, 2020-10-24 07:16:36
 */
public class AlipayOpenSpBlueseaactivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3711324613349644589L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 营业执照，要求证件文本信息清晰可见。 请上传照片fileId（传参明细参见应用场景说明）
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
	 * 食品经营许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("food_business_lic")
	private String foodBusinessLic;

	/**
	 * 食品流通许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("food_circulate_lic")
	private String foodCirculateLic;

	/**
	 * 食品卫生许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("food_health_lic")
	private String foodHealthLic;

	/**
	 * 食品生产许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("food_production_lic")
	private String foodProductionLic;

	/**
	 * 餐饮服务许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("food_service_lic")
	private String foodServiceLic;

	/**
	 * 门头照，要求内景照片清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 申请单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门头照，要求店铺外观照片清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 烟草专卖零售许可证，要求证件文本信息清晰可见。请上传照片fieldId（传参明细参见应用场景说明）
	 */
	@ApiField("tobacco_lic")
	private String tobaccoLic;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getTobaccoLic() {
		return this.tobaccoLic;
	}
	public void setTobaccoLic(String tobaccoLic) {
		this.tobaccoLic = tobaccoLic;
	}

}
