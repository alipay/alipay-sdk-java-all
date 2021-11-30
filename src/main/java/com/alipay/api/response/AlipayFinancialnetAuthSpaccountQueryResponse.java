package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.spaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-04 14:32:30
 */
public class AlipayFinancialnetAuthSpaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5715884527727484785L;

	/** 
	 * 机构专户信息列表
	 */
	@ApiListField("account_info")
	@ApiField("sp_account_info")
	private List<SpAccountInfo> accountInfo;

	/** 
	 * 调用finauth服务失败时返回的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 调用finauth失败时返回的错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 调用finauth查询机构专户信息是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	public void setAccountInfo(List<SpAccountInfo> accountInfo) {
		this.accountInfo = accountInfo;
	}
	public List<SpAccountInfo> getAccountInfo( ) {
		return this.accountInfo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
