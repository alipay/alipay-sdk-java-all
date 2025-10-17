package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅用户状态判断接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 19:11:41
 */
public class SubscribeStatusApiResponse extends AlipayObject {

	private static final long serialVersionUID = 4332619795128897348L;

	/**
	 * 订阅状态 会员版本在有效期内：VALID 会员版本已过期：INVALID
	 */
	@ApiField("member_status")
	private String memberStatus;

	/**
	 * 用来展示订阅信息
	 */
	@ApiField("subscribe_member_info_d_t_o")
	private SubscribeMemberInfoDTO subscribeMemberInfoDTO;

	public String getMemberStatus() {
		return this.memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public SubscribeMemberInfoDTO getSubscribeMemberInfoDTO() {
		return this.subscribeMemberInfoDTO;
	}
	public void setSubscribeMemberInfoDTO(SubscribeMemberInfoDTO subscribeMemberInfoDTO) {
		this.subscribeMemberInfoDTO = subscribeMemberInfoDTO;
	}

}
