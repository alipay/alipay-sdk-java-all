package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainContractApiDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:54:26
 */
public class AnttechDataServiceBlockchainContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664365995263411779L;

	/** 
	 * 合约列表
	 */
	@ApiListField("contract_list")
	@ApiField("block_chain_contract_api_d_o")
	private List<BlockChainContractApiDO> contractList;

	public void setContractList(List<BlockChainContractApiDO> contractList) {
		this.contractList = contractList;
	}
	public List<BlockChainContractApiDO> getContractList( ) {
		return this.contractList;
	}

}
