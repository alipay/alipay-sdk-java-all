package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询创意详情
 *
 * @author auto create
 * @since 1.0, 2025-07-14 21:01:47
 */
public class AlipayDataDataserviceAdcampaignCreativeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2623132549188637155L;

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
