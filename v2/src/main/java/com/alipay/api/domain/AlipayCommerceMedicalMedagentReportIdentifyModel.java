package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告图片识别接口
 *
 * @author auto create
 * @since 1.0, 2025-04-01 15:47:01
 */
public class AlipayCommerceMedicalMedagentReportIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3222692656391463448L;

	/**
	 * 报告图片链接
	 */
	@ApiField("report_pic_url")
	private String reportPicUrl;

	public String getReportPicUrl() {
		return this.reportPicUrl;
	}
	public void setReportPicUrl(String reportPicUrl) {
		this.reportPicUrl = reportPicUrl;
	}

}
