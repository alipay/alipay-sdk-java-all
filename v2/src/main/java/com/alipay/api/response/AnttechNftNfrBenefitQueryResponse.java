package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.nfr.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 20:02:55
 */
public class AnttechNftNfrBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8134815354383321744L;

	/** 
	 * VALID（有效）/ INVALID_USED（无效-已使用）/ INVALID_EXPIRED（无效-已过期）
	 */
	@ApiField("benefit_status")
	private String benefitStatus;

	/** 
	 * 已核销时返回 nft_tag 的 gmt_create，未核销返回 null
	 */
	@ApiField("verify_time")
	private Date verifyTime;

	public void setBenefitStatus(String benefitStatus) {
		this.benefitStatus = benefitStatus;
	}
	public String getBenefitStatus( ) {
		return this.benefitStatus;
	}

	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}
	public Date getVerifyTime( ) {
		return this.verifyTime;
	}

}
