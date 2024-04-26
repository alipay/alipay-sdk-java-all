package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QuestInstanceDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:28:05
 */
public class AlipaySocialBaseQuestInstanceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1678338231564891326L;

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
