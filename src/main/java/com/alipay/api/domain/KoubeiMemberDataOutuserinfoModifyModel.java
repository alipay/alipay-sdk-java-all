package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑第三方用户信息更新接口
 *
 * @author auto create
 * @since 1.0, 2019-02-21 16:44:01
 */
public class KoubeiMemberDataOutuserinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4247717387695341585L;

	/**
	 * http://avatar_url.com
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 1 男，2 女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 微信昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 支付宝用户Id，即匿名用户Id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
