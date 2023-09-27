package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户结算信息查询
 *
 * @author auto create
 * @since 1.0, 2023-09-21 14:49:31
 */
public class AntMerchantExpandIndirectZftsubsettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1794635447352262391L;

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
