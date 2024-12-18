package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户明细
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:19
 */
public class BlockChainAccountApiDO extends AlipayObject {

	private static final long serialVersionUID = 1414659969451813569L;

	/**
	 * 账户hash
	 */
	@ApiField("account_hash")
	private String accountHash;

	/**
	 * 账户序号
	 */
	@ApiField("account_index")
	private Long accountIndex;

	/**
	 * 账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户状态
	 */
	@ApiField("account_status")
	private Long accountStatus;

	/**
	 * 账户余额
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 区块链唯一ID
	 */
	@ApiField("block_chain_id")
	private String blockChainId;

	/**
	 * 账号所在块hash
	 */
	@ApiField("block_hash")
	private String blockHash;

	/**
	 * 智能科技统一客户ID
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 父账号hash
	 */
	@ApiField("parent_hash")
	private String parentHash;

	/**
	 * 创建账号的交易hash
	 */
	@ApiField("transaction_hash")
	private String transactionHash;

	public String getAccountHash() {
		return this.accountHash;
	}
	public void setAccountHash(String accountHash) {
		this.accountHash = accountHash;
	}

	public Long getAccountIndex() {
		return this.accountIndex;
	}
	public void setAccountIndex(Long accountIndex) {
		this.accountIndex = accountIndex;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(Long accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Long getBalance() {
		return this.balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

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

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getParentHash() {
		return this.parentHash;
	}
	public void setParentHash(String parentHash) {
		this.parentHash = parentHash;
	}

	public String getTransactionHash() {
		return this.transactionHash;
	}
	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

}
