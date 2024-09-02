package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通行证详情
 *
 * @author auto create
 * @since 1.0, 2023-06-20 10:26:34
 */
public class PassportDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 8713181562939285549L;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 成员用户信息
	 */
	@ApiField("member")
	private MemberDTO member;

	/**
	 * 账号信息
	 */
	@ApiListField("pass_accounts")
	@ApiField("pass_account_d_t_o")
	private List<PassAccountDTO> passAccounts;

	/**
	 * 通行证状态
	 */
	@ApiField("status")
	private String status;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public MemberDTO getMember() {
		return this.member;
	}
	public void setMember(MemberDTO member) {
		this.member = member;
	}

	public List<PassAccountDTO> getPassAccounts() {
		return this.passAccounts;
	}
	public void setPassAccounts(List<PassAccountDTO> passAccounts) {
		this.passAccounts = passAccounts;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
