package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sdk数据同步
 *
 * @author auto create
 * @since 1.0, 2019-08-06 19:42:39
 */
public class AlipayOpenSdkDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1797861684625992127L;

	/**
	 * 根证书sn列表
	 */
	@ApiField("alipay_root_cert")
	private String alipayRootCert;

	public String getAlipayRootCert() {
		return this.alipayRootCert;
	}
	public void setAlipayRootCert(String alipayRootCert) {
		this.alipayRootCert = alipayRootCert;
	}

}
