package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CombinePrizeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.activityorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-02 14:27:43
 */
public class AlipayUserDtbankcustActivityorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1564322892414667948L;

	/** 
	 * 数字分行活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动流水单据唯一id
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 组合券包发奖结果，包含所有需要消费的字段
	 */
	@ApiField("combine_prize_result")
	private CombinePrizeResult combinePrizeResult;

	/** 
	 * 外部唯一业务幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 发放流水状态，SUCCESS表示发放成功，FAILED表示发放失败，INIT表示发放处理中，可原单重试发放，勿换单重试，以免导致额外损失
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券平台唯一id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setCombinePrizeResult(CombinePrizeResult combinePrizeResult) {
		this.combinePrizeResult = combinePrizeResult;
	}
	public CombinePrizeResult getCombinePrizeResult( ) {
		return this.combinePrizeResult;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
