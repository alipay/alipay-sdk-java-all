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
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDataConfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379472921499723414L;

	/** 
	 * 渠道类型配置
koubei.advert.commission.channel.create创建的渠道，渠道类型必须在“该配置提供的范围”
	 */
	@ApiListField("channel_types")
	@ApiField("kbadvert_channel_type_response")
	private List<KbadvertChannelTypeResponse> channelTypes;

	/** 
	 * 分佣配置金额限制要求
koubei.advert.commission.mission.create接口中，分佣金额、比例，需要满足该配置规则的要求。
percentage_clause：需满足min_commission_percentage及max_max_amount限制；
quota_clause： 满足min_quota_amount以及max_quota_amount限制
level：分佣等级，商户设置的为一级分佣配置；服务商设置的平台流量以及第三方流量为二级分佣配置（koubei.advert.commission.cascademission.create该接口设置分佣）
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
