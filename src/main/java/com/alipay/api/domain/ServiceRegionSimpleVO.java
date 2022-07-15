package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务区域
 *
 * @author auto create
 * @since 1.0, 2019-12-04 19:59:24
 */
public class ServiceRegionSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 7498439234557944564L;

	/**
	 * 区域码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 0=全球
1=国家
2=省
3=市
4=区县
5=乡镇街道
9=自定义
601=小区poi
	 */
	@ApiField("region_type")
	private String regionType;

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

}
