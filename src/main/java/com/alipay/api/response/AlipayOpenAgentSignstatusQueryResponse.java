package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductSignStatusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.signstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-07 20:57:52
 */
public class AlipayOpenAgentSignstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4563128894293437993L;

	/** 
	 * 商户产品签约状态结果对象数组，返回本次查询的产品的签约状态
	 */
	@ApiListField("sign_status_list")
	@ApiField("product_sign_status_info")
	private List<ProductSignStatusInfo> signStatusList;

	public void setSignStatusList(List<ProductSignStatusInfo> signStatusList) {
		this.signStatusList = signStatusList;
	}
	public List<ProductSignStatusInfo> getSignStatusList( ) {
		return this.signStatusList;
	}

}
