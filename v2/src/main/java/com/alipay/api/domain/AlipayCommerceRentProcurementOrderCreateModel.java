package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建租赁采购单
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:12:45
 */
public class AlipayCommerceRentProcurementOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3141569777664799515L;

	/**
	 * null
	 */
	@ApiListField("item_infos")
	@ApiField("rent_procurement_item_info_d_t_o")
	private List<RentProcurementItemInfoDTO> itemInfos;

	/**
	 * 商户外部采购单号，保证幂等
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/**
	 * 收货人信息
	 */
	@ApiField("receiver_info")
	private RentProcurementReceiverInfoDTO receiverInfo;

	/**
	 * 关联的租赁订单号
	 */
	@ApiField("relate_rent_order_id")
	private String relateRentOrderId;

	public List<RentProcurementItemInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<RentProcurementItemInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getOutProcurementOrderId() {
		return this.outProcurementOrderId;
	}
	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}

	public RentProcurementReceiverInfoDTO getReceiverInfo() {
		return this.receiverInfo;
	}
	public void setReceiverInfo(RentProcurementReceiverInfoDTO receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public String getRelateRentOrderId() {
		return this.relateRentOrderId;
	}
	public void setRelateRentOrderId(String relateRentOrderId) {
		this.relateRentOrderId = relateRentOrderId;
	}

}
