package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给ISV和开发者查询广告的接口
 *
 * @author auto create
 * @since 1.0, 2017-08-18 15:36:18
 */
public class AlipayMarketingCdpAdvertiseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6625192319888398559L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

}
