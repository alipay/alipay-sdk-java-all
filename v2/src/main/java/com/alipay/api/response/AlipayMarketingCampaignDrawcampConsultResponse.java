package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KnPrizeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:28:45
 */
public class AlipayMarketingCampaignDrawcampConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2623711383347117386L;

	/** 
	 * 营销海豚活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 咨询错误码：为空时表示活动咨询正常，不为空时表示活动咨询失败。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 咨询错误码描述：为空时表示活动咨询正常，不为空时表示活动咨询失败
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 咨询有效的奖品列表，是一个ArrayList
	 */
	@ApiListField("valid_prize_infos")
	@ApiField("kn_prize_info")
	private List<KnPrizeInfo> validPrizeInfos;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setValidPrizeInfos(List<KnPrizeInfo> validPrizeInfos) {
		this.validPrizeInfos = validPrizeInfos;
	}
	public List<KnPrizeInfo> getValidPrizeInfos( ) {
		return this.validPrizeInfos;
	}

}
