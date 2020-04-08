package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流仓库物料入库同步接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:47
 */
public class KoubeiSalesKbassetStuffLogisticsinstockSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3114738716417439594L;

	/**
	 * 关单时间(YYYY-MM-DD HH:mm:ss)
	 */
	@ApiField("close_date")
	private String closeDate;

	/**
	 * 口碑物料平台商品入库ERP号
	 */
	@ApiField("erp_code")
	private String erpCode;

	/**
	 * ERP订单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 本次物流入库的物流单所属物流公司编号，
当前口碑仅支持一下物流公司
中国邮政： POST
浙江省邮政速递物流有限公司： ZJEMS
顺丰快递： SF
菜鸟： CAINIAO
圆通速递： YTO
宅急送快递： ZJS
中通速递： ZTO
韵达快递： YUNDA
申通快递：STO
	 */
	@ApiField("express_company_code")
	private String expressCompanyCode;

	/**
	 * 本次入库的商品快递物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 入库单明细
	 */
	@ApiListField("item_infos")
	@ApiField("in_stock_stuff_info")
	private List<InStockStuffInfo> itemInfos;

	/**
	 * 供应商入库号
	 */
	@ApiField("receipt_id")
	private String receiptId;

	/**
	 * 由调用方提供的一个唯一的请求ID，每一个请求对应一个id，用于实现调用幂等
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getCloseDate() {
		return this.closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getErpCode() {
		return this.erpCode;
	}
	public void setErpCode(String erpCode) {
		this.erpCode = erpCode;
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

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public List<InStockStuffInfo> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<InStockStuffInfo> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getReceiptId() {
		return this.receiptId;
	}
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
