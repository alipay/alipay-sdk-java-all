package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.recordexist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:41
 */
public class AlipayUserCharityRecordexistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7862423424897711266L;

	/** 
	 * 是否有过捐赠记录(有:true,否:false)
	 */
	@ApiField("donation_tag")
	private Boolean donationTag;

	/** 
	 * 爱心捐赠平台捐赠的次数
	 */
	@ApiField("donation_times")
	private Long donationTimes;

	public void setDonationTag(Boolean donationTag) {
		this.donationTag = donationTag;
	}
	public Boolean getDonationTag( ) {
		return this.donationTag;
	}

	public void setDonationTimes(Long donationTimes) {
		this.donationTimes = donationTimes;
	}
	public Long getDonationTimes( ) {
		return this.donationTimes;
	}

}
