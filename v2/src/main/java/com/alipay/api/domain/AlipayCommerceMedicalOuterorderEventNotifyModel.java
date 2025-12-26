package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方履约问诊订单事件回传API
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class AlipayCommerceMedicalOuterorderEventNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4369944842396765543L;

	/**
	 * 业务场景
	 */
	@ApiField("consult_business")
	private String consultBusiness;

	/**
	 * 事件类型
	 */
	@ApiField("event_business")
	private String eventBusiness;

	/**
	 * 履约单id
	 */
	@ApiField("fulfillment_order_id")
	private String fulfillmentOrderId;

	/**
	 * 履约单外部单号 也可以是子单号
	 */
	@ApiField("partner_order_id")
	private String partnerOrderId;

	/**
	 * 问诊事件详情
	 */
	@ApiField("vedio_event_info")
	private InquiryEventInfo vedioEventInfo;

	public String getConsultBusiness() {
		return this.consultBusiness;
	}
	public void setConsultBusiness(String consultBusiness) {
		this.consultBusiness = consultBusiness;
	}

	public String getEventBusiness() {
		return this.eventBusiness;
	}
	public void setEventBusiness(String eventBusiness) {
		this.eventBusiness = eventBusiness;
	}

	public String getFulfillmentOrderId() {
		return this.fulfillmentOrderId;
	}
	public void setFulfillmentOrderId(String fulfillmentOrderId) {
		this.fulfillmentOrderId = fulfillmentOrderId;
	}

	public String getPartnerOrderId() {
		return this.partnerOrderId;
	}
	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}

	public InquiryEventInfo getVedioEventInfo() {
		return this.vedioEventInfo;
	}
	public void setVedioEventInfo(InquiryEventInfo vedioEventInfo) {
		this.vedioEventInfo = vedioEventInfo;
	}

}
