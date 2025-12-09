package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公司注册地址-省 市 区 信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class RegisteredAddressVO extends AlipayObject {

	private static final long serialVersionUID = 7151133381989285559L;

	/**
	 * 市
	 */
	@ApiField("city")
	private AreaInfoVO city;

	/**
	 * 注册地址系统
	 */
	@ApiField("custom")
	private String custom;

	/**
	 * 区/县
	 */
	@ApiField("district")
	private AreaInfoVO district;

	/**
	 * 省
	 */
	@ApiField("province")
	private AreaInfoVO province;

	public AreaInfoVO getCity() {
		return this.city;
	}
	public void setCity(AreaInfoVO city) {
		this.city = city;
	}

	public String getCustom() {
		return this.custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}

	public AreaInfoVO getDistrict() {
		return this.district;
	}
	public void setDistrict(AreaInfoVO district) {
		this.district = district;
	}

	public AreaInfoVO getProvince() {
		return this.province;
	}
	public void setProvince(AreaInfoVO province) {
		this.province = province;
	}

}
