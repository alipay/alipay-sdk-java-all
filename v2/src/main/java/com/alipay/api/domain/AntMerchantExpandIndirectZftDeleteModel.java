package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户作废
 *
 * @author auto create
 * @since 1.0, 2024-04-12 09:53:05
 */
public class AntMerchantExpandIndirectZftDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5847556973496884996L;

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
