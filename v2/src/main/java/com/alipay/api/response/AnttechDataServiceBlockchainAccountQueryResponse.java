package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainAccountApiDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:16:16
 */
public class AnttechDataServiceBlockchainAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1566285623628719442L;

	/** 
	 * 账户列表
	 */
	@ApiListField("account_list")
	@ApiField("block_chain_account_api_d_o")
	private List<BlockChainAccountApiDO> accountList;

	public void setAccountList(List<BlockChainAccountApiDO> accountList) {
		this.accountList = accountList;
	}
	public List<BlockChainAccountApiDO> getAccountList( ) {
		return this.accountList;
	}

}
