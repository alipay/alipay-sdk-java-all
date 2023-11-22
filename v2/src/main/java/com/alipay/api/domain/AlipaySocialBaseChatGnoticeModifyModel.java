package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交修改群公告
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:55
 */
public class AlipaySocialBaseChatGnoticeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7298587895348954425L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群公告
	 */
	@ApiField("group_notice")
	private String groupNotice;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupNotice() {
		return this.groupNotice;
	}
	public void setGroupNotice(String groupNotice) {
		this.groupNotice = groupNotice;
	}

}
