package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多渠道入群有礼模型
 *
 * @author auto create
 * @since 1.0, 2024-07-30 14:28:50
 */
public class MultiChannelJoinGiftVO extends AlipayObject {

	private static final long serialVersionUID = 3726223399689894695L;

	/**
	 * 群组id，表里唯一键，创建群组自动生成
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 定义群组分类，便于后台管理运营识别，可与设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 入群有礼列表
	 */
	@ApiListField("join_gifts")
	@ApiField("group_gift_v_o")
	private List<GroupGiftVO> joinGifts;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<GroupGiftVO> getJoinGifts() {
		return this.joinGifts;
	}
	public void setJoinGifts(List<GroupGiftVO> joinGifts) {
		this.joinGifts = joinGifts;
	}

}
