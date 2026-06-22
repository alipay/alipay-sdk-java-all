package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepositFileList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.altechlegal.deposit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 18:07:44
 */
public class AlipaySecurityProdAltechlegalDepositQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6737714521825649954L;

	/** 
	 * null
	 */
	@ApiListField("deposit_file_list")
	@ApiField("deposit_file_list")
	private List<DepositFileList> depositFileList;

	public void setDepositFileList(List<DepositFileList> depositFileList) {
		this.depositFileList = depositFileList;
	}
	public List<DepositFileList> getDepositFileList( ) {
		return this.depositFileList;
	}

}
