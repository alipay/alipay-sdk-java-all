package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预览消息发送接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 17:24:48
 */
public class AlipayOpenPublicMessagePreviewSendModel extends AlipayObject {

	private static final long serialVersionUID = 3262687714924466265L;

	/**
	 * 预览用户登录id列表，每次做多发送5个用户，且这5个用户必须是生活号的管理员或者是操作员。多个 id 用 "," 分隔。
	 */
	@ApiListField("logon_ids")
	@ApiField("string")
	private List<String> logonIds;

	/**
	 * 推送的消息体信息
	 */
	@ApiField("msg_body")
	private PublicMessageBody msgBody;

	public List<String> getLogonIds() {
		return this.logonIds;
	}
	public void setLogonIds(List<String> logonIds) {
		this.logonIds = logonIds;
	}

	public PublicMessageBody getMsgBody() {
		return this.msgBody;
	}
	public void setMsgBody(PublicMessageBody msgBody) {
		this.msgBody = msgBody;
	}

}
