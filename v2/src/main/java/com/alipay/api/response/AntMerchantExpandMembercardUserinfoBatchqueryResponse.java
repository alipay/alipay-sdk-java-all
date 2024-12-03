package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.userinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:02:27
 */
public class AntMerchantExpandMembercardUserinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5248774839375849487L;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 会员信息列表
	 */
	@ApiListField("user_info_list")
	@ApiField("member_card_user_info")
	private List<MemberCardUserInfo> userInfoList;

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setUserInfoList(List<MemberCardUserInfo> userInfoList) {
		this.userInfoList = userInfoList;
	}
	public List<MemberCardUserInfo> getUserInfoList( ) {
		return this.userInfoList;
	}

}
