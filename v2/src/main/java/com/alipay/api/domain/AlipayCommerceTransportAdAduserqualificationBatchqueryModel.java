package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告主资质列表查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:08
 */
public class AlipayCommerceTransportAdAduserqualificationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2515536674178596476L;

	/**
	 * 广告主用户id + 根据广告主用户id查询对应的广告主资质列表
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

}
