package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NotaryResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.notary.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:07:41
 */
public class AlipayBossProdAntlegalchainNotaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8376426413754651997L;

	/** 
	 * 存证信息集合
	 */
	@ApiListField("notaries")
	@ApiField("notary_result_d_t_o")
	private List<NotaryResultDTO> notaries;

	public void setNotaries(List<NotaryResultDTO> notaries) {
		this.notaries = notaries;
	}
	public List<NotaryResultDTO> getNotaries( ) {
		return this.notaries;
	}

}
