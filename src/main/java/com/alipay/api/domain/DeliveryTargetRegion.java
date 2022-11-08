package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自运营投放目标区域
 *
 * @author auto create
 * @since 1.0, 2022-04-08 15:27:42
 */
public class DeliveryTargetRegion extends AlipayObject {

	private static final long serialVersionUID = 6712215973629213234L;

	/**
	 * 区域编码，参考<a href="https://opendocs.alipay.com/pre-open/03144c" target="_blank">取值说明</a>
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域名，参考<a href="https://opendocs.alipay.com/pre-open/03144c" target="_blank">取值说明</a>
	 */
	@ApiField("region_name")
	private String regionName;

	/**
	 * 区域类型，1代表全国，2代表省级区域，3代表市级区域，参考<a href="https://opendocs.alipay.com/pre-open/03144c" target="_blank">取值说明</a>
	 */
	@ApiField("region_type")
	private String regionType;

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

}
