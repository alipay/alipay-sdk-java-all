package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多渠道有礼配置记录
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:46:12
 */
public class MultiChannelJoinGiftRecordVO extends AlipayObject {

	private static final long serialVersionUID = 3129946545233822128L;

	/**
	 * 配置渠道code列表
	 */
	@ApiListField("channel_list")
	@ApiField("string")
	private List<String> channelList;

	/**
	 * 渠道名称列表
	 */
	@ApiListField("channel_name_list")
	@ApiField("string")
	private List<String> channelNameList;

	/**
	 * 到期的入群有礼个数。单位：个数。
	 */
	@ApiField("expire_cnt")
	private Long expireCnt;

	/**
	 * 入群有礼渠道个数。单位：个数。
	 */
	@ApiField("gift_cnt")
	private Long giftCnt;

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
	 * 有效入群有礼个数。单位：个数。
	 */
	@ApiField("init_cnt")
	private Long initCnt;

	/**
	 * 失效入群有礼个数。单位：个数。
	 */
	@ApiField("invalid_cnt")
	private Long invalidCnt;

	/**
	 * 暂停的入群有礼个数。单位：个数。
	 */
	@ApiField("suspend_cnt")
	private Long suspendCnt;

	/**
	 * 有效的入群有礼个数。单位：个数。
	 */
	@ApiField("valid_cnt")
	private Long validCnt;

	public List<String> getChannelList() {
		return this.channelList;
	}
	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}

	public List<String> getChannelNameList() {
		return this.channelNameList;
	}
	public void setChannelNameList(List<String> channelNameList) {
		this.channelNameList = channelNameList;
	}

	public Long getExpireCnt() {
		return this.expireCnt;
	}
	public void setExpireCnt(Long expireCnt) {
		this.expireCnt = expireCnt;
	}

	public Long getGiftCnt() {
		return this.giftCnt;
	}
	public void setGiftCnt(Long giftCnt) {
		this.giftCnt = giftCnt;
	}

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

	public Long getInitCnt() {
		return this.initCnt;
	}
	public void setInitCnt(Long initCnt) {
		this.initCnt = initCnt;
	}

	public Long getInvalidCnt() {
		return this.invalidCnt;
	}
	public void setInvalidCnt(Long invalidCnt) {
		this.invalidCnt = invalidCnt;
	}

	public Long getSuspendCnt() {
		return this.suspendCnt;
	}
	public void setSuspendCnt(Long suspendCnt) {
		this.suspendCnt = suspendCnt;
	}

	public Long getValidCnt() {
		return this.validCnt;
	}
	public void setValidCnt(Long validCnt) {
		this.validCnt = validCnt;
	}

}
