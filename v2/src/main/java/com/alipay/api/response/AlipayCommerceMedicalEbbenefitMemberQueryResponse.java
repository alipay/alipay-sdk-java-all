package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ebbenefit.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-27 14:01:57
 */
public class AlipayCommerceMedicalEbbenefitMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4498862836547447951L;

	/** 
	 * 家庭成员列表
	 */
	@ApiListField("member")
	@ApiField("member_v_o")
	private List<MemberVO> member;

	public void setMember(List<MemberVO> member) {
		this.member = member;
	}
	public List<MemberVO> getMember( ) {
		return this.member;
	}

}
