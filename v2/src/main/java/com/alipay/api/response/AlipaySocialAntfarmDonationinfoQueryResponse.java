package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntfarmUserDonationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antfarm.donationinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:50:02
 */
public class AlipaySocialAntfarmDonationinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7661513455598188851L;

	/** 
	 * 当前用户捐赠爱心记录
	 */
	@ApiListField("donation_list")
	@ApiField("antfarm_user_donation_info")
	private List<AntfarmUserDonationInfo> donationList;

	public void setDonationList(List<AntfarmUserDonationInfo> donationList) {
		this.donationList = donationList;
	}
	public List<AntfarmUserDonationInfo> getDonationList( ) {
		return this.donationList;
	}

}
