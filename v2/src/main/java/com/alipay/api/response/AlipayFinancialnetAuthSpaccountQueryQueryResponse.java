package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpAccountInfoVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.query.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 11:02:25
 */
public class AlipayFinancialnetAuthSpaccountQueryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6194426389465884684L;

	/** 
	 * 机构专户信息列表
	 */
	@ApiListField("account_info")
	@ApiField("sp_account_info_vo")
	private List<SpAccountInfoVo> accountInfo;

	public void setAccountInfo(List<SpAccountInfoVo> accountInfo) {
		this.accountInfo = accountInfo;
	}
	public List<SpAccountInfoVo> getAccountInfo( ) {
		return this.accountInfo;
	}

}
