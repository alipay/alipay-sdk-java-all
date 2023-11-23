package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建商家门店
 *
 * @author auto create
 * @since 1.0, 2022-09-14 20:30:06
 */
public class AlipayOpenInstantdeliveryMerchantshopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2312961471913154111L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 地址。商户详细经营地址或人员所在地点
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("enterprise_city")
	private String enterpriseCity;

	/**
	 * 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("enterprise_district")
	private String enterpriseDistrict;

	/**
	 * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。 （参考资料： http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
	 */
	@ApiField("enterprise_province")
	private String enterpriseProvince;

	/**
	 * 纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 联系人电话/手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 高德poiid
	 */
	@ApiField("poiid")
	private String poiid;

	/**
	 * 店铺类目，取值参见文件https://mif-pub.alipayobjects.com/ShopCategory.xlsx 中的三级门店类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 门店名称，最长不超过256个字符。名称+地址需要全局唯一。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商家门店编码，可自定义，但必须唯一
	 */
	@ApiField("shop_no")
	private String shopNo;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getEnterpriseCity() {
		return this.enterpriseCity;
	}
	public void setEnterpriseCity(String enterpriseCity) {
		this.enterpriseCity = enterpriseCity;
	}

	public String getEnterpriseDistrict() {
		return this.enterpriseDistrict;
	}
	public void setEnterpriseDistrict(String enterpriseDistrict) {
		this.enterpriseDistrict = enterpriseDistrict;
	}

	public String getEnterpriseProvince() {
		return this.enterpriseProvince;
	}
	public void setEnterpriseProvince(String enterpriseProvince) {
		this.enterpriseProvince = enterpriseProvince;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPoiid() {
		return this.poiid;
	}
	public void setPoiid(String poiid) {
		this.poiid = poiid;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
