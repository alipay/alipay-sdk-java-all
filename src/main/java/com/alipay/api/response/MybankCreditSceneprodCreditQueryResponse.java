package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditSceneprodCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8172881367216377694L;

	/** 
	 * 征信是否准入
	 */
	@ApiField("auth_admit")
	private String authAdmit;

	/** 
	 * 是否有征信结果
	 */
	@ApiField("had_auth_result")
	private String hadAuthResult;

	/** 
	 * 是否需要去支付宝认证
	 */
	@ApiField("need_upgrade")
	private String needUpgrade;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAuthAdmit(String authAdmit) {
		this.authAdmit = authAdmit;
	}
	public String getAuthAdmit( ) {
		return this.authAdmit;
	}

	public void setHadAuthResult(String hadAuthResult) {
		this.hadAuthResult = hadAuthResult;
	}
	public String getHadAuthResult( ) {
		return this.hadAuthResult;
	}

	public void setNeedUpgrade(String needUpgrade) {
		this.needUpgrade = needUpgrade;
	}
	public String getNeedUpgrade( ) {
		return this.needUpgrade;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
