package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改入群欢迎语
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:23:50
 */
public class AlipayMerchantGroupWelcomemsgModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6345126476597185682L;

	/**
	 * 群组id列表
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 入群欢迎语
	 */
	@ApiField("welcome_msg")
	private GroupWelcomeMsgVO welcomeMsg;

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public GroupWelcomeMsgVO getWelcomeMsg() {
		return this.welcomeMsg;
	}
	public void setWelcomeMsg(GroupWelcomeMsgVO welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

}
