package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营卡退卡
 *
 * @author auto create
 * @since 1.0, 2022-12-07 10:53:15
 */
public class AlipayMarketingCampaignUnicardCardRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1282578966427598114L;

	/**
	 * 联营卡卡号。 用户在C端开通的联营卡后分配的卡号，目前一个周期的卡号是唯一的，且卡号会对应确定的卡模板id。
	 */
	@ApiField("uni_card_no")
	private String uniCardNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUniCardNo() {
		return this.uniCardNo;
	}
	public void setUniCardNo(String uniCardNo) {
		this.uniCardNo = uniCardNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
