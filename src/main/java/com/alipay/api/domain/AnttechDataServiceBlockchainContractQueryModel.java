package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询区块链合约列表
 *
 * @author auto create
 * @since 1.0, 2019-11-22 16:45:37
 */
public class AnttechDataServiceBlockchainContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4814115775547679445L;

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

}
