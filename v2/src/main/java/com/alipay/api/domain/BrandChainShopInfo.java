package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺信息
 *
 * @author auto create
 * @since 1.0, 2026-01-06 09:42:42
 */
public class BrandChainShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7465915366836937642L;

	/**
	 * null
	 */
	@ApiListField("business_time")
	@ApiField("inte_op_shop_business_time")
	private List<InteOpShopBusinessTime> businessTime;

	/**
	 * 店铺所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 店铺联系手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固定电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 店铺详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 店铺所在区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 店铺门头照图片，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg。
传入使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("out_door_images")
	private String outDoorImages;

	/**
	 * 店铺所在省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店品牌
	 */
	@ApiField("shop_brand_id")
	private String shopBrandId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public List<InteOpShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<InteOpShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(String outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopBrandId() {
		return this.shopBrandId;
	}
	public void setShopBrandId(String shopBrandId) {
		this.shopBrandId = shopBrandId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
