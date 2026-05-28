package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户作废
 *
 * @author auto create
 * @since 1.0, 2026-05-13 16:53:02
 */
public class AntMerchantExpandIndirectZftDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4855589543961169339L;

	/**
	 * 二级商户smid
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
