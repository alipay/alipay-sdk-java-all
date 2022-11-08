package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充配置咨询
 *
 * @author auto create
 * @since 1.0, 2022-10-26 20:05:55
 */
public class AntMerchantExpandMembercardConfigConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2575411347334324112L;

	/**
	 * 期望修改的配置
	 */
	@ApiField("member_card_set_modify_request")
	private MemberCardSetModifyRequest memberCardSetModifyRequest;

	public MemberCardSetModifyRequest getMemberCardSetModifyRequest() {
		return this.memberCardSetModifyRequest;
	}
	public void setMemberCardSetModifyRequest(MemberCardSetModifyRequest memberCardSetModifyRequest) {
		this.memberCardSetModifyRequest = memberCardSetModifyRequest;
	}

}
