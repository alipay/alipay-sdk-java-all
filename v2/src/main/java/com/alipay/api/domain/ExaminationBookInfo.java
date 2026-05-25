package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类预约信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 16:34:21
 */
public class ExaminationBookInfo extends AlipayObject {

	private static final long serialVersionUID = 4732812661857452423L;

	/**
	 * 预约结束时间
	 */
	@ApiField("book_end_time")
	private String bookEndTime;

	/**
	 * 预约开始时间 日期
	 */
	@ApiField("book_start_time")
	private String bookStartTime;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 患者性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 证件号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 证件类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 详细地址
	 */
	@ApiField("location")
	private String location;

	/**
	 * 患者姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 预约门店地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 预约门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 预约时间
	 */
	@ApiField("time")
	private String time;

	public String getBookEndTime() {
		return this.bookEndTime;
	}
	public void setBookEndTime(String bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	public String getBookStartTime() {
		return this.bookStartTime;
	}
	public void setBookStartTime(String bookStartTime) {
		this.bookStartTime = bookStartTime;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
