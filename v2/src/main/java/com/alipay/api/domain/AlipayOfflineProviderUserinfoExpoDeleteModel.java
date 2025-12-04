package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展会核验用户出库
 *
 * @author auto create
 * @since 1.0, 2025-08-26 20:11:43
 */
public class AlipayOfflineProviderUserinfoExpoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6867869919716213361L;

	/**
	 * 身份证号。可以传明文，也可以传身份证号的32位大写MD5值。尽量使用MD5值
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 活动最小单元ID
	 */
	@ApiField("time_uuid")
	private String timeUuid;

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTimeUuid() {
		return this.timeUuid;
	}
	public void setTimeUuid(String timeUuid) {
		this.timeUuid = timeUuid;
	}

}
