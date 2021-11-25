package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机地址信息
 *
 * @author auto create
 * @since 1.0, 2021-04-21 21:45:19
 */
public class SmartAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 7166534398863125817L;

	/**
	 * 行政区代码-区，使用蚂蚁标准行政区划代码，可参考
http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2020/index.html 注意：【区】 代码请使用由左开始的 6 位数字。
	 */
	@ApiField("area_code")
	private Long areaCode;

	/**
	 * 行政区代码-市，使用蚂蚁标准行政区划代码，可参考
http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2020/index.html 注意：【市】 代码请使用由左开始的 6 位数字。
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
http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2020/index.html
注意：【省】 代码请使用由左开始的 6 位数字。
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
