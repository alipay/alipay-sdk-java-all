package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询区块链交易记录列表
 *
 * @author auto create
 * @since 1.0, 2019-11-22 17:15:25
 */
public class AnttechDataServiceBlockchainTransactionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5682255942773319333L;

	/**
	 * 金融科技租户名
	 */
	@ApiField("at_tenant_name")
	private String atTenantName;

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
	 * 交易结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 交易来源账户
	 */
	@ApiField("from_account_hash")
	private String fromAccountHash;

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
	 * 交易开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 交易目标账户
	 */
	@ApiField("to_account_hash")
	private String toAccountHash;

	/**
	 * 交易唯一hash
	 */
	@ApiField("transaction_hash")
	private String transactionHash;

	/**
	 * 交易类型
	 */
	@ApiField("transaction_type")
	private String transactionType;

	public String getAtTenantName() {
		return this.atTenantName;
	}
	public void setAtTenantName(String atTenantName) {
		this.atTenantName = atTenantName;
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

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFromAccountHash() {
		return this.fromAccountHash;
	}
	public void setFromAccountHash(String fromAccountHash) {
		this.fromAccountHash = fromAccountHash;
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

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getToAccountHash() {
		return this.toAccountHash;
	}
	public void setToAccountHash(String toAccountHash) {
		this.toAccountHash = toAccountHash;
	}

	public String getTransactionHash() {
		return this.transactionHash;
	}
	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

	public String getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}
