package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农作物单类信息明细查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 15:12:25
 */
public class AnttechBlockchainDefinDataserviceCropdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3582727919562159611L;

	/**
	 * 产品类型，根据定义多期的产品类型进行输入，1002/1005/1006/1007/1008/1010/1011
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 区域编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域类型，PLOT/PROVINCE/CITY/COUNTY/TOWN
	 */
	@ApiField("region_type")
	private String regionType;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

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
