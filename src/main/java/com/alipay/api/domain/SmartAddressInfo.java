package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机地址信息
 *
 * @author auto create
 * @since 1.0, 2018-08-10 11:46:58
 */
public class SmartAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 6244197164277451515L;

	/**
	 * 行政区代码-区，使用国家行政区划代码，可参考http://preview.www.mca.gov.cn/article/sj/xzqh/2018/201805/20180506280855.html
	 */
	@ApiField("area_code")
	private Long areaCode;

	/**
	 * 行政区代码-市，使用国家行政区划代码，可参考http://preview.www.mca.gov.cn/article/sj/xzqh/2018/201805/20180506280855.html
	 */
	@ApiField("city_code")
	private Long cityCode;

	/**
	 * 自助售货机地址
	 */
	@ApiField("machine_address")
	private String machineAddress;

	/**
	 * 行政区代码-省，使用国家行政区划代码，可参考http://preview.www.mca.gov.cn/article/sj/xzqh/2018/201805/20180506280855.html
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
