package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.channel.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-30 20:07:05
 */
public class SsdataFindataOperatorChannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8816695266392561968L;

	/** 
	 * 运营商渠道信息，其中item_status枚举：ENABLE（可用），DISABLE(不可用)。
	 */
	@ApiListField("channels")
	@ApiField("operator_channel_info")
	private List<OperatorChannelInfo> channels;

	public void setChannels(List<OperatorChannelInfo> channels) {
		this.channels = channels;
	}
	public List<OperatorChannelInfo> getChannels( ) {
		return this.channels;
	}

}
