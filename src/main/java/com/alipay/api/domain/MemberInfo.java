package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群成员信息
 *
 * @author auto create
 * @since 1.0, 2020-08-18 18:16:24
 */
public class MemberInfo extends AlipayObject {

	private static final long serialVersionUID = 4555137324228119562L;

	/**
	 * 群成员性别，m表示男，f表示女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 群内昵称
	 */
	@ApiField("group_nick_name")
	private String groupNickName;

	/**
	 * 邀请人id
	 */
	@ApiField("inviter_uid")
	private String inviterUid;

	/**
	 * 群成员头像url
	 */
	@ApiField("member_img")
	private String memberImg;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 群成员用户id
	 */
	@ApiField("uid")
	private String uid;

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGroupNickName() {
		return this.groupNickName;
	}
	public void setGroupNickName(String groupNickName) {
		this.groupNickName = groupNickName;
	}

	public String getInviterUid() {
		return this.inviterUid;
	}
	public void setInviterUid(String inviterUid) {
		this.inviterUid = inviterUid;
	}

	public String getMemberImg() {
		return this.memberImg;
	}
	public void setMemberImg(String memberImg) {
		this.memberImg = memberImg;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
