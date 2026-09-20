package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托人下可投短剧App列表
 *
 * @author auto create
 * @since 1.0, 2026-08-27 00:04:55
 */
public class AlipayDataDataserviceAdcampaignSeriesappQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6483897681182189445L;

	/**
	 * 租户代码
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
