package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassAccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passaccount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:22
 */
public class AnttechOceanbasePassaccountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6893451465633337928L;

	/** 
	 * 通行证列表
	 */
	@ApiListField("pass_accounts")
	@ApiField("pass_account_d_t_o")
	private List<PassAccountDTO> passAccounts;

	public void setPassAccounts(List<PassAccountDTO> passAccounts) {
		this.passAccounts = passAccounts;
	}
	public List<PassAccountDTO> getPassAccounts( ) {
		return this.passAccounts;
	}

}
