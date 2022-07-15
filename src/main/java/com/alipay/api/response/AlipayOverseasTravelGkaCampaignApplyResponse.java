package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PrizeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.gka.campaign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:41
 */
public class AlipayOverseasTravelGkaCampaignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8731728524334428498L;

	/** 
	 * 奖品信息，发奖成功时返回
	 */
	@ApiField("prize_info")
	private PrizeInfo prizeInfo;

	/** 
	 * 结果码，枚举值，目前支持TRIGGER_SUCCESS（发奖成功）、FREQ_OR_COUNT_LIMIT（频率或次数超限）、RULE_NOT_PASS（不满足活动规则）、CAMP_NOT_VALID（活动未生效）、NOT_WIN（未中奖）
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息，与result_code对应的结果信息提示，参见result_code
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setPrizeInfo(PrizeInfo prizeInfo) {
		this.prizeInfo = prizeInfo;
	}
	public PrizeInfo getPrizeInfo( ) {
		return this.prizeInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
