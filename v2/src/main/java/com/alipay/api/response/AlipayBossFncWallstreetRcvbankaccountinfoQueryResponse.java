package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BankAccountInfoDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.wallstreet.rcvbankaccountinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 11:07:02
 */
public class AlipayBossFncWallstreetRcvbankaccountinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3374848695499149779L;

	/** 
	 * 账户信息列表
	 */
	@ApiListField("result_set")
	@ApiField("bank_account_info_dto")
	private List<BankAccountInfoDto> resultSet;

	public void setResultSet(List<BankAccountInfoDto> resultSet) {
		this.resultSet = resultSet;
	}
	public List<BankAccountInfoDto> getResultSet( ) {
		return this.resultSet;
	}

}
