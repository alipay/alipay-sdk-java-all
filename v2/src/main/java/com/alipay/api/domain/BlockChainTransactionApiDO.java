package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易明细
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:37
 */
public class BlockChainTransactionApiDO extends AlipayObject {

	private static final long serialVersionUID = 3239783522994762446L;

	/**
	 * 区块链ID
	 */
	@ApiField("block_chain_id")
	private String blockChainId;

	/**
	 * 块hash
	 */
	@ApiField("block_hash")
	private String blockHash;

	/**
	 * 块高
	 */
	@ApiField("block_height")
	private Long blockHeight;

	/**
	 * 智能科技统一客户ID
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 起始账户
	 */
	@ApiField("from_account")
	private String fromAccount;

	/**
	 * gas消耗
	 */
	@ApiField("gas_used")
	private Long gasUsed;

	/**
	 * 目标账户
	 */
	@ApiField("to_account")
	private String toAccount;

	/**
	 * 交易hash
	 */
	@ApiField("transaction_hash")
	private String transactionHash;

	/**
	 * 交易时间戳
	 */
	@ApiField("transaction_timestamp")
	private Long transactionTimestamp;

	/**
	 * 交易类型
	 */
	@ApiField("transaction_type")
	private Long transactionType;

	/**
	 * 交易金额
	 */
	@ApiField("value")
	private Long value;

	public String getBlockChainId() {
		return this.blockChainId;
	}
	public void setBlockChainId(String blockChainId) {
		this.blockChainId = blockChainId;
	}

	public String getBlockHash() {
		return this.blockHash;
	}
	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public Long getBlockHeight() {
		return this.blockHeight;
	}
	public void setBlockHeight(Long blockHeight) {
		this.blockHeight = blockHeight;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getFromAccount() {
		return this.fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getGasUsed() {
		return this.gasUsed;
	}
	public void setGasUsed(Long gasUsed) {
		this.gasUsed = gasUsed;
	}

	public String getToAccount() {
		return this.toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getTransactionHash() {
		return this.transactionHash;
	}
	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

	public Long getTransactionTimestamp() {
		return this.transactionTimestamp;
	}
	public void setTransactionTimestamp(Long transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}

	public Long getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(Long transactionType) {
		this.transactionType = transactionType;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
