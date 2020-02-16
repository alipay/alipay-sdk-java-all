package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:43:43
 */
public class LogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 6627272269285424566L;

	/**
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
