package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户最新审核中信息
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:49
 */
public class AlipayMerchantSolcreditserviceprodMerchantreviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8145563677257326733L;

	/**
	 * 直付通进件
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
