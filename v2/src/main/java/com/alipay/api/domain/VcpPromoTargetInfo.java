package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销内容
 *
 * @author auto create
 * @since 1.0, 2026-08-11 14:39:20
 */
public class VcpPromoTargetInfo extends AlipayObject {

	private static final long serialVersionUID = 7182724655895968394L;

	/**
	 * 营销目标
	 */
	@ApiField("biz_indicator")
	private VcpBizIndicator bizIndicator;

	/**
	 * 目标数值
	 */
	@ApiField("indicator_value")
	private String indicatorValue;

	/**
	 * 业务域code
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 业务域名称
	 */
	@ApiField("region_name")
	private String regionName;

	public VcpBizIndicator getBizIndicator() {
		return this.bizIndicator;
	}
	public void setBizIndicator(VcpBizIndicator bizIndicator) {
		this.bizIndicator = bizIndicator;
	}

	public String getIndicatorValue() {
		return this.indicatorValue;
	}
	public void setIndicatorValue(String indicatorValue) {
		this.indicatorValue = indicatorValue;
	}

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

}
