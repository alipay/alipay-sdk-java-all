package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainTransactionApiDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.transaction.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:41:11
 */
public class AnttechDataServiceBlockchainTransactionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7247964955167812669L;

	/** 
	 * 交易列表
	 */
	@ApiListField("transaction_list")
	@ApiField("block_chain_transaction_api_d_o")
	private List<BlockChainTransactionApiDO> transactionList;

	public void setTransactionList(List<BlockChainTransactionApiDO> transactionList) {
		this.transactionList = transactionList;
	}
	public List<BlockChainTransactionApiDO> getTransactionList( ) {
		return this.transactionList;
	}

}
