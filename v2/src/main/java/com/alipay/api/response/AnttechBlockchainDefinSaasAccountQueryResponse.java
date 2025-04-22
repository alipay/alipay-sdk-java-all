package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:52:58
 */
public class AnttechBlockchainDefinSaasAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1276923281783718765L;

	/** 
	 * 账号列表
	 */
	@ApiListField("accounts")
	@ApiField("account_v_o")
	private List<AccountVO> accounts;

	/** 
	 * 外部业务平台会员ID
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	public void setAccounts(List<AccountVO> accounts) {
		this.accounts = accounts;
	}
	public List<AccountVO> getAccounts( ) {
		return this.accounts;
	}

	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}
	public String getOutMemberId( ) {
		return this.outMemberId;
	}

}
