package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询网商会员信息
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:48:12
 */
public class MybankCreditUserRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4615553264383866817L;

	/**
	 * 站点会员信息
	 */
	@ApiField("member")
	private Member member;

	public Member getMember() {
		return this.member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

}
