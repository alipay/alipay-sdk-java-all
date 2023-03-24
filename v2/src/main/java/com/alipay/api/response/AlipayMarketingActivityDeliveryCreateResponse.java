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
 * @since 1.0, 2023-03-22 19:26:17
 */
public class AlipayMarketingActivityDeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4621236336621532932L;

	/** 
	 * 预览链接。
可用于预览用户在承接页面领券的流程。
	 */
	@ApiField("delivery_guide_preview_url")
	private String deliveryGuidePreviewUrl;

	/** 
	 * 投放计划id。
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/** 
	 * [已废弃]
创建失败的投放信息列表

失败的投放配置列表中，会返回对应的deliveryConfig对象。
	 */
	@ApiListField("error_delivery_config_list")
	@ApiField("error_delivery_config")
	private List<ErrorDeliveryConfig> errorDeliveryConfigList;

	/** 
	 * [已废弃]
创建成功的投放信息列表

成功的投放配置列表中，会返回对应的deliveryConfig对象。
	 */
	@ApiListField("success_delivery_config_list")
	@ApiField("success_delivery_config")
	private List<SuccessDeliveryConfig> successDeliveryConfigList;

	public void setDeliveryGuidePreviewUrl(String deliveryGuidePreviewUrl) {
		this.deliveryGuidePreviewUrl = deliveryGuidePreviewUrl;
	}
	public String getDeliveryGuidePreviewUrl( ) {
		return this.deliveryGuidePreviewUrl;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

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
