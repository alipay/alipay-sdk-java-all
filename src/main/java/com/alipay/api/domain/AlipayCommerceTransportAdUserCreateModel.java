package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增广告主
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:41
 */
public class AlipayCommerceTransportAdUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4596698963636814125L;

	/**
	 * 广告主用户信息，参见文档
	 */
	@ApiField("ad_user")
	private AdUser adUser;

	public AdUser getAdUser() {
		return this.adUser;
	}
	public void setAdUser(AdUser adUser) {
		this.adUser = adUser;
	}

}
