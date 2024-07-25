package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserDebitCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.info.designated.share response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:16
 */
public class AlipayUserInfoDesignatedShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 7683647352843779881L;

	/** 
	 * 用户授权给三方的借记卡相关信息
	 */
	@ApiField("debit_card_info")
	private UserDebitCardInfo debitCardInfo;

	public void setDebitCardInfo(UserDebitCardInfo debitCardInfo) {
		this.debitCardInfo = debitCardInfo;
	}
	public UserDebitCardInfo getDebitCardInfo( ) {
		return this.debitCardInfo;
	}

}
