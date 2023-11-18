package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备检测报告上传
 *
 * @author auto create
 * @since 1.0, 2022-01-12 20:00:26
 */
public class AlipayCommerceIotDeviceReportUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8686984811633667551L;

	/**
	 * 设备检测报告详情
	 */
	@ApiField("report_content")
	private String reportContent;

	/**
	 * 设备唯一标识
	 */
	@ApiField("sn")
	private String sn;

	public String getReportContent() {
		return this.reportContent;
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
