package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.card.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserUnicomCardInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626568183675937471L;

	/** 
	 * 业务处理结果 （成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("card_sync_result")
	private String cardSyncResult;

	/** 
	 * 状态发生变更的用户的联通手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardSyncResult(String cardSyncResult) {
		this.cardSyncResult = cardSyncResult;
	}
	public String getCardSyncResult( ) {
		return this.cardSyncResult;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
