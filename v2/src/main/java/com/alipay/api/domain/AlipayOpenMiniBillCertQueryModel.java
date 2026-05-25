package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单凭证结算明细查询
 *
 * @author auto create
 * @since 1.0, 2026-05-20 13:39:35
 */
public class AlipayOpenMiniBillCertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1224143767723923574L;

	/**
	 * 凭证id（支付宝平台基于券码code生成的唯一id）
	 */
	@ApiField("certificate_id")
	private String certificateId;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

}
