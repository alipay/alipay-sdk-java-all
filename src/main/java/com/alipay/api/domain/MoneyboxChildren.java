package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小钱袋注册用户孩子信息
 *
 * @author auto create
 * @since 1.0, 2018-11-01 09:51:35
 */
public class MoneyboxChildren extends AlipayObject {

	private static final long serialVersionUID = 4894688289171652549L;

	/**
	 * 孩子的生日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 孩子 ID，为 US 开头的孩子唯一 ID
	 */
	@ApiField("child_id")
	private String childId;

	/**
	 * 孩子的性别。枚举值 "male" 表示男孩；枚举值 "female" 表示女孩
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 孩子的头像
	 */
	@ApiField("header")
	private String header;

	/**
	 * 孩子的昵称
	 */
	@ApiField("nick")
	private String nick;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getChildId() {
		return this.childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeader() {
		return this.header;
	}
	public void setHeader(String header) {
		this.header = header;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

}
