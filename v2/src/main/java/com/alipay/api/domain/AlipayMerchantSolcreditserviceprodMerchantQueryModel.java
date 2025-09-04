package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户详情
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:51:24
 */
public class AlipayMerchantSolcreditserviceprodMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7349286772545858772L;

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
