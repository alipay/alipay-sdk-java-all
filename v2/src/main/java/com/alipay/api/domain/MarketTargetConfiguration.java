package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销目标配置对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:53
 */
public class MarketTargetConfiguration extends AlipayObject {

	private static final long serialVersionUID = 3566381642734446591L;

	/**
	 * 营销 目标配置
	 */
	@ApiListField("action_property_list")
	@ApiField("market_target_configuration_action_property")
	private List<MarketTargetConfigurationActionProperty> actionPropertyList;

	public List<MarketTargetConfigurationActionProperty> getActionPropertyList() {
		return this.actionPropertyList;
	}
	public void setActionPropertyList(List<MarketTargetConfigurationActionProperty> actionPropertyList) {
		this.actionPropertyList = actionPropertyList;
	}

}
