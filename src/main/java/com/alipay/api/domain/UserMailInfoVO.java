package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票资料收件人信息
 *
 * @author auto create
 * @since 1.0, 2019-12-17 17:00:53
 */
public class UserMailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6544474763828629747L;

	/**
	 * 收件人地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 县区
	 */
	@ApiField("county_district")
	private String countyDistrict;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 收件人信息ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * pid用于指定该地址归属的PID，应对集团模式的商户所设定,发票邮寄地址根据PID确定
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;

	/**
	 * 收件人电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountyDistrict() {
		return this.countyDistrict;
	}
	public void setCountyDistrict(String countyDistrict) {
		this.countyDistrict = countyDistrict;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
