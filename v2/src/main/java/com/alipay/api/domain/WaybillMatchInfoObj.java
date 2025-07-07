package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流匹配包裹信息
 *
 * @author auto create
 * @since 1.0, 2025-03-27 17:20:42
 */
public class WaybillMatchInfoObj extends AlipayObject {

	private static final long serialVersionUID = 4712968983572974931L;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 匹配类型
	 */
	@ApiField("match_type")
	private String matchType;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMatchType() {
		return this.matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
