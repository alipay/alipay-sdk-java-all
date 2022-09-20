package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuestInstanceDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 10:43:56
 */
public class AlipaySocialBaseQuestInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5845582772832717199L;

	/** 
	 * 返回请求小目标实例集合
	 */
	@ApiListField("instances")
	@ApiField("quest_instance_d_o")
	private List<QuestInstanceDO> instances;

	public void setInstances(List<QuestInstanceDO> instances) {
		this.instances = instances;
	}
	public List<QuestInstanceDO> getInstances( ) {
		return this.instances;
	}

}
