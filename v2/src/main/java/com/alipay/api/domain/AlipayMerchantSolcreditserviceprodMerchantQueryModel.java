package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户详情
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:52
 */
public class AlipayMerchantSolcreditserviceprodMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7268151145267692332L;

	/**
	 * 直付通进件后获取
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
