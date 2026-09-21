package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步里程碑总代订单发货时间
 *
 * @author auto create
 * @since 1.0, 2026-09-02 18:07:51
 */
public class AnttechOceanbaseObglobalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3376496374961925797L;

	/**
	 * 发货事件唯一标识
	 */
	@ApiField("delivery_sync_event_id")
	private String deliverySyncEventId;

	/**
	 * 发货时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * 总代订单号
	 */
	@ApiField("general_agency_order_no")
	private String generalAgencyOrderNo;

	/**
	 * 报价单号
	 */
	@ApiField("quotation_no")
	private String quotationNo;

	public String getDeliverySyncEventId() {
		return this.deliverySyncEventId;
	}
	public void setDeliverySyncEventId(String deliverySyncEventId) {
		this.deliverySyncEventId = deliverySyncEventId;
	}

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getGeneralAgencyOrderNo() {
		return this.generalAgencyOrderNo;
	}
	public void setGeneralAgencyOrderNo(String generalAgencyOrderNo) {
		this.generalAgencyOrderNo = generalAgencyOrderNo;
	}

	public String getQuotationNo() {
		return this.quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}

}
