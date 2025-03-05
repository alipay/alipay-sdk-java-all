package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户健康证信息查询
 *
 * @author auto create
 * @since 1.0, 2024-09-27 16:05:24
 */
public class AlipayEbppIndustryJobHealthcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4526445544455274843L;

	/**
	 * 一次认证的唯一标识,在商户调用认证页申请是拼接在回调地址上
	 */
	@ApiField("certify_token")
	private String certifyToken;

	public String getCertifyToken() {
		return this.certifyToken;
	}
	public void setCertifyToken(String certifyToken) {
		this.certifyToken = certifyToken;
	}

}
