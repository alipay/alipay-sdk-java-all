package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农作物基础信息查询
 *
 * @author auto create
 * @since 1.0, 2022-10-10 19:45:48
 */
public class AnttechBlockchainDefinDataserviceCropbaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6836669499636416217L;

	/**
	 * 区域编码，省市区镇四级编码或区块ID
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域类型，PLOT/PROVINCE/CITY/COUNTY/TOWN
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
