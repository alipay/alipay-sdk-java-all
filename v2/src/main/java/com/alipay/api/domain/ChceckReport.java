package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 11:17:42
 */
public class ChceckReport extends AlipayObject {

	private static final long serialVersionUID = 5687199935185775961L;

	/**
	 * 出报告的时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 报告的PDF地址
	 */
	@ApiField("pdf_url")
	private String pdfUrl;

	/**
	 * 项目名称
	 */
	@ApiField("test_name")
	private String testName;

	/**
	 * 履约方的项目编码
	 */
	@ApiField("vendor_code")
	private String vendorCode;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPdfUrl() {
		return this.pdfUrl;
	}
	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getTestName() {
		return this.testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getVendorCode() {
		return this.vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

}
