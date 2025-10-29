package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本机校验查询
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:44:51
 */
public class DatadigitalFincloudGeneralsaasOnepassQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4822126452588776147L;

	/**
	 * 填入一键登录/H5一键登录阶段获取到的certify_id
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
