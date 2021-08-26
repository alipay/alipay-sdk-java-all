package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.promotion.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-25 11:38:05
 */
public class AlipayOverseasTravelRatePromotionVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5599644891586682234L;

	/** 
	 * 业务结果编码
BIZ_SUCCESS(业务成功)
USER_UNCERTIFIED(用户未实名认证)
USER_PROMOTION_GRADE_NOT_SATISFIABLE(用户权益等级不符合参与条件)
PROMOTION_NOT_EXIST(权益活动不存在)
PROMOTION_NOT_YET_STARTED(权益活动尚未开始)
PROMOTION_IS_EXPIRED(权益活动已结束)
PROMOTION_HAS_BEEN_RECEIVED(已经领取权益、权益生效中，无法再次领取)
PROMOTION_OVER_PARTICIPATION_LIMIT(参与次数超过权益活动限制次数)
PROMOTION_INVALID_PARTICIPATION_INTERVAL	(活动参与间隔时间不满足活动限制条件)
USER_NOT_EXITS(用户不存在)
	 */
	@ApiField("biz_result_code")
	private String bizResultCode;

	/** 
	 * 业务结果msg
BIZ_SUCCESS(业务成功)
USER_UNCERTIFIED(用户未实名认证)
USER_PROMOTION_GRADE_NOT_SATISFIABLE(用户权益等级不符合参与条件)
PROMOTION_NOT_EXIST(权益活动不存在)
PROMOTION_NOT_YET_STARTED(权益活动尚未开始)
PROMOTION_IS_EXPIRED(权益活动已结束)
PROMOTION_HAS_BEEN_RECEIVED(已经领取权益、权益生效中，无法再次领取)
PROMOTION_OVER_PARTICIPATION_LIMIT(参与次数超过权益活动限制次数)
PROMOTION_INVALID_PARTICIPATION_INTERVAL	(活动参与间隔时间不满足活动限制条件)
USER_NOT_EXITS(用户不存在)
	 */
	@ApiField("biz_result_msg")
	private String bizResultMsg;

	public void setBizResultCode(String bizResultCode) {
		this.bizResultCode = bizResultCode;
	}
	public String getBizResultCode( ) {
		return this.bizResultCode;
	}

	public void setBizResultMsg(String bizResultMsg) {
		this.bizResultMsg = bizResultMsg;
	}
	public String getBizResultMsg( ) {
		return this.bizResultMsg;
	}

}
