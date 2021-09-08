package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsShopStatusDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantshop.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:49
 */
public class AlipayOpenInstantdeliveryMerchantshopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3442681816861646257L;

	/** 
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/** 
	 * 地址。商户详细经营地址或人员所在地点。
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
	 * 在配送公司的门店状态。
	 */
	@ApiListField("logistics_shop_status")
	@ApiField("logistics_shop_status_d_t_o")
	private List<LogisticsShopStatusDTO> logisticsShopStatus;

	/** 
	 * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 联系人电话/手机号。
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
	 * 门店名称，最长不超过256个字符
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 商家门店编码。
	 */
	@ApiField("shop_no")
	private String shopNo;

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName( ) {
		return this.contactName;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getDetailAddress( ) {
		return this.detailAddress;
	}

	public void setEnterpriseCity(String enterpriseCity) {
		this.enterpriseCity = enterpriseCity;
	}
	public String getEnterpriseCity( ) {
		return this.enterpriseCity;
	}

	public void setEnterpriseDistrict(String enterpriseDistrict) {
		this.enterpriseDistrict = enterpriseDistrict;
	}
	public String getEnterpriseDistrict( ) {
		return this.enterpriseDistrict;
	}

	public void setEnterpriseProvince(String enterpriseProvince) {
		this.enterpriseProvince = enterpriseProvince;
	}
	public String getEnterpriseProvince( ) {
		return this.enterpriseProvince;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLogisticsShopStatus(List<LogisticsShopStatusDTO> logisticsShopStatus) {
		this.logisticsShopStatus = logisticsShopStatus;
	}
	public List<LogisticsShopStatusDTO> getLogisticsShopStatus( ) {
		return this.logisticsShopStatus;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setPoiid(String poiid) {
		this.poiid = poiid;
	}
	public String getPoiid( ) {
		return this.poiid;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopCategory( ) {
		return this.shopCategory;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	public String getShopNo( ) {
		return this.shopNo;
	}

}
