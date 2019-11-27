package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易明细
 *
 * @author auto create
 * @since 1.0, 2019-11-22 17:14:20
 */
public class BlockChainTransaction extends AlipayObject {

	private static final long serialVersionUID = 3315681828746318654L;

	/**
	 * 智能科技统一客户ID
	 */
	@ApiField("at_cid")
	private String atCid;

	/**
	 * 块hash
	 */
	@ApiField("block_hash")
	private String blockHash;

	public String getAtCid() {
		return this.atCid;
	}
	public void setAtCid(String atCid) {
		this.atCid = atCid;
	}

	public String getBlockHash() {
		return this.blockHash;
	}
	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

}
