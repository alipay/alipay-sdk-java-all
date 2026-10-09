package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-22 18:07:56
 */
public class SaasEbankInstInfo extends AlipayObject {

	private static final long serialVersionUID = 3824184125493696185L;

	/**
	 * 银行机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 银行机构LOGO图片URL，可用于对客展示机构列表
	 */
	@ApiField("inst_logo_url")
	private String instLogoUrl;

	/**
	 * 银行机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstLogoUrl() {
		return this.instLogoUrl;
	}
	public void setInstLogoUrl(String instLogoUrl) {
		this.instLogoUrl = instLogoUrl;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
