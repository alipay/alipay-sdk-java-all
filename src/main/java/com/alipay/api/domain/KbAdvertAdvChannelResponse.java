package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告渠道模型
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:52
 */
public class KbAdvertAdvChannelResponse extends AlipayObject {

	private static final long serialVersionUID = 8413185595981477548L;

	/**
	 * 广告内容模型
	 */
	@ApiListField("adv_content_list")
	@ApiField("kb_advert_adv_content_response")
	private List<KbAdvertAdvContentResponse> advContentList;

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

	public List<KbAdvertAdvContentResponse> getAdvContentList() {
		return this.advContentList;
	}
	public void setAdvContentList(List<KbAdvertAdvContentResponse> advContentList) {
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
