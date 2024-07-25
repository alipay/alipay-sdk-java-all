package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建入群有礼
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:46:13
 */
public class AlipayMerchantGroupGroupgiftCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8866323926983233164L;

	/**
	 * 入群有礼列表。
	 */
	@ApiField("group_gifts")
	private GroupGiftVO groupGifts;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	public GroupGiftVO getGroupGifts() {
		return this.groupGifts;
	}
	public void setGroupGifts(GroupGiftVO groupGifts) {
		this.groupGifts = groupGifts;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

}
