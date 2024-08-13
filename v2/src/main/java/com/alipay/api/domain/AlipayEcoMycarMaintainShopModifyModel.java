package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 洗车保养门店修改
 *
 * @author auto create
 * @since 1.0, 2017-07-13 14:23:21
 */
public class AlipayEcoMycarMaintainShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8653876879494251656L;

	/**
	 * 门店详细地址，地址字符长度在4-50个字符，注：不含省市区。门店详细地址按规范格式填写地址，以免影响门店搜索及活动报名：例1：道路+门牌号，“人民东路18号”；例2：道路+门牌号+标志性建筑+楼层，“四川北路1552号欢乐广场1楼”
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝帐号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 门店支持的车型品牌，支付宝车型库品牌编号（系统唯一），品牌编号可以通过调用【查询车型信息接口】alipay.eco.mycar.carmodel.query 获取。（空对象不变更/空集合清空/有数据覆盖）
	 */
	@ApiListField("brand_ids")
	@ApiField("string")
	private List<String> brandIds;

	/**
	 * 城市编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店营业结束时间（HH:mm）
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 门店店长邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 门店店长移动电话号码； 不在客户端展示
	 */
	@ApiField("contact_mobile_phone")
	private String contactMobilePhone;

	/**
	 * 门店店长姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 区编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 扩展参数，json格式，可以存放营销信息，以及主营描述等扩展信息
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 行业应用类目编号
15：洗车
16：保养
17：停车
20：4S
（空对象不变更/空集合清空/有数据覆盖）
	 */
	@ApiListField("industry_app_category_id")
	@ApiField("number")
	private List<Long> industryAppCategoryId;

	/**
	 * 行业类目编号（空对象不变更/空集合清空/有数据覆盖，<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=205&articleId=104497&docType=1">点此查看</a> 非口碑类目 – 爱车）
	 */
	@ApiListField("industry_category_id")
	@ApiField("number")
	private List<Long> industryCategoryId;

	/**
	 * 高德地图纬度（经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确）
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 高德地图经度（经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确）
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 车主平台接口上传主图片地址，通过alipay.eco.mycar.image.upload接口上传。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 分支机构编号，商户在车主平台自己创建的分支机构编码
	 */
	@ApiField("merchant_branch_id")
	private Long merchantBranchId;

	/**
	 * 门店营业开始时间（HH:mm）
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 车主平台接口上传副图片地址，通过alipay.eco.mycar.image.upload接口上传。
	 */
	@ApiListField("other_images")
	@ApiField("string")
	private List<String> otherImages;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 省编号（国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：爱特堡(益乐路店)
	 */
	@ApiField("shop_branch_name")
	private String shopBranchName;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 主门店名，比如：爱特堡；主店名里不要包含分店名，如“益乐路店”。主店名长度不能超过20个字符
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店电话号码；支持座机和手机，只支持数字和+-号，在客户端对用户展现
	 */
	@ApiField("shop_tel")
	private String shopTel;

	/**
	 * 门店类型：（shop_type_beauty：美容店，shop_type_repair：快修店，shop_type_maintenance：维修厂，shop_type_parkinglot：停车场，shop_type_gasstation：加油站，shop_type_4s：4s店）
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店状态（0：下线；1：上线）
	 */
	@ApiField("status")
	private String status;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public List<String> getBrandIds() {
		return this.brandIds;
	}
	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactMobilePhone() {
		return this.contactMobilePhone;
	}
	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public List<Long> getIndustryAppCategoryId() {
		return this.industryAppCategoryId;
	}
	public void setIndustryAppCategoryId(List<Long> industryAppCategoryId) {
		this.industryAppCategoryId = industryAppCategoryId;
	}

	public List<Long> getIndustryCategoryId() {
		return this.industryCategoryId;
	}
	public void setIndustryCategoryId(List<Long> industryCategoryId) {
		this.industryCategoryId = industryCategoryId;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public Long getMerchantBranchId() {
		return this.merchantBranchId;
	}
	public void setMerchantBranchId(Long merchantBranchId) {
		this.merchantBranchId = merchantBranchId;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public List<String> getOtherImages() {
		return this.otherImages;
	}
	public void setOtherImages(List<String> otherImages) {
		this.otherImages = otherImages;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopBranchName() {
		return this.shopBranchName;
	}
	public void setShopBranchName(String shopBranchName) {
		this.shopBranchName = shopBranchName;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopTel() {
		return this.shopTel;
	}
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
