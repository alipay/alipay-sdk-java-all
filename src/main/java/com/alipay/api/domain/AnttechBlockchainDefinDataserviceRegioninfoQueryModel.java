package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 区域坐标数据查询
 *
 * @author auto create
 * @since 1.0, 2022-10-14 10:03:13
 */
public class AnttechBlockchainDefinDataserviceRegioninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5743598764863372794L;

	/**
	 * 区域编码列表
	 */
	@ApiListField("region_codes")
	@ApiField("string")
	private List<String> regionCodes;

	/**
	 * 区域类型：PLOT / PROVINCE / CITY / COUNTY / TOWN
	 */
	@ApiField("region_type")
	private String regionType;

	public List<String> getRegionCodes() {
		return this.regionCodes;
	}
	public void setRegionCodes(List<String> regionCodes) {
		this.regionCodes = regionCodes;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

}
