package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家会员个人信息
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:14
 */
public class MemberCardUserInfo extends AlipayObject {

	private static final long serialVersionUID = 1861115482129344576L;

	/**
	 * 生日，格式"yyyy/MM/dd"，如果没有获得用户授权，则返回"用户未授权"
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 性别。枚举值如下：男/女。如果没有获得用户授权，则返回"用户未授权"
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 手机号，如果没有获得用户授权，则返回"用户未授权"
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名，如果没有获得用户授权，则返回"用户未授权"
	 */
	@ApiField("name")
	private String name;

	/**
	 * 安心充会员的开通时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
