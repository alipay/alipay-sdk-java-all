package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentProcurementAdditionalMediaInfoVO;
import com.alipay.api.domain.RentProcurementAddressInfoVO;
import com.alipay.api.domain.RentProcurementDeliveryInfoVO;
import com.alipay.api.domain.RentProcurementDeviceInfoVO;
import com.alipay.api.domain.RentProcurementItemInfoVO;
import com.alipay.api.domain.RentProcurementPriceInfoVO;
import com.alipay.api.domain.RentProcurementRefundInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.procurement.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class AlipayCommerceRentProcurementOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1738697917133477214L;

	/** 
	 * 附加文件信息
	 */
	@ApiField("additional_media_info")
	private RentProcurementAdditionalMediaInfoVO additionalMediaInfo;

	/** 
	 * 收货信息
	 */
	@ApiField("address_info")
	private RentProcurementAddressInfoVO addressInfo;

	/** 
	 * 取消状态
	 */
	@ApiField("cancel_status")
	private String cancelStatus;

	/** 
	 * null
	 */
	@ApiListField("delivery_infos")
	@ApiField("rent_procurement_delivery_info_v_o")
	private List<RentProcurementDeliveryInfoVO> deliveryInfos;

	/** 
	 * null
	 */
	@ApiListField("device_infos")
	@ApiField("rent_procurement_device_info_v_o")
	private List<RentProcurementDeviceInfoVO> deviceInfos;

	/** 
	 * null
	 */
	@ApiListField("item_infos")
	@ApiField("rent_procurement_item_info_v_o")
	private List<RentProcurementItemInfoVO> itemInfos;

	/** 
	 * 商家采购订单ID
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/** 
	 * 商家租赁订单ID
	 */
	@ApiField("out_rent_order_id")
	private String outRentOrderId;

	/** 
	 * 金额信息
	 */
	@ApiField("price_info")
	private RentProcurementPriceInfoVO priceInfo;

	/** 
	 * 采购发起方（PLATFORM_ESCROW-平台托管采购 / MERCHANT-自行发起采购）
	 */
	@ApiField("procurement_initiator")
	private String procurementInitiator;

	/** 
	 * 平台采购订单ID
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	/** 
	 * 退款信息
	 */
	@ApiField("refund_info")
	private RentProcurementRefundInfoVO refundInfo;

	/** 
	 * 租赁订单ID
	 */
	@ApiField("relate_rent_order_id")
	private String relateRentOrderId;

	/** 
	 * 采购单状态（CREATED/PAID/SUPPLIER_CONFIRMED/DELIVERED/RECEIVED/CLOSED）
	 */
	@ApiField("status")
	private String status;

	public void setAdditionalMediaInfo(RentProcurementAdditionalMediaInfoVO additionalMediaInfo) {
		this.additionalMediaInfo = additionalMediaInfo;
	}
	public RentProcurementAdditionalMediaInfoVO getAdditionalMediaInfo( ) {
		return this.additionalMediaInfo;
	}

	public void setAddressInfo(RentProcurementAddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public RentProcurementAddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
	}

	public void setCancelStatus(String cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	public String getCancelStatus( ) {
		return this.cancelStatus;
	}

	public void setDeliveryInfos(List<RentProcurementDeliveryInfoVO> deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}
	public List<RentProcurementDeliveryInfoVO> getDeliveryInfos( ) {
		return this.deliveryInfos;
	}

	public void setDeviceInfos(List<RentProcurementDeviceInfoVO> deviceInfos) {
		this.deviceInfos = deviceInfos;
	}
	public List<RentProcurementDeviceInfoVO> getDeviceInfos( ) {
		return this.deviceInfos;
	}

	public void setItemInfos(List<RentProcurementItemInfoVO> itemInfos) {
		this.itemInfos = itemInfos;
	}
	public List<RentProcurementItemInfoVO> getItemInfos( ) {
		return this.itemInfos;
	}

	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}
	public String getOutProcurementOrderId( ) {
		return this.outProcurementOrderId;
	}

	public void setOutRentOrderId(String outRentOrderId) {
		this.outRentOrderId = outRentOrderId;
	}
	public String getOutRentOrderId( ) {
		return this.outRentOrderId;
	}

	public void setPriceInfo(RentProcurementPriceInfoVO priceInfo) {
		this.priceInfo = priceInfo;
	}
	public RentProcurementPriceInfoVO getPriceInfo( ) {
		return this.priceInfo;
	}

	public void setProcurementInitiator(String procurementInitiator) {
		this.procurementInitiator = procurementInitiator;
	}
	public String getProcurementInitiator( ) {
		return this.procurementInitiator;
	}

	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}
	public String getProcurementOrderId( ) {
		return this.procurementOrderId;
	}

	public void setRefundInfo(RentProcurementRefundInfoVO refundInfo) {
		this.refundInfo = refundInfo;
	}
	public RentProcurementRefundInfoVO getRefundInfo( ) {
		return this.refundInfo;
	}

	public void setRelateRentOrderId(String relateRentOrderId) {
		this.relateRentOrderId = relateRentOrderId;
	}
	public String getRelateRentOrderId( ) {
		return this.relateRentOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
