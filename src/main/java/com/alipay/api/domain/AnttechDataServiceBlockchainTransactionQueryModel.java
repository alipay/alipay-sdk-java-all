package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询区块链交易记录列表
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:37
 */
public class AnttechDataServiceBlockchainTransactionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5721711235179972749L;

	/**
	 * 区块链ID
	 */
	@ApiField("block_chain_id")
	private String blockChainId;

	/**
	 * 区块链块唯一hash
	 */
	@ApiField("block_hash")
	private String blockHash;

	/**
	 * 交易结束时间戳
	 */
	@ApiField("end_timestamp")
	private Long endTimestamp;

	/**
	 * 交易来源账户
	 */
	@ApiField("from_account")
	private String fromAccount;

	/**
	 * 分页页号
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 交易开始时间戳
	 */
	@ApiField("start_timestamp")
	private Long startTimestamp;

	/**
	 * 交易目标账户
	 */
	@ApiField("to_account")
	private String toAccount;

	/**
	 * 交易唯一hash
	 */
	@ApiField("transaction_hash")
	private String transactionHash;

	/**
	 * 交易类型
	 */
	@ApiField("transaction_type")
	private Long transactionType;

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

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}
	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public String getFromAccount() {
		return this.fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStartTimestamp() {
		return this.startTimestamp;
	}
	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
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

	public Long getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(Long transactionType) {
		this.transactionType = transactionType;
	}

}
