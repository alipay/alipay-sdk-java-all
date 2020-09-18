package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机地址信息
 *
 * @author auto create
 * @since 1.0, 2018-12-13 10:35:02
 */
public class SmartAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 3879526166963989167L;

	/**
	 * 行政区代码-区，使用蚂蚁标准行政区划代码，可参考
https://render.alipay.com/p/f/fd-jp40xpc9/index.html
	 */
	@ApiField("area_code")
	private Long areaCode;

	/**
	 * 行政区代码-市，使用蚂蚁标准行政区划代码，可参考
https://render.alipay.com/p/f/fd-jp40xpc9/index.html
	 */
	@ApiField("city_code")
	private Long cityCode;

	/**
	 * 自助售货机地址
	 */
	@ApiField("machine_address")
	private String machineAddress;

	/**
	 * 行政区代码-省，使用蚂蚁标准行政区划代码，可参考
https://render.alipay.com/p/f/fd-jp40xpc9/index.html
	 */
	@ApiField("province_code")
	private Long provinceCode;

	public Long getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public Long getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public String getMachineAddress() {
		return this.machineAddress;
	}
	public void setMachineAddress(String machineAddress) {
		this.machineAddress = machineAddress;
	}

	public Long getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

}
