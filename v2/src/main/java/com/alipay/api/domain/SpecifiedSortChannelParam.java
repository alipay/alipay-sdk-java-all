package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户代扣协议设置的优先扣款渠道

 *
 * @author auto create
 * @since 1.0, 2026-08-11 13:45:14
 */
public class SpecifiedSortChannelParam extends AlipayObject {

	private static final long serialVersionUID = 1897466559324983383L;

	/**
	 * 资产编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 指定支付渠道标识
	 */
	@ApiField("assigned_channel")
	private String assignedChannel;

	/**
	 * 支付渠道名称
	 */
	@ApiField("channel_full_name")
	private String channelFullName;

	/**
	 * 支付渠道索引
	 */
	@ApiField("channel_index")
	private String channelIndex;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getAssignedChannel() {
		return this.assignedChannel;
	}
	public void setAssignedChannel(String assignedChannel) {
		this.assignedChannel = assignedChannel;
	}

	public String getChannelFullName() {
		return this.channelFullName;
	}
	public void setChannelFullName(String channelFullName) {
		this.channelFullName = channelFullName;
	}

	public String getChannelIndex() {
		return this.channelIndex;
	}
	public void setChannelIndex(String channelIndex) {
		this.channelIndex = channelIndex;
	}

}
