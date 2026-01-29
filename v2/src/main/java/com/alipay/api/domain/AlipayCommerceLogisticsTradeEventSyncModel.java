package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激励交易回传
 *
 * @author auto create
 * @since 1.0, 2026-01-07 10:55:23
 */
public class AlipayCommerceLogisticsTradeEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2879289258961426325L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 小件员用户标识
	 */
	@ApiField("expressman_open_id")
	private String expressmanOpenId;

	/**
	 * 小件员支付宝用户id
	 */
	@ApiField("expressman_user_id")
	private String expressmanUserId;

	/**
	 * 激励码值
	 */
	@ApiField("incentive_code")
	private String incentiveCode;

	/**
	 * json字符串格式扩展字段，用于扩展业务字段场景
{"key1":"value1","key2":"value2","key3":value3}
key：expressman_role_type(快递员角色类型)
value：EXPRESSMAN(快递员)/THIRD_MERCHANT(三方商户)
	 */
	@ApiField("log_ext_info")
	private String logExtInfo;

	/**
	 * 商户标识（接口调用方的渠道编码，由支付宝分配）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物料类型
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * true 代表仅记录，不激励快递员
false 代表正常记录，并激励快递员

默认false
	 */
	@ApiField("only_record")
	private Boolean onlyRecord;

	/**
	 * ALIPAY 支付宝操作渠道
OTHER 其他渠道
	 */
	@ApiField("operation_source")
	private String operationSource;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付者用户标识
	 */
	@ApiField("pay_open_id")
	private String payOpenId;

	/**
	 * 支付者支付宝用户id
	 */
	@ApiField("pay_user_id")
	private String payUserId;

	/**
	 * 商户侧运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getExpressmanOpenId() {
		return this.expressmanOpenId;
	}
	public void setExpressmanOpenId(String expressmanOpenId) {
		this.expressmanOpenId = expressmanOpenId;
	}

	public String getExpressmanUserId() {
		return this.expressmanUserId;
	}
	public void setExpressmanUserId(String expressmanUserId) {
		this.expressmanUserId = expressmanUserId;
	}

	public String getIncentiveCode() {
		return this.incentiveCode;
	}
	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getLogExtInfo() {
		return this.logExtInfo;
	}
	public void setLogExtInfo(String logExtInfo) {
		this.logExtInfo = logExtInfo;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public Boolean getOnlyRecord() {
		return this.onlyRecord;
	}
	public void setOnlyRecord(Boolean onlyRecord) {
		this.onlyRecord = onlyRecord;
	}

	public String getOperationSource() {
		return this.operationSource;
	}
	public void setOperationSource(String operationSource) {
		this.operationSource = operationSource;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayOpenId() {
		return this.payOpenId;
	}
	public void setPayOpenId(String payOpenId) {
		this.payOpenId = payOpenId;
	}

	public String getPayUserId() {
		return this.payUserId;
	}
	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
