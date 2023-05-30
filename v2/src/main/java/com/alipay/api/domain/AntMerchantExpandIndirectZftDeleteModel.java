package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户作废
 *
 * @author auto create
 * @since 1.0, 2023-05-23 14:27:17
 */
public class AntMerchantExpandIndirectZftDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1439541968413876846L;

	/**
	 * 直付通二级商户smid
	 */
	@ApiField("smid")
	private String smid;

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
