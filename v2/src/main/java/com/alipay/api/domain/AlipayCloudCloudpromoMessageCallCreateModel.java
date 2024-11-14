package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云风险智能电话创建
 *
 * @author auto create
 * @since 1.0, 2024-11-13 11:35:26
 */
public class AlipayCloudCloudpromoMessageCallCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4828581816839717265L;

	/**
	 * 触达策略
	 */
	@ApiField("contact_strategy")
	private ContactStrategy contactStrategy;

	/**
	 * 传递触达类型
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 用户基本信息，触达时用于和对方确认身份及称呼
	 */
	@ApiListField("user_infos")
	@ApiField("call_user_info")
	private List<CallUserInfo> userInfos;

	public ContactStrategy getContactStrategy() {
		return this.contactStrategy;
	}
	public void setContactStrategy(ContactStrategy contactStrategy) {
		this.contactStrategy = contactStrategy;
	}

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public List<CallUserInfo> getUserInfos() {
		return this.userInfos;
	}
	public void setUserInfos(List<CallUserInfo> userInfos) {
		this.userInfos = userInfos;
	}

}
