package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询优惠券列表
 *
 * @author auto create
 * @since 1.0, 2024-05-22 16:19:37
 */
public class AlipayCloudCloudbaseCouponsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6423543396981782256L;

	/**
	 * 小程序云的appID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}
