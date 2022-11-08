package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户作废
 *
 * @author auto create
 * @since 1.0, 2022-07-14 13:38:22
 */
public class AntMerchantExpandIndirectZftDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3743172373386317325L;

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
