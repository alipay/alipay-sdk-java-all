package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberBenefit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.benefits.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserMemberBenefitsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2444396881183325682L;

	/** 
	 * 权益集合
	 */
	@ApiListField("benefits")
	@ApiField("member_benefit")
	private List<MemberBenefit> benefits;

	/** 
	 * 处理结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 处理结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setBenefits(List<MemberBenefit> benefits) {
		this.benefits = benefits;
	}
	public List<MemberBenefit> getBenefits( ) {
		return this.benefits;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
