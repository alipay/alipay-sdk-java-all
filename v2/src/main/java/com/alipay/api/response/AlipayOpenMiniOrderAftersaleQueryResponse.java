package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AftersaleAddressInfoVO;
import com.alipay.api.domain.AftersaleItemInfo;
import com.alipay.api.domain.OrderMediaInfo;
import com.alipay.api.domain.LogisticsWaybill;
import com.alipay.api.domain.AftersaleServiceTag;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.aftersale.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 16:07:33
 */
public class AlipayOpenMiniOrderAftersaleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4261698251711588389L;

	/** 
	 * 售后单触发类型
	 */
	@ApiField("action_type")
	private String actionType;

	/** 
	 * 创建售后单时用户填写的补充描述
	 */
	@ApiField("additional_reason")
	private String additionalReason;

	/** 
	 * 退货地址信息
	 */
	@ApiField("address_info")
	private AftersaleAddressInfoVO addressInfo;

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
	 * 用户通过标准售后组件申请售后时，上传的证明图片和视频信息
	 */
	@ApiListField("aftersale_media_list")
	@ApiField("order_media_info")
	private List<OrderMediaInfo> aftersaleMediaList;

	/** 
	 * 用户售后发起原因
	 */
	@ApiField("aftersale_reason")
	private String aftersaleReason;

	/** 
	 * 申请退款金额，单位：元,精确到小数点后两位
	 */
	@ApiField("apply_refund_amount")
	private String applyRefundAmount;

	/** 
	 * 创建时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 最终退款金额，单位：元,精确到小数点后两位
	 */
	@ApiField("finally_refund_amount")
	private String finallyRefundAmount;

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
	 * 售后服务标签列表，该笔售后单享有哪些需要关注的售后保障服务。
	 */
	@ApiListField("service_tag_list")
	@ApiField("aftersale_service_tag")
	private List<AftersaleServiceTag> serviceTagList;

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

	public void setAdditionalReason(String additionalReason) {
		this.additionalReason = additionalReason;
	}
	public String getAdditionalReason( ) {
		return this.additionalReason;
	}

	public void setAddressInfo(AftersaleAddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}
	public AftersaleAddressInfoVO getAddressInfo( ) {
		return this.addressInfo;
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

	public void setAftersaleMediaList(List<OrderMediaInfo> aftersaleMediaList) {
		this.aftersaleMediaList = aftersaleMediaList;
	}
	public List<OrderMediaInfo> getAftersaleMediaList( ) {
		return this.aftersaleMediaList;
	}

	public void setAftersaleReason(String aftersaleReason) {
		this.aftersaleReason = aftersaleReason;
	}
	public String getAftersaleReason( ) {
		return this.aftersaleReason;
	}

	public void setApplyRefundAmount(String applyRefundAmount) {
		this.applyRefundAmount = applyRefundAmount;
	}
	public String getApplyRefundAmount( ) {
		return this.applyRefundAmount;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setFinallyRefundAmount(String finallyRefundAmount) {
		this.finallyRefundAmount = finallyRefundAmount;
	}
	public String getFinallyRefundAmount( ) {
		return this.finallyRefundAmount;
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

	public void setServiceTagList(List<AftersaleServiceTag> serviceTagList) {
		this.serviceTagList = serviceTagList;
	}
	public List<AftersaleServiceTag> getServiceTagList( ) {
		return this.serviceTagList;
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
