package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainTransaction;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.transaction.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 17:15:25
 */
public class AnttechDataServiceBlockchainTransactionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3827726816693779958L;

	/** 
	 * 交易列表
	 */
	@ApiListField("transaction_list")
	@ApiField("block_chain_transaction")
	private List<BlockChainTransaction> transactionList;

	public void setTransactionList(List<BlockChainTransaction> transactionList) {
		this.transactionList = transactionList;
	}
	public List<BlockChainTransaction> getTransactionList( ) {
		return this.transactionList;
	}

}
