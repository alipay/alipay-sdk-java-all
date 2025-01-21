package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutMktAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.account.mktaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-04 14:41:54
 */
public class AlipayOverseasTravelAccountMktaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7829386538427686855L;

	/** 
	 * 是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/** 
	 * 外部营销账号列表
	 */
	@ApiListField("out_mkt_accounts")
	@ApiField("out_mkt_account")
	private List<OutMktAccount> outMktAccounts;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}
	public Boolean getNeedRetry( ) {
		return this.needRetry;
	}

	public void setOutMktAccounts(List<OutMktAccount> outMktAccounts) {
		this.outMktAccounts = outMktAccounts;
	}
	public List<OutMktAccount> getOutMktAccounts( ) {
		return this.outMktAccounts;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
