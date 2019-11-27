package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 17:08:36
 */
public class AnttechDataServiceBlockchainAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1311742452838874738L;

	/** 
	 * 账号列表
	 */
	@ApiListField("account_list")
	@ApiField("block_chain_account")
	private List<BlockChainAccount> accountList;

	public void setAccountList(List<BlockChainAccount> accountList) {
		this.accountList = accountList;
	}
	public List<BlockChainAccount> getAccountList( ) {
		return this.accountList;
	}

}
