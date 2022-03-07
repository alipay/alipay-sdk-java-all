package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交建群
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:14:55
 */
public class AlipaySocialBaseChatGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6761669144991855597L;

	/**
	 * 请求唯一id（用户id+时间戳+随机数），防止重复建群
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
