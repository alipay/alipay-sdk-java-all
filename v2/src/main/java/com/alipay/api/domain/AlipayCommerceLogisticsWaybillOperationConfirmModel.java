package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹操作确认接口
 *
 * @author auto create
 * @since 1.0, 2025-05-12 15:22:21
 */
public class AlipayCommerceLogisticsWaybillOperationConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4163554686816453229L;

	/**
	 * 接口调用方的渠道名称，由支付宝分配
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 操作运单范围
	 */
	@ApiField("channel_waybill_operation_scope")
	private String channelWaybillOperationScope;

	/**
	 * 仓节点唯一id
	 */
	@ApiField("lbx")
	private String lbx;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 二方外部订单id
	 */
	@ApiField("outbiz_order_id")
	private String outbizOrderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelWaybillOperationScope() {
		return this.channelWaybillOperationScope;
	}
	public void setChannelWaybillOperationScope(String channelWaybillOperationScope) {
		this.channelWaybillOperationScope = channelWaybillOperationScope;
	}

	public String getLbx() {
		return this.lbx;
	}
	public void setLbx(String lbx) {
		this.lbx = lbx;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutbizOrderId() {
		return this.outbizOrderId;
	}
	public void setOutbizOrderId(String outbizOrderId) {
		this.outbizOrderId = outbizOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
