package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易事件同步接口
 *
 * @author auto create
 * @since 1.0, 2022-10-10 17:06:05
 */
public class AlipayInsSceneEcommerceTradeeventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4214522523245744245L;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 事件类型:ECOM_SHIPPED_DONE  发货,ECOM_BUYER_CONFIRM  确认收货,
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 指定保险受理凭证
	 */
	@ApiListField("insure_certificates")
	@ApiField("insure_certificate_d_t_o")
	private List<InsureCertificateDTO> insureCertificates;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 订单
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public List<InsureCertificateDTO> getInsureCertificates() {
		return this.insureCertificates;
	}
	public void setInsureCertificates(List<InsureCertificateDTO> insureCertificates) {
		this.insureCertificates = insureCertificates;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}
