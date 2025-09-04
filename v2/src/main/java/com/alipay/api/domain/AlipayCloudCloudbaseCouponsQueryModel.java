package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询优惠券列表
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:16
 */
public class AlipayCloudCloudbaseCouponsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5666142545761724638L;

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
