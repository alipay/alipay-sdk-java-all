package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampaignPrize;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 18:12:37
 */
public class AnttechMorseMarketingRtaConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296653727528314897L;

	/** 
	 * 查询准入标识本次查询准入结果，true|false，true代表可以准入，false代表不准入或不在服务人群
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 活动奖品信息，list对象，描述用户命中活动后能享有的奖品信息，包含活动id、渠道信息、创意信息和权益信息，只有命中的情况下必选
	 */
	@ApiListField("campaign_prize")
	@ApiField("campaign_prize")
	private List<CampaignPrize> campaignPrize;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCampaignPrize(List<CampaignPrize> campaignPrize) {
		this.campaignPrize = campaignPrize;
	}
	public List<CampaignPrize> getCampaignPrize( ) {
		return this.campaignPrize;
	}

}
