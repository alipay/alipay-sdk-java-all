package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.oauthuserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-28 17:27:39
 */
public class AnttechNftOauthuserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3728816687485521865L;

	/** 
	 * 头像链接
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 0-未实名 1-已实名
	 */
	@ApiField("is_real_name_verified")
	private Long isRealNameVerified;

	/** 
	 * 中文名称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 鲸探用户ID标识，OpenApi场景使用的加密格式
	 */
	@ApiField("ou_id")
	private String ouId;

	/** 
	 * 4-7位脱敏后的手机号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 租户下用户id
	 */
	@ApiField("tu_id")
	private String tuId;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setIsRealNameVerified(Long isRealNameVerified) {
		this.isRealNameVerified = isRealNameVerified;
	}
	public Long getIsRealNameVerified( ) {
		return this.isRealNameVerified;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setOuId(String ouId) {
		this.ouId = ouId;
	}
	public String getOuId( ) {
		return this.ouId;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setTuId(String tuId) {
		this.tuId = tuId;
	}
	public String getTuId( ) {
		return this.tuId;
	}

}
