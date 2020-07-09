package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证可用点数。
 *
 * @author auto create
 * @since 1.0, 2020-05-06 17:59:44
 */
public class CertAvailableNumVO extends AlipayObject {

	private static final long serialVersionUID = 1232514262754435831L;

	/**
	 * 凭证可用点数。
	 */
	@ApiField("available_num")
	private Long availableNum;

	/**
	 * 凭证模板ID。
	 */
	@ApiField("cert_template_id")
	private String certTemplateId;

	public Long getAvailableNum() {
		return this.availableNum;
	}
	public void setAvailableNum(Long availableNum) {
		this.availableNum = availableNum;
	}

	public String getCertTemplateId() {
		return this.certTemplateId;
	}
	public void setCertTemplateId(String certTemplateId) {
		this.certTemplateId = certTemplateId;
	}

}
