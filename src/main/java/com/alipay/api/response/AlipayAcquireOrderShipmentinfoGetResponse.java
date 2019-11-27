package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsStepInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.order.shipmentinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOrderShipmentinfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7775311275584153436L;

	/** 
	 * 派件员手机号
	 */
	@ApiField("delivery_mobile")
	private String deliveryMobile;

	/** 
	 * 派件员姓名
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/** 
	 * 物流运单号
	 */
	@ApiField("logistics_bill_no")
	private String logisticsBillNo;

	/** 
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/** 
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/** 
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/** 
	 * 收货人手机号
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/** 
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/** 
	 * 收货人固定电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/** 
	 * 物流流转信息
	 */
	@ApiListField("step_infos")
	@ApiField("logistics_step_info")
	private List<LogisticsStepInfo> stepInfos;

	public void setDeliveryMobile(String deliveryMobile) {
		this.deliveryMobile = deliveryMobile;
	}
	public String getDeliveryMobile( ) {
		return this.deliveryMobile;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryName( ) {
		return this.deliveryName;
	}

	public void setLogisticsBillNo(String logisticsBillNo) {
		this.logisticsBillNo = logisticsBillNo;
	}
	public String getLogisticsBillNo( ) {
		return this.logisticsBillNo;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	public String getLogisticsCode( ) {
		return this.logisticsCode;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}
	public String getLogisticsName( ) {
		return this.logisticsName;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverAddress( ) {
		return this.receiverAddress;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile( ) {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName( ) {
		return this.receiverName;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getReceiverPhone( ) {
		return this.receiverPhone;
	}

	public void setStepInfos(List<LogisticsStepInfo> stepInfos) {
		this.stepInfos = stepInfos;
	}
	public List<LogisticsStepInfo> getStepInfos( ) {
		return this.stepInfos;
	}

}
