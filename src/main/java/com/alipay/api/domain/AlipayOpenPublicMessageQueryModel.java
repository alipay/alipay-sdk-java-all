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

	private static final long serialVersionUID = 3758726359753366394L;

	/**
	 * 消息id集，限制最多传入20个message_id。message_id在调用群发、组发消息接口时会返回，需调用方保存
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
