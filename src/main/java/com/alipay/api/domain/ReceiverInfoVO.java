package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收件人信息
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class ReceiverInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2415342183249821335L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市编码
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 移动电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份编码
	 */
	@ApiField("province")
	private String province;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
