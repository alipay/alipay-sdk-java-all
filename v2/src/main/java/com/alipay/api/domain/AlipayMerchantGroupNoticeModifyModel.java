package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改群公告
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:30:12
 */
public class AlipayMerchantGroupNoticeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4188827339967226794L;

	/**
	 * 群组id列表
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 群公告
	 */
	@ApiField("notice")
	private String notice;

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

}
