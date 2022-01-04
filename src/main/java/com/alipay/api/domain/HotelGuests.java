package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店入住人信息。
 *
 * @author auto create
 * @since 1.0, 2021-07-02 09:20:47
 */
public class HotelGuests extends AlipayObject {

	private static final long serialVersionUID = 4159278587722158182L;

	/**
	 * 入住人姓名
	 */
	@ApiField("guest_name")
	private String guestName;

	/**
	 * 入住人会员等级
	 */
	@ApiField("member_level")
	private String memberLevel;

	/**
	 * 入住人联系方式
	 */
	@ApiField("telephone")
	private String telephone;

	public String getGuestName() {
		return this.guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getMemberLevel() {
		return this.memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
