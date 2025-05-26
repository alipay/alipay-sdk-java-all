package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询创意详情
 *
 * @author auto create
 * @since 1.0, 2025-05-12 17:36:47
 */
public class AlipayDataDataserviceAdcampaignCreativeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6653365775758781776L;

	/**
	 * 创意ID
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
