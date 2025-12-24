package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户结算信息查询
 *
 * @author auto create
 * @since 1.0, 2025-06-25 16:06:38
 */
public class AntMerchantExpandIndirectZftsubsettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7364496778496847519L;

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
