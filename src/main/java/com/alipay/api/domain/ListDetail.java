package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 名单详细
 *
 * @author auto create
 * @since 1.0, 2022-04-25 15:12:41
 */
public class ListDetail extends AlipayObject {

	private static final long serialVersionUID = 8641189646298362931L;

	/**
	 * 额外参数，比如养殖规模、品种等
	 */
	@ApiField("extra_data")
	private String extraData;

	/**
	 * 身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getExtraData() {
		return this.extraData;
	}
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
