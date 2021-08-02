package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorDeliveryConfig;
import com.alipay.api.domain.SuccessDeliveryConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.delivery.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-21 13:35:46
 */
public class AlipayMarketingActivityDeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1176669574914962512L;

	/** 
	 * 创建失败的投放信息列表

失败的投放配置列表中，会返回对应的deliveryConfig对象。
	 */
	@ApiListField("error_delivery_config_list")
	@ApiField("error_delivery_config")
	private List<ErrorDeliveryConfig> errorDeliveryConfigList;

	/** 
	 * 创建成功的投放信息列表

成功的投放配置列表中，会返回对应的deliveryConfig对象。
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
