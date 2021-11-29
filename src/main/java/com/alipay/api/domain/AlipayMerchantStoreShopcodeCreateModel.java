package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通门店码
 *
 * @author auto create
 * @since 1.0, 2020-12-20 22:48:28
 */
public class AlipayMerchantStoreShopcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1824985553897978231L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店类目ID，可通过类目查询接口获取。传入时请传入当前类目的叶子节点ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 地区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 地理坐标-纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地理坐标-经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商户支付宝登录ID
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/**
	 * 服务商操作员ID，一般由服务商定义
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门头照图片上传后返回的文件地址，由调用图片上传接口后生成并返回
	 */
	@ApiField("shop_front_photo")
	private String shopFrontPhoto;

	/**
	 * 支付宝店铺ID。如果在创建门店码之前已经创建好了支付宝店铺，则可传入店铺ID。且如果传入了该字段，则需保证该shop_id归属于merchant_logon_id名下。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 名店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店编号，可由外部应用生成，由英文、数字组成
	 */
	@ApiField("shop_no")
	private String shopNo;

	/**
	 * 间联商户PID，当间连服务商调用时为必选参数
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 门店码码值，当前只支持传1个
	 */
	@ApiListField("tokens")
	@ApiField("string")
	private List<String> tokens;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopFrontPhoto() {
		return this.shopFrontPhoto;
	}
	public void setShopFrontPhoto(String shopFrontPhoto) {
		this.shopFrontPhoto = shopFrontPhoto;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public List<String> getTokens() {
		return this.tokens;
	}
	public void setTokens(List<String> tokens) {
		this.tokens = tokens;
	}

}
