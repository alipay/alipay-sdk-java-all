package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小游戏列表查询
 *
 * @author auto create
 * @since 1.0, 2025-06-17 13:55:23
 */
public class AlipayDataDataserviceAdcampaignTinygameQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3346473646131925898L;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取
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
