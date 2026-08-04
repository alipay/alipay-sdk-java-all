package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托人下可投短剧生活号列表
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AlipayDataDataserviceAdcampaignSeriestabQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3188722118577248828L;

	/**
	 * 商家标识
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
