package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询区块链账户记录列表
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:19
 */
public class AnttechDataServiceBlockchainAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5578917711999325781L;

	/**
	 * 区块链账号唯一hash
	 */
	@ApiField("account_hash")
	private String accountHash;

	/**
	 * 账户状态
	 */
	@ApiField("account_status")
	private String accountStatus;

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
	 * 账户结束时间戳
	 */
	@ApiField("end_timestamp")
	private Long endTimestamp;

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
	 * 账户起始时间戳
	 */
	@ApiField("start_timestamp")
	private Long startTimestamp;

	public String getAccountHash() {
		return this.accountHash;
	}
	public void setAccountHash(String accountHash) {
		this.accountHash = accountHash;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

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

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}
	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
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

}
