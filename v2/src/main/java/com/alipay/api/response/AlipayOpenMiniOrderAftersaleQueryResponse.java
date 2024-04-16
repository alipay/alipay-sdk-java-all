package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AftersaleItemInfo;
import com.alipay.api.domain.LogisticsWaybill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.aftersale.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-12 10:13:44
 */
public class AlipayOpenMiniOrderAftersaleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5535632165866899268L;

	/** 
	 * 售后单触发类型
	 */
	@ApiField("action_type")
	private String actionType;

	/** 
	 * 商品列表
	 */
	@ApiListField("aftersale_goods_info_list")
	@ApiField("aftersale_item_info")
	private List<AftersaleItemInfo> aftersaleGoodsInfoList;

	/** 
	 * 平台售后单号
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/** 
	 * 用户售后发起原因
	 */
	@ApiField("aftersale_reason")
	private String aftersaleReason;

	/** 
	 * 物流单详情
	 */
	@ApiListField("logistics_waybills")
	@ApiField("logistics_waybill")
	private List<LogisticsWaybill> logisticsWaybills;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/** 
	 * 商家小程序售后单页面
	 */
	@ApiField("path")
	private String path;

	/** 
	 * 售后单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 售后单状态code
	 */
	@ApiField("status_code")
	private String statusCode;

	/** 
	 * 售后类型
	 */
	@ApiField("type")
	private String type;

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionType( ) {
		return this.actionType;
	}

	public void setAftersaleGoodsInfoList(List<AftersaleItemInfo> aftersaleGoodsInfoList) {
		this.aftersaleGoodsInfoList = aftersaleGoodsInfoList;
	}
	public List<AftersaleItemInfo> getAftersaleGoodsInfoList( ) {
		return this.aftersaleGoodsInfoList;
	}

	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}
	public String getAftersaleId( ) {
		return this.aftersaleId;
	}

	public void setAftersaleReason(String aftersaleReason) {
		this.aftersaleReason = aftersaleReason;
	}
	public String getAftersaleReason( ) {
		return this.aftersaleReason;
	}

	public void setLogisticsWaybills(List<LogisticsWaybill> logisticsWaybills) {
		this.logisticsWaybills = logisticsWaybills;
	}
	public List<LogisticsWaybill> getLogisticsWaybills( ) {
		return this.logisticsWaybills;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}
	public String getOutAftersaleId( ) {
		return this.outAftersaleId;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusCode( ) {
		return this.statusCode;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
