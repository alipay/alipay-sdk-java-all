package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorDeliveryConfig;
import com.alipay.api.domain.SuccessDeliveryConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.delivery.stop response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-21 13:36:28
 */
public class AlipayMarketingActivityDeliveryStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 8418956157186585156L;

	/** 
	 * 停止失败的投放配置列表
	 */
	@ApiListField("error_delivery_config_list")
	@ApiField("error_delivery_config")
	private List<ErrorDeliveryConfig> errorDeliveryConfigList;

	/** 
	 * 停止成功的投放配置列表
	 */
	@ApiListField("success_delivery_config_list")
	@ApiField("success_delivery_config")
	private List<SuccessDeliveryConfig> successDeliveryConfigList;

	public void setErrorDeliveryConfigList(List<ErrorDeliveryConfig> errorDeliveryConfigList) {
		this.errorDeliveryConfigList = errorDeliveryConfigList;
	}
	public List<ErrorDeliveryConfig> getErrorDeliveryConfigList( ) {
		return this.errorDeliveryConfigList;
	}

	public void setSuccessDeliveryConfigList(List<SuccessDeliveryConfig> successDeliveryConfigList) {
		this.successDeliveryConfigList = successDeliveryConfigList;
	}
	public List<SuccessDeliveryConfig> getSuccessDeliveryConfigList( ) {
		return this.successDeliveryConfigList;
	}

}
