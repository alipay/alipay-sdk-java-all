package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicMessageInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 19:47:42
 */
public class AlipayOpenPublicMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6748668426982428828L;

	/** 
	 * 发送消息结果集。仅返回该用户已发送的消息
	 */
	@ApiListField("list")
	@ApiField("public_message_info")
	private List<PublicMessageInfo> list;

	public void setList(List<PublicMessageInfo> list) {
		this.list = list;
	}
	public List<PublicMessageInfo> getList( ) {
		return this.list;
	}

}
