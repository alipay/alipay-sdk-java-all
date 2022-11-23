package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁庄园用户单条捐赠记录
 *
 * @author auto create
 * @since 1.0, 2021-06-23 19:03:16
 */
public class AntfarmUserDonationRecord extends AlipayObject {

	private static final long serialVersionUID = 8856383928135876551L;

	/**
	 * 单次捐爱心时间
	 */
	@ApiField("charity_time")
	private Date charityTime;

	/**
	 * 单次捐爱心数量
	 */
	@ApiField("donation_amount")
	private Long donationAmount;

	public Date getCharityTime() {
		return this.charityTime;
	}
	public void setCharityTime(Date charityTime) {
		this.charityTime = charityTime;
	}

	public Long getDonationAmount() {
		return this.donationAmount;
	}
	public void setDonationAmount(Long donationAmount) {
		this.donationAmount = donationAmount;
	}

}
