package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字凭证VP查询
 *
 * @author auto create
 * @since 1.0, 2026-09-07 17:10:00
 */
public class DatadigitalFincloudGeneralsaasDigitalcredentialVpQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5358431572882531884L;

	/**
	 * 数字凭证初始化接口返回的certify_id，用于查询加密VP。
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
