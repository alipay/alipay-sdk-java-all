package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QuestInstanceDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:00:55
 */
public class AlipaySocialBaseQuestInstanceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467997728281272525L;

	/** 
	 * 小目标实例模型
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
