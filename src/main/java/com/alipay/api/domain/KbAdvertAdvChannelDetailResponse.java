package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告渠道绑定详情信息
 *
 * @author auto create
 * @since 1.0, 2017-07-05 14:38:38
 */
public class KbAdvertAdvChannelDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 2264433431776663676L;

	/**
	 * 广告内容信息，广告投放的二维码、短链接等信息，通过广告内容信息，用户可以渠道广告
	 */
	@ApiField("adv_content_list")
	private KbAdvertAdvContentDetailResponse advContentList;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	public KbAdvertAdvContentDetailResponse getAdvContentList() {
		return this.advContentList;
	}
	public void setAdvContentList(KbAdvertAdvContentDetailResponse advContentList) {
		this.advContentList = advContentList;
	}

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

}
