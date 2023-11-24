package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryBaseInfo;
import com.alipay.api.domain.PromoDeliveryInfo;
import com.alipay.api.domain.DeliveryPlayConfig;
import com.alipay.api.domain.DeliveryTargetRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-26 10:59:36
 */
public class AlipayMarketingActivityDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5483151415945817934L;

	/** 
	 * 运营计划基础信息。
	 */
	@ApiField("delivery_base_info")
	private DeliveryBaseInfo deliveryBaseInfo;

	/** 
	 * 运营计划的展位编码。 枚举值： SERVICE_MESSAGE：商家消息（包含订单、订阅、其他消息）
	 */
	@ApiField("delivery_booth_code")
	private String deliveryBoothCode;

	/** 
	 * 投放计划错误信息描述，如投放计划审核失败时为审核失败原因。
	 */
	@ApiField("delivery_error_msg")
	private String deliveryErrorMsg;

	/** 
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/** 
	 * "[已废弃] 投放信息列表"
	 */
	@ApiListField("delivery_info_list")
	@ApiField("promo_delivery_info")
	private List<PromoDeliveryInfo> deliveryInfoList;

	/** 
	 * 运营计划发放配置。
	 */
	@ApiField("delivery_play_config")
	private DeliveryPlayConfig deliveryPlayConfig;

	/** 
	 * 投放计划状态。
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/** 
	 * 运营计划定向曝光规则。
	 */
	@ApiField("delivery_target_rule")
	private DeliveryTargetRule deliveryTargetRule;

	public void setDeliveryBaseInfo(DeliveryBaseInfo deliveryBaseInfo) {
		this.deliveryBaseInfo = deliveryBaseInfo;
	}
	public DeliveryBaseInfo getDeliveryBaseInfo( ) {
		return this.deliveryBaseInfo;
	}

	public void setDeliveryBoothCode(String deliveryBoothCode) {
		this.deliveryBoothCode = deliveryBoothCode;
	}
	public String getDeliveryBoothCode( ) {
		return this.deliveryBoothCode;
	}

	public void setDeliveryErrorMsg(String deliveryErrorMsg) {
		this.deliveryErrorMsg = deliveryErrorMsg;
	}
	public String getDeliveryErrorMsg( ) {
		return this.deliveryErrorMsg;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

	public void setDeliveryInfoList(List<PromoDeliveryInfo> deliveryInfoList) {
		this.deliveryInfoList = deliveryInfoList;
	}
	public List<PromoDeliveryInfo> getDeliveryInfoList( ) {
		return this.deliveryInfoList;
	}

	public void setDeliveryPlayConfig(DeliveryPlayConfig deliveryPlayConfig) {
		this.deliveryPlayConfig = deliveryPlayConfig;
	}
	public DeliveryPlayConfig getDeliveryPlayConfig( ) {
		return this.deliveryPlayConfig;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryStatus( ) {
		return this.deliveryStatus;
	}

	public void setDeliveryTargetRule(DeliveryTargetRule deliveryTargetRule) {
		this.deliveryTargetRule = deliveryTargetRule;
	}
	public DeliveryTargetRule getDeliveryTargetRule( ) {
		return this.deliveryTargetRule;
	}

}
