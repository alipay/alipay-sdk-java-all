package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:17:33
 */
public class AlipayCommerceTransportEtcenterpriseVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6498387153742452661L;

	/** 
	 * 支付宝etc平台扣款协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/** 
	 * SUCCESS：成功； FAIL：失败
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 成功/其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 用户ETC卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 代扣签约状态
	 */
	@ApiField("deduct_sign_status")
	private String deductSignStatus;

	/** 
	 * 状态触发的具体时间
	 */
	@ApiField("device_biz_time")
	private Date deviceBizTime;

	/** 
	 * 用户ETC设备OBU号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/** 
	 * USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/** 
	 * 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
	 */
	@ApiField("device_status_detail")
	private String deviceStatusDetail;

	/** 
	 * 设备首次激活时间
	 */
	@ApiField("first_actived_time")
	private Date firstActivedTime;

	/** 
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 合约到期时间
	 */
	@ApiField("service_exp")
	private Date serviceExp;

	/** 
	 * 用于区分车辆归属真实企业信息，vehicle_corp_id由两部分组成corp-租车公司Id
	 */
	@ApiField("vehicle_corp_id")
	private String vehicleCorpId;

	/** 
	 * 用于展示车辆归属企业名称
	 */
	@ApiField("vehicle_corp_name")
	private String vehicleCorpName;

	/** 
	 * 支付宝车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}
	public String getBizAgreementNo( ) {
		return this.bizAgreementNo;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setDeductSignStatus(String deductSignStatus) {
		this.deductSignStatus = deductSignStatus;
	}
	public String getDeductSignStatus( ) {
		return this.deductSignStatus;
	}

	public void setDeviceBizTime(Date deviceBizTime) {
		this.deviceBizTime = deviceBizTime;
	}
	public Date getDeviceBizTime( ) {
		return this.deviceBizTime;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getDeviceNo( ) {
		return this.deviceNo;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	public String getDeviceStatus( ) {
		return this.deviceStatus;
	}

	public void setDeviceStatusDetail(String deviceStatusDetail) {
		this.deviceStatusDetail = deviceStatusDetail;
	}
	public String getDeviceStatusDetail( ) {
		return this.deviceStatusDetail;
	}

	public void setFirstActivedTime(Date firstActivedTime) {
		this.firstActivedTime = firstActivedTime;
	}
	public Date getFirstActivedTime( ) {
		return this.firstActivedTime;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setServiceExp(Date serviceExp) {
		this.serviceExp = serviceExp;
	}
	public Date getServiceExp( ) {
		return this.serviceExp;
	}

	public void setVehicleCorpId(String vehicleCorpId) {
		this.vehicleCorpId = vehicleCorpId;
	}
	public String getVehicleCorpId( ) {
		return this.vehicleCorpId;
	}

	public void setVehicleCorpName(String vehicleCorpName) {
		this.vehicleCorpName = vehicleCorpName;
	}
	public String getVehicleCorpName( ) {
		return this.vehicleCorpName;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleId( ) {
		return this.vehicleId;
	}

}
