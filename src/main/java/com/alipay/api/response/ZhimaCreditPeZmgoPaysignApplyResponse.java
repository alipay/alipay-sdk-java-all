package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.paysign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-07 09:35:22
 */
public class ZhimaCreditPeZmgoPaysignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3183542445277517626L;

	/** 
	 * 如果签约幂等了，这个就是签约协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 是否签约幂等,如果签约幂等的话 就需要继续走签约确认流程了。
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 签约申请生成的操作单号，签约确认的时候需要将该字段回传回来
	 */
	@ApiField("zmgo_opt_no")
	private String zmgoOptNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setZmgoOptNo(String zmgoOptNo) {
		this.zmgoOptNo = zmgoOptNo;
	}
	public String getZmgoOptNo( ) {
		return this.zmgoOptNo;
	}

}
