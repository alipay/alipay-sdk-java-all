package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.info.share.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:13
 */
public class MybankCreditUserInfoShareQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4447928877575138444L;

	/** 
	 * 用户头像地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
性别（F：女性；M：男性）。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
