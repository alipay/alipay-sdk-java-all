package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实人认证查询
 *
 * @author auto create
 * @since 1.0, 2021-09-08 11:41:33
 */
public class AnttechBlockchainTwcCertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8841777999372296318L;

	/**
	 * 实人认证的id
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
