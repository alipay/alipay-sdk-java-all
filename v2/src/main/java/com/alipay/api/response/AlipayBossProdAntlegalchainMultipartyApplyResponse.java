package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.multiparty.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:15:55
 */
public class AlipayBossProdAntlegalchainMultipartyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7727783848448743292L;

	/** 
	 * 法链业务ID,用于查询上链状态
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}
	public String getBasDataId( ) {
		return this.basDataId;
	}

}
