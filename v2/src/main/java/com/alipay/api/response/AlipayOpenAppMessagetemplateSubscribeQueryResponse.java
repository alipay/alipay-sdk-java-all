package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubscribeRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.messagetemplate.subscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:51:43
 */
public class AlipayOpenAppMessagetemplateSubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6757519567546923521L;

	/** 
	 * 是否显示订阅组件。枚举值：
true：显示订阅组件。
false：不显示订阅组件
	 */
	@ApiField("show_component")
	private Boolean showComponent;

	/** 
	 * 用户对消息模板的订阅关系列表，为入参中的用户id对消息模板id的订阅关系。
限制：用户未订阅消息，该参数不返回。
	 */
	@ApiListField("subscribe_relations")
	@ApiField("subscribe_relation")
	private List<SubscribeRelation> subscribeRelations;

	public void setShowComponent(Boolean showComponent) {
		this.showComponent = showComponent;
	}
	public Boolean getShowComponent( ) {
		return this.showComponent;
	}

	public void setSubscribeRelations(List<SubscribeRelation> subscribeRelations) {
		this.subscribeRelations = subscribeRelations;
	}
	public List<SubscribeRelation> getSubscribeRelations( ) {
		return this.subscribeRelations;
	}

}
