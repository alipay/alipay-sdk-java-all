package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 高德门店信息同步给支付宝
 *
 * @author auto create
 * @since 1.0, 2025-10-21 11:24:56
 */
public class AntMerchantExpandDigitalgroupApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2447956869758949479L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 门店营业执照编号
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 门店营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 门店经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 高德门店末级类目
	 */
	@ApiField("category_final")
	private String categoryFinal;

	/**
	 * 高德一级类目
	 */
	@ApiField("category_one")
	private String categoryOne;

	/**
	 * 高德
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 市区
	 */
	@ApiField("city")
	private String city;

	/**
	 * 联系方式，多个联系方式逗号隔开
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 高德门店扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfo;

	/**
	 * 高德门店名称
	 */
	@ApiField("g_name")
	private String gName;

	/**
	 * 高德门店ID
	 */
	@ApiField("g_shopid")
	private String gShopid;

	/**
	 * 门店纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_person_card")
	private String legalPersonCard;

	/**
	 * 营业执照上的法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 门店经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * {}
	 */
	@ApiListField("shop_albums")
	@ApiField("alipay_tag_v_o")
	private List<AlipayTagVO> shopAlbums;

	/**
	 * OPEN("OPEN", "OPEN", "营业中", "营业中"),
PAUSE("PAUSE", "PAUSE", "暂停营业", "暂停营业")
	 */
	@ApiField("shop_business_status")
	private String shopBusinessStatus;

	/**
	 * 门店视频
	 */
	@ApiListField("shop_videos")
	@ApiField("string")
	private List<String> shopVideos;

	/**
	 * VALID("VALID", "VALID","有效","有效"),
 INVALID("INVALID", "INVALID","无效","无效")
	 */
	@ApiField("status")
	private String status;

	/**
	 * 高德门脸照，至少一张，最多三张
	 */
	@ApiListField("store_head_pic")
	@ApiField("string")
	private List<String> storeHeadPic;

	/**
	 * 高德门店封面图
	 */
	@ApiField("store_logo")
	private String storeLogo;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getCategoryFinal() {
		return this.categoryFinal;
	}
	public void setCategoryFinal(String categoryFinal) {
		this.categoryFinal = categoryFinal;
	}

	public String getCategoryOne() {
		return this.categoryOne;
	}
	public void setCategoryOne(String categoryOne) {
		this.categoryOne = categoryOne;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public List<ShopExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ShopExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getgName() {
		return this.gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgShopid() {
		return this.gShopid;
	}
	public void setgShopid(String gShopid) {
		this.gShopid = gShopid;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLegalPersonCard() {
		return this.legalPersonCard;
	}
	public void setLegalPersonCard(String legalPersonCard) {
		this.legalPersonCard = legalPersonCard;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public List<AlipayTagVO> getShopAlbums() {
		return this.shopAlbums;
	}
	public void setShopAlbums(List<AlipayTagVO> shopAlbums) {
		this.shopAlbums = shopAlbums;
	}

	public String getShopBusinessStatus() {
		return this.shopBusinessStatus;
	}
	public void setShopBusinessStatus(String shopBusinessStatus) {
		this.shopBusinessStatus = shopBusinessStatus;
	}

	public List<String> getShopVideos() {
		return this.shopVideos;
	}
	public void setShopVideos(List<String> shopVideos) {
		this.shopVideos = shopVideos;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getStoreHeadPic() {
		return this.storeHeadPic;
	}
	public void setStoreHeadPic(List<String> storeHeadPic) {
		this.storeHeadPic = storeHeadPic;
	}

	public String getStoreLogo() {
		return this.storeLogo;
	}
	public void setStoreLogo(String storeLogo) {
		this.storeLogo = storeLogo;
	}

}
