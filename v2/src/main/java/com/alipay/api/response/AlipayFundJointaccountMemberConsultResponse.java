package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberStatusRespDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:41
 */
public class AlipayFundJointaccountMemberConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2225269191247216155L;

	/** 
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 返回码
10000-成功
其他都是失败
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 员工列表
	 */
	@ApiListField("member_list")
	@ApiField("member_status_resp_d_t_o")
	private List<MemberStatusRespDTO> memberList;

	/** 
	 * 描述信息
	 */
	@ApiField("msg")
	private String msg;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMemberList(List<MemberStatusRespDTO> memberList) {
		this.memberList = memberList;
	}
	public List<MemberStatusRespDTO> getMemberList( ) {
		return this.memberList;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
