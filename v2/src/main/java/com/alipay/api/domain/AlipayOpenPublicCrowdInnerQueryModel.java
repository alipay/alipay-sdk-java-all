package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号人群摘要查询
 *
 * @author auto create
 * @since 1.0, 2022-06-01 15:29:59
 */
public class AlipayOpenPublicCrowdInnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1318599967958492128L;

	/**
	 * 人群来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 外部人群id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
