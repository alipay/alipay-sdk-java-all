package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QuestInstanceDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:47:42
 */
public class AlipaySocialBaseQuestInstanceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3456432382495236471L;

	/** 
	 * 返回用户添加小目标实例
	 */
	@ApiField("instance")
	private QuestInstanceDO instance;

	public void setInstance(QuestInstanceDO instance) {
		this.instance = instance;
	}
	public QuestInstanceDO getInstance( ) {
		return this.instance;
	}

}
