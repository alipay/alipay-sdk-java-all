package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuestInstanceDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instances.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:51:46
 */
public class AlipaySocialBaseQuestInstancesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2726513913445788175L;

	/** 
	 * 用户实例的查询结果集
	 */
	@ApiListField("instances")
	@ApiField("quest_instance_d_t_o")
	private List<QuestInstanceDTO> instances;

	public void setInstances(List<QuestInstanceDTO> instances) {
		this.instances = instances;
	}
	public List<QuestInstanceDTO> getInstances( ) {
		return this.instances;
	}

}
