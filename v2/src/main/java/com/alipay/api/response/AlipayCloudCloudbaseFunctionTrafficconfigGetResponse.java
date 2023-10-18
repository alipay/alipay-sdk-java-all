package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrafficRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trafficconfig.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseFunctionTrafficconfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2374843446736584391L;

	/** 
	 * 流量分配规则列表
	 */
	@ApiListField("traffic_rules")
	@ApiField("traffic_rule")
	private List<TrafficRule> trafficRules;

	public void setTrafficRules(List<TrafficRule> trafficRules) {
		this.trafficRules = trafficRules;
	}
	public List<TrafficRule> getTrafficRules( ) {
		return this.trafficRules;
	}

}
