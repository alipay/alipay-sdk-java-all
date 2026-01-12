package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约方同步完成消息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 11:17:42
 */
public class AlipayCommerceMedicalHdfinspectionCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 1635445416337227555L;

	/**
	 * 双方定义
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * null
	 */
	@ApiListField("reports")
	@ApiField("chceck_report")
	private List<ChceckReport> reports;

	/**
	 * 履约方定义
	 */
	@ApiField("reserve_code")
	private String reserveCode;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public List<ChceckReport> getReports() {
		return this.reports;
	}
	public void setReports(List<ChceckReport> reports) {
		this.reports = reports;
	}

	public String getReserveCode() {
		return this.reserveCode;
	}
	public void setReserveCode(String reserveCode) {
		this.reserveCode = reserveCode;
	}

}
