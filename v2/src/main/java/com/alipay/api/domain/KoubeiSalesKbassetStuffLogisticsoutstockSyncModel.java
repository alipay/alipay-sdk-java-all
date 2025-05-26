package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流仓库物料出库同步接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:40
 */
public class KoubeiSalesKbassetStuffLogisticsoutstockSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7178279981384462186L;

	/**
	 * 实际发货时间
	 */
	@ApiField("actual_ship_date_time")
	private String actualShipDateTime;

	/**
	 * erp订单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * ERP 订单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 顺丰为SF
	 */
	@ApiField("express_company_code")
	private String expressCompanyCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_company_name")
	private String expressCompanyName;

	/**
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 出库明细
	 */
	@ApiListField("item_infos")
	@ApiField("out_stock_stuff_info")
	private List<OutStockStuffInfo> itemInfos;

	/**
	 * 由调用方提供的一个唯一的请求ID，每一个请求对应一个id，用于实现调用幂等
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 回单号
	 */
	@ApiField("return_tracking")
	private String returnTracking;

	/**
	 * 顺丰的出库号
	 */
	@ApiField("shipment_id")
	private String shipmentId;

	/**
	 * 运单号
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	public String getActualShipDateTime() {
		return this.actualShipDateTime;
	}
	public void setActualShipDateTime(String actualShipDateTime) {
		this.actualShipDateTime = actualShipDateTime;
	}

	public String getErpOrder() {
		return this.erpOrder;
	}
	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}

	public String getErpOrderType() {
		return this.erpOrderType;
	}
	public void setErpOrderType(String erpOrderType) {
		this.erpOrderType = erpOrderType;
	}

	public String getExpressCompanyCode() {
		return this.expressCompanyCode;
	}
	public void setExpressCompanyCode(String expressCompanyCode) {
		this.expressCompanyCode = expressCompanyCode;
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}
	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<OutStockStuffInfo> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<OutStockStuffInfo> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReturnTracking() {
		return this.returnTracking;
	}
	public void setReturnTracking(String returnTracking) {
		this.returnTracking = returnTracking;
	}

	public String getShipmentId() {
		return this.shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getWayBillNo() {
		return this.wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
