package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询区块链合约列表
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:29
 */
public class AnttechDataServiceBlockchainContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8548672662767162282L;

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
	 * 合约唯一hash
	 */
	@ApiField("contract_hash")
	private String contractHash;

	/**
	 * 合约结束时间戳
	 */
	@ApiField("end_timestamp")
	private Long endTimestamp;

	/**
	 * 分页页号
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 合约起始时间戳
	 */
	@ApiField("start_timestamp")
	private Long startTimestamp;

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

	public String getContractHash() {
		return this.contractHash;
	}
	public void setContractHash(String contractHash) {
		this.contractHash = contractHash;
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
