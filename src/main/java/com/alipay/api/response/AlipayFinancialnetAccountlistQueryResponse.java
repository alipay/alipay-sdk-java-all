package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountBaseInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.accountlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-25 14:41:36
 */
public class AlipayFinancialnetAccountlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4863986381323417828L;

	/** 
	 * 账户信息
	 */
	@ApiListField("account_infos")
	@ApiField("account_base_info_v_o")
	private List<AccountBaseInfoVO> accountInfos;

	/** 
	 * 示例值
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 业务处理成功
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 成功标志
	 */
	@ApiField("success")
	private String success;

	public void setAccountInfos(List<AccountBaseInfoVO> accountInfos) {
		this.accountInfos = accountInfos;
	}
	public List<AccountBaseInfoVO> getAccountInfos( ) {
		return this.accountInfos;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
