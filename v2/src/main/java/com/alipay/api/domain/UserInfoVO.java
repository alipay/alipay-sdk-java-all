package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询亲子关系，返回亲子关系信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 17:24:51
 */
public class UserInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4392998976623554415L;

	/**
	 * 孩子生日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 头像路径，如果无头像需要有兜底图
	 */
	@ApiField("head_url")
	private String headUrl;

	/**
	 * 孩子昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 孩子OpenID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 孩子UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHeadUrl() {
		return this.headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
