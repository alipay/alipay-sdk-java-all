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
 * @since 1.0, 2023-05-04 16:47:11
 */
public class AnttechDataServiceBlockchainAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3118525235859845445L;

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
