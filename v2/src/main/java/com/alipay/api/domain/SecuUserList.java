package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户社区信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 15:48:23
 */
public class SecuUserList extends AlipayObject {

	private static final long serialVersionUID = 7581566463387193782L;

	/**
	 * 用户签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 用户头像地址
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * 0男 1女 2未知
	 */
	@ApiField("gender")
	private Long gender;

	/**
	 * 用户投资宣言
	 */
	@ApiField("motto")
	private String motto;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Long getGender() {
		return this.gender;
	}
	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getMotto() {
		return this.motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
