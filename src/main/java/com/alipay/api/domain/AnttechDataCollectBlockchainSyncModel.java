package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回流蚂蚁区块链链上数据
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:00
 */
public class AnttechDataCollectBlockchainSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7586584147915529573L;

	/**
	 * 链上账号列表，JSON字符串
	 */
	@ApiField("account_data")
	private String accountData;

	/**
	 * 区块链唯一ID
	 */
	@ApiField("block_chain_id")
	private String blockChainId;

	/**
	 * 链上合约列表，JSON字符串
	 */
	@ApiField("contract_data")
	private String contractData;

	/**
	 * 截止块高
	 */
	@ApiField("end_height")
	private Long endHeight;

	/**
	 * 起始块高
	 */
	@ApiField("start_height")
	private Long startHeight;

	/**
	 * 链上交易列表，JSON字符串
	 */
	@ApiField("transaction_data")
	private String transactionData;

	public String getAccountData() {
		return this.accountData;
	}
	public void setAccountData(String accountData) {
		this.accountData = accountData;
	}

	public String getBlockChainId() {
		return this.blockChainId;
	}
	public void setBlockChainId(String blockChainId) {
		this.blockChainId = blockChainId;
	}

	public String getContractData() {
		return this.contractData;
	}
	public void setContractData(String contractData) {
		this.contractData = contractData;
	}

	public Long getEndHeight() {
		return this.endHeight;
	}
	public void setEndHeight(Long endHeight) {
		this.endHeight = endHeight;
	}

	public Long getStartHeight() {
		return this.startHeight;
	}
	public void setStartHeight(Long startHeight) {
		this.startHeight = startHeight;
	}

	public String getTransactionData() {
		return this.transactionData;
	}
	public void setTransactionData(String transactionData) {
		this.transactionData = transactionData;
	}

}
