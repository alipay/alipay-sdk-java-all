package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入群欢迎语
 *
 * @author auto create
 * @since 1.0, 2024-09-05 17:19:59
 */
public class GroupWelcomeMsgVO extends AlipayObject {

	private static final long serialVersionUID = 8492334991135839379L;

	/**
	 * 欢迎消息。支持发图文消息、小程序消息等。
	 */
	@ApiField("welcome_group_msg")
	private GroupMsgVO welcomeGroupMsg;

	/**
	 * 用户进群时，群聊自动触发欢迎语，仅加群用户和群主可见，建议介绍日常活动或引导用户尝试互动。
	 */
	@ApiField("welcome_text")
	private String welcomeText;

	public GroupMsgVO getWelcomeGroupMsg() {
		return this.welcomeGroupMsg;
	}
	public void setWelcomeGroupMsg(GroupMsgVO welcomeGroupMsg) {
		this.welcomeGroupMsg = welcomeGroupMsg;
	}

	public String getWelcomeText() {
		return this.welcomeText;
	}
	public void setWelcomeText(String welcomeText) {
		this.welcomeText = welcomeText;
	}

}
