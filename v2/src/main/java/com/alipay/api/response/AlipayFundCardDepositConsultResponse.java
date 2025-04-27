package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.card.deposit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 10:31:21
 */
public class AlipayFundCardDepositConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8113564777547796888L;

	/** 
	 * 凭证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 面额
	 */
	@ApiField("denomination")
	private String denomination;

	/** 
	 * 卡片过期时间
	 */
	@ApiField("expired_time")
	private String expiredTime;

	/** 
	 * 卡片状态
	 */
	@ApiField("status")
	private String status;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getDenomination( ) {
		return this.denomination;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}
	public String getExpiredTime( ) {
		return this.expiredTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
