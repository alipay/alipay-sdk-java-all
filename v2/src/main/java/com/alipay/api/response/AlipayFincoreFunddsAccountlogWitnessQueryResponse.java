package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountingLogVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.accountlog.witness.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:27:11
 */
public class AlipayFincoreFunddsAccountlogWitnessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6742844518321316651L;

	/** 
	 * 账户流水列表
	 */
	@ApiListField("accounting_log_list")
	@ApiField("accounting_log_v_o")
	private List<AccountingLogVO> accountingLogList;

	public void setAccountingLogList(List<AccountingLogVO> accountingLogList) {
		this.accountingLogList = accountingLogList;
	}
	public List<AccountingLogVO> getAccountingLogList( ) {
		return this.accountingLogList;
	}

}
