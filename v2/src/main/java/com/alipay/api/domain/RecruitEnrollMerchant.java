package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名商户信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 13:58:39
 */
public class RecruitEnrollMerchant extends AlipayObject {

	private static final long serialVersionUID = 8477911792649789128L;

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
