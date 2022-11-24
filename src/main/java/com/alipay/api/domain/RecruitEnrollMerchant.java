package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名商户信息
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:36
 */
public class RecruitEnrollMerchant extends AlipayObject {

	private static final long serialVersionUID = 5864128928377988283L;

	/**
	 * 商户唯一ID(商户pid)
	 */
	@ApiField("merchant_uid")
	private String merchantUid;

	public String getMerchantUid() {
		return this.merchantUid;
	}
	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

}
