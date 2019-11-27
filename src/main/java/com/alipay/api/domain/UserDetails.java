package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭成员信息
 *
 * @author auto create
 * @since 1.0, 2017-12-29 13:46:58
 */
public class UserDetails extends AlipayObject {

	private static final long serialVersionUID = 3774499423764795817L;

	/**
	 * 用户变更手机号，替换旧的手机号，只有修改手机号时，此项才需要填
	 */
	@ApiField("user_change_mobile")
	private String userChangeMobile;

	/**
	 * 孩子家长的手机号，可根据此手机号推送账单消息给家长，如果有此家长，则家长手机号必填
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 家长姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 孩子与家长的关系： 1、爸爸  2、妈妈  3、爷爷  4、奶奶  5、外公  6、外婆  7、家长
	 */
	@ApiField("user_relation")
	private String userRelation;

	public String getUserChangeMobile() {
		return this.userChangeMobile;
	}
	public void setUserChangeMobile(String userChangeMobile) {
		this.userChangeMobile = userChangeMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRelation() {
		return this.userRelation;
	}
	public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

}
