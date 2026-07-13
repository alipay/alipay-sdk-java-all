package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单元详情查询
 *
 * @author auto create
 * @since 1.0, 2026-05-14 19:33:25
 */
public class AlipayDataDataserviceAdcampaignGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8895329389742969894L;

	/**
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
