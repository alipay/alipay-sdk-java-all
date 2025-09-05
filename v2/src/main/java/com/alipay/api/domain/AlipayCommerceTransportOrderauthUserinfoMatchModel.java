package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行行业订单授权用户匹配
 *
 * @author auto create
 * @since 1.0, 2025-08-25 10:42:36
 */
public class AlipayCommerceTransportOrderauthUserinfoMatchModel extends AlipayObject {

	private static final long serialVersionUID = 5536963719261195589L;

	/**
	 * 16位支付宝小程序应用APPID，默认是当前调用方
	 */
	@ApiField("auth_appid")
	private String authAppid;

	/**
	 * 授权行业编码，由支付宝业务人员分配
	 */
	@ApiField("auth_industry")
	private String authIndustry;

	/**
	 * 额外参数
	 */
	@ApiField("ext_info")
	private OrderAuthCommonExtInfo extInfo;

	/**
	 * 身份证号码
	 */
	@ApiField("id_card_number")
	private String idCardNumber;

	/**
	 * 手机号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 用户编码
	 */
	@ApiField("user_number")
	private String userNumber;

	public String getAuthAppid() {
		return this.authAppid;
	}
	public void setAuthAppid(String authAppid) {
		this.authAppid = authAppid;
	}

	public String getAuthIndustry() {
		return this.authIndustry;
	}
	public void setAuthIndustry(String authIndustry) {
		this.authIndustry = authIndustry;
	}

	public OrderAuthCommonExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(OrderAuthCommonExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserNumber() {
		return this.userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

}
