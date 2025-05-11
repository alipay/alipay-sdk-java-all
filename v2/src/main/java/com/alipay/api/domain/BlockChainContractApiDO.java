package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链合约详情
 *
 * @author auto create
 * @since 1.0, 2019-12-02 22:32:29
 */
public class BlockChainContractApiDO extends AlipayObject {

	private static final long serialVersionUID = 2394943114268616286L;

	/**
	 * 合约定义
	 */
	@ApiField("abi")
	private String abi;

	/**
	 * 区块链ID
	 */
	@ApiField("block_chain_id")
	private String blockChainId;

	/**
	 * 区块链块hash
	 */
	@ApiField("block_hash")
	private String blockHash;

	/**
	 * 智能科技统一客户ID
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 代码hash
	 */
	@ApiField("code_hash")
	private String codeHash;

	/**
	 * 合约hash
	 */
	@ApiField("contract_hash")
	private String contractHash;

	/**
	 * 合约时间戳
	 */
	@ApiField("contract_timestamp")
	private Long contractTimestamp;

	/**
	 * 版本
	 */
	@ApiField("contract_version")
	private Long contractVersion;

	/**
	 * 二进制字节码
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展信息
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 交易hash
	 */
	@ApiField("transaction_hash")
	private String transactionHash;

	public String getAbi() {
		return this.abi;
	}
	public void setAbi(String abi) {
		this.abi = abi;
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

	public String getCodeHash() {
		return this.codeHash;
	}
	public void setCodeHash(String codeHash) {
		this.codeHash = codeHash;
	}

	public String getContractHash() {
		return this.contractHash;
	}
	public void setContractHash(String contractHash) {
		this.contractHash = contractHash;
	}

	public Long getContractTimestamp() {
		return this.contractTimestamp;
	}
	public void setContractTimestamp(Long contractTimestamp) {
		this.contractTimestamp = contractTimestamp;
	}

	public Long getContractVersion() {
		return this.contractVersion;
	}
	public void setContractVersion(Long contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getTransactionHash() {
		return this.transactionHash;
	}
	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

}
