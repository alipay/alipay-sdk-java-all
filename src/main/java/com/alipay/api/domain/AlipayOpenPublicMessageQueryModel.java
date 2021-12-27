package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询已发送消息接口
 *
 * @author auto create
 * @since 1.0, 2020-07-06 16:46:18
 */
public class AlipayOpenPublicMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1821216216315166217L;

	/**
	 * 消息id集，最多传入20个message_id。
message_id 可在调用<a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.message.total.send">群发消息</a>、<a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.message.group.send">组发消息</a>接口时会返回，请注意保存留用。
	 */
	@ApiListField("message_ids")
	@ApiField("string")
	private List<String> messageIds;

	public List<String> getMessageIds() {
		return this.messageIds;
	}
	public void setMessageIds(List<String> messageIds) {
		this.messageIds = messageIds;
	}

}
