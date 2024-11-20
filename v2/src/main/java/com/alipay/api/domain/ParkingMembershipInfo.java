package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车会员信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 17:31:52
 */
public class ParkingMembershipInfo extends AlipayObject {

	private static final long serialVersionUID = 8291897932945324197L;

	/**
	 * 周卡、月卡：剩余天数（包括今天），单位日；
次卡：剩余次数（包括本次），单位次；
储值：余额，单位元；
折扣：折扣力度，代表0-10折；0折即为免费；
	 */
	@ApiField("membership_balance")
	private String membershipBalance;

	/**
	 * 会员类型；
WEEK_CARD：周卡
MONTH_CARD：月卡
SEASON_CARD：季卡
YEAR_CARD：年卡
MULTIPLE_PASS_CARD：次卡
MONEY_STORED_CARD：储值
DISCOUNT_CARD：折扣
	 */
	@ApiField("membership_type")
	private String membershipType;

	public String getMembershipBalance() {
		return this.membershipBalance;
	}
	public void setMembershipBalance(String membershipBalance) {
		this.membershipBalance = membershipBalance;
	}

	public String getMembershipType() {
		return this.membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

}
