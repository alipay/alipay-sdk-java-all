package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IDP解决方案查询商品推荐价格
 *
 * @author auto create
 * @since 1.0, 2023-09-26 17:30:02
 */
public class AlipayDataIotdataIdpsolutionProductpriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1852824354225656725L;

	/**
	 * 商品编码
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品一级分类
	 */
	@ApiField("category_name_1")
	private String categoryName1;

	/**
	 * 商品二级分类
	 */
	@ApiField("category_name_2")
	private String categoryName2;

	/**
	 * 商品三级分类
	 */
	@ApiField("category_name_3")
	private String categoryName3;

	/**
	 * 设备唯一标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品图片地址
	 */
	@ApiField("image")
	private String image;

	/**
	 * 纬度 当前字段已废弃(有location替代参数)
	 */
	@ApiField("latitude")
	@Deprecated
	private String latitude;

	/**
	 * 设备经纬度。device_sn、shop_id、 location三选一必填
	 */
	@ApiField("location")
	private DeviceLocation location;

	/**
	 * 经度 当前字段已废弃(有location替代参数)
	 */
	@ApiField("longitude")
	@Deprecated
	private String longitude;

	/**
	 * 店铺唯一ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品长宽高
	 */
	@ApiField("size")
	private ProductSize size;

	/**
	 * 商品规格
	 */
	@ApiField("specification")
	private String specification;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategoryName1() {
		return this.categoryName1;
	}
	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}

	public String getCategoryName2() {
		return this.categoryName2;
	}
	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}

	public String getCategoryName3() {
		return this.categoryName3;
	}
	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public DeviceLocation getLocation() {
		return this.location;
	}
	public void setLocation(DeviceLocation location) {
		this.location = location;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public ProductSize getSize() {
		return this.size;
	}
	public void setSize(ProductSize size) {
		this.size = size;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

}
