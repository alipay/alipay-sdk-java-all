package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据Pid查询该商户下的门店是否有营业执照
 *
 * @author auto create
 * @since 1.0, 2018-08-31 14:42:09
 */
public class KoubeiServindustryShopLicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5862929191233824826L;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
