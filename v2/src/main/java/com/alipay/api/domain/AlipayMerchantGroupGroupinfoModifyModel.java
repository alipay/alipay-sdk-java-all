package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组修改
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:23:50
 */
public class AlipayMerchantGroupGroupinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5418952583936693121L;

	/**
	 * 群组基础信息。包含群组id、群组名称、群组管理员列表等信息
	 */
	@ApiField("group_base_info")
	private GroupBaseInfoVO groupBaseInfo;

	/**
	 * 群信息。包含群id、群名称、群介绍等群配置信息。
	 */
	@ApiField("group_instance_info")
	private GroupInstanceInfoVO groupInstanceInfo;

	/**
	 * 入群欢迎语
	 */
	@ApiField("welcome_msg")
	private GroupWelcomeMsgVO welcomeMsg;

	public GroupBaseInfoVO getGroupBaseInfo() {
		return this.groupBaseInfo;
	}
	public void setGroupBaseInfo(GroupBaseInfoVO groupBaseInfo) {
		this.groupBaseInfo = groupBaseInfo;
	}

	public GroupInstanceInfoVO getGroupInstanceInfo() {
		return this.groupInstanceInfo;
	}
	public void setGroupInstanceInfo(GroupInstanceInfoVO groupInstanceInfo) {
		this.groupInstanceInfo = groupInstanceInfo;
	}

	public GroupWelcomeMsgVO getWelcomeMsg() {
		return this.welcomeMsg;
	}
	public void setWelcomeMsg(GroupWelcomeMsgVO welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

}
