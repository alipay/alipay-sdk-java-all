package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地图点位基本信息
 *
 * @author auto create
 * @since 1.0, 2019-11-20 11:47:18
 */
public class EntityBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 2272366492433317779L;

	/**
	 * (不带省市区)xx路xx地方xx号
或建筑物地址如:xx印象城/杭州萧山国际机场
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/**
	 * 芝麻借还规定的类目Code，充电宝固定传power_bank
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * 电话-座机或手机
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 点位code
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名称，借用实体的描述，如XX雨伞，XX充电宝，XX自行车
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * latitude
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * longitude
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * xx:xx-xx:xx, 00:00-23:59
	 */
	@ApiField("office_hours_desc")
	private String officeHoursDesc;

	/**
	 * [1,2,3,4,5,6,7]  表示周一到周日

[1,3,5] 表示周一,周三,周五
	 */
	@ApiListField("open_day")
	@ApiField("string")
	private List<String> openDay;

	/**
	 * province
	 */
	@ApiField("province")
	private String province;

	/**
	 * 免费时长 x (分钟) 不免费就返回null
	 */
	@ApiField("rent_free_time")
	private String rentFreeTime;

	/**
	 * 封顶价格 x (元/天) 没有封顶价格就返回null
	 */
	@ApiField("rent_max_price")
	private String rentMaxPrice;

	/**
	 * 租金信息描述的一部分,租金信息完整描述格式为: X元/YZ，其中X是 rent_price(单价)，Y是rent_price_unit_cnt(租金单位个数)，Z是rent_price_unit(租金单位)，比如2元/30分钟，X是2，Y是30，Z是分钟
	 */
	@ApiField("rent_price")
	private String rentPrice;

	/**
	 * 租金信息描述的一部分,租金信息完整描述格式为: X元/YZ，其中X是 rent_price(单价)，Y是rent_price_unit_cnt(租金单位个数)，Z是rent_price_unit(租金单位)，比如2元/30分钟，X是2，Y是30，Z是分钟
目前本字段支持的枚举为：HOUR/MINUTE
	 */
	@ApiField("rent_price_unit")
	private String rentPriceUnit;

	/**
	 * 租金信息描述的一部分,租金信息完整描述格式为: X元/YZ，其中X是 rent_price(单价)，Y是rent_price_unit_cnt(租金单位个数)，Z是rent_price_unit(租金单位)，比如2元/30分钟，X是2，Y是30，Z是分钟
	 */
	@ApiField("rent_price_unit_cnt")
	private String rentPriceUnitCnt;

	/**
	 * 区
	 */
	@ApiField("suburb")
	private String suburb;

	public String getAddressDesc() {
		return this.addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
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

	public String getOfficeHoursDesc() {
		return this.officeHoursDesc;
	}
	public void setOfficeHoursDesc(String officeHoursDesc) {
		this.officeHoursDesc = officeHoursDesc;
	}

	public List<String> getOpenDay() {
		return this.openDay;
	}
	public void setOpenDay(List<String> openDay) {
		this.openDay = openDay;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRentFreeTime() {
		return this.rentFreeTime;
	}
	public void setRentFreeTime(String rentFreeTime) {
		this.rentFreeTime = rentFreeTime;
	}

	public String getRentMaxPrice() {
		return this.rentMaxPrice;
	}
	public void setRentMaxPrice(String rentMaxPrice) {
		this.rentMaxPrice = rentMaxPrice;
	}

	public String getRentPrice() {
		return this.rentPrice;
	}
	public void setRentPrice(String rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getRentPriceUnit() {
		return this.rentPriceUnit;
	}
	public void setRentPriceUnit(String rentPriceUnit) {
		this.rentPriceUnit = rentPriceUnit;
	}

	public String getRentPriceUnitCnt() {
		return this.rentPriceUnitCnt;
	}
	public void setRentPriceUnitCnt(String rentPriceUnitCnt) {
		this.rentPriceUnitCnt = rentPriceUnitCnt;
	}

	public String getSuburb() {
		return this.suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

}
