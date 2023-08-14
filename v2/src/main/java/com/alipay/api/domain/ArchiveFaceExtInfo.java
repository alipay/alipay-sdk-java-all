package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 档案人脸扩展信息
 *
 * @author auto create
 * @since 1.0, 2019-07-09 16:45:02
 */
public class ArchiveFaceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4833136546472282167L;

	/**
	 * 证件提供者的支付宝uid
	 */
	@ApiField("provider_uid")
	private String providerUid;

	public String getProviderUid() {
		return this.providerUid;
	}
	public void setProviderUid(String providerUid) {
		this.providerUid = providerUid;
	}

}
