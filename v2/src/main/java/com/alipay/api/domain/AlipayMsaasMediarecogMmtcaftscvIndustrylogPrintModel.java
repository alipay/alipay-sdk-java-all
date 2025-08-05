package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业侧业务日志接收打印
 *
 * @author auto create
 * @since 1.0, 2025-06-19 10:29:28
 */
public class AlipayMsaasMediarecogMmtcaftscvIndustrylogPrintModel extends AlipayObject {

	private static final long serialVersionUID = 7731212448273464511L;

	/**
	 * 不同业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 日志内容
	 */
	@ApiField("log_content")
	private String logContent;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getLogContent() {
		return this.logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

}
