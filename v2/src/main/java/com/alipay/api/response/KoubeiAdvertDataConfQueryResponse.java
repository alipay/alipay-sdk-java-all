package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbadvertChannelTypeResponse;
import com.alipay.api.domain.KbadvertCommissionLimit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.conf.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:33
 */
public class KoubeiAdvertDataConfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3887566344358962567L;

	/** 
	 * 渠道类型配置
	 */
	@ApiListField("channel_types")
	@ApiField("kbadvert_channel_type_response")
	private List<KbadvertChannelTypeResponse> channelTypes;

	/** 
	 * 分佣配置金额
	 */
	@ApiListField("commission_limits")
	@ApiField("kbadvert_commission_limit")
	private List<KbadvertCommissionLimit> commissionLimits;

	public void setChannelTypes(List<KbadvertChannelTypeResponse> channelTypes) {
		this.channelTypes = channelTypes;
	}
	public List<KbadvertChannelTypeResponse> getChannelTypes( ) {
		return this.channelTypes;
	}

	public void setCommissionLimits(List<KbadvertCommissionLimit> commissionLimits) {
		this.commissionLimits = commissionLimits;
	}
	public List<KbadvertCommissionLimit> getCommissionLimits( ) {
		return this.commissionLimits;
	}

}
