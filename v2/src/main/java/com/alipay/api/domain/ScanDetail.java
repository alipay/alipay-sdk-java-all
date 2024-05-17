package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ob制品扫描详情
 *
 * @author auto create
 * @since 1.0, 2023-03-21 17:44:41
 */
public class ScanDetail extends AlipayObject {

	private static final long serialVersionUID = 1273151673242631564L;

	/**
	 * 扫描报告
	 */
	@ApiField("scan_report")
	private String scanReport;

	/**
	 * 扫描状态
	 */
	@ApiField("scan_state")
	private String scanState;

	/**
	 * 扫描类型
	 */
	@ApiField("scan_type")
	private String scanType;

	public String getScanReport() {
		return this.scanReport;
	}
	public void setScanReport(String scanReport) {
		this.scanReport = scanReport;
	}

	public String getScanState() {
		return this.scanState;
	}
	public void setScanState(String scanState) {
		this.scanState = scanState;
	}

	public String getScanType() {
		return this.scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

}
