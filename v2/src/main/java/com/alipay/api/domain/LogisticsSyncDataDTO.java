package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息同步内容
 *
 * @author auto create
 * @since 1.0, 2024-04-08 14:14:17
 */
public class LogisticsSyncDataDTO extends AlipayObject {

	private static final long serialVersionUID = 5883346156113257411L;

	/**
	 * 路由发生地址
	 */
	@ApiField("accept_address")
	private String acceptAddress;

	/**
	 * 路由发生时间
	 */
	@ApiField("accept_time")
	private Date acceptTime;

	/**
	 * 实际寄件重量
	 */
	@ApiField("actual_weight")
	private String actualWeight;

	/**
	 * 认证类型
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 认证类型
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 物流承运公司编码
	 */
	@ApiField("carrier_company_code")
	private String carrierCompanyCode;

	/**
	 * 物流承运公司名称
	 */
	@ApiField("carrier_company_name")
	private String carrierCompanyName;

	/**
	 * 快递员姓名
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 快递员手机号
	 */
	@ApiField("courier_phone")
	private String courierPhone;

	/**
	 * 抵扣金额，单位分
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 入库地址
	 */
	@ApiField("inbound_address")
	private String inboundAddress;

	/**
	 * 入库时间
	 */
	@ApiField("inbound_time")
	private Date inboundTime;

	/**
	 * 保价费，单位分
	 */
	@ApiField("insured_weight_amount")
	private String insuredWeightAmount;

	/**
	 * 承运物流单号
	 */
	@ApiField("logistics_mail_no")
	private String logisticsMailNo;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 主寄件金额，单位分
	 */
	@ApiField("main_amount")
	private String mainAmount;

	/**
	 * 路由节点操作码
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 物流公司单号
	 */
	@ApiField("out_logistics_no")
	private String outLogisticsNo;

	/**
	 * 超重价格，单位分
	 */
	@ApiField("over_weight_amount")
	private String overWeightAmount;

	/**
	 * 包装费，单位分
	 */
	@ApiField("package_amount")
	private String packageAmount;

	/**
	 * 支付状态
	 */
	@ApiField("pay_status")
	private Long payStatus;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 用户支付链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 实收续重金额，单位分
	 */
	@ApiField("receipt_addition")
	private String receiptAddition;

	/**
	 * 实收首重金额，单位分
	 */
	@ApiField("receipt_first")
	private String receiptFirst;

	/**
	 * 实收金额，单位分
	 */
	@ApiField("receipt_total")
	private String receiptTotal;

	/**
	 * 物流揽收时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 路由节点备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 签收时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 签收人地址
	 */
	@ApiField("signer_address")
	private String signerAddress;

	/**
	 * 签收人名称
	 */
	@ApiField("signer_name")
	private String signerName;

	/**
	 * 签收人联系方式
	 */
	@ApiField("signer_phone")
	private String signerPhone;

	/**
	 * 用户实际需要支付金额，单位分
	 */
	@ApiField("user_need_pay")
	private String userNeedPay;

	/**
	 * 用户实际支付金额，单位分
	 */
	@ApiField("user_real_pay")
	private String userRealPay;

	public String getAcceptAddress() {
		return this.acceptAddress;
	}
	public void setAcceptAddress(String acceptAddress) {
		this.acceptAddress = acceptAddress;
	}

	public Date getAcceptTime() {
		return this.acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getActualWeight() {
		return this.actualWeight;
	}
	public void setActualWeight(String actualWeight) {
		this.actualWeight = actualWeight;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCarrierCompanyCode() {
		return this.carrierCompanyCode;
	}
	public void setCarrierCompanyCode(String carrierCompanyCode) {
		this.carrierCompanyCode = carrierCompanyCode;
	}

	public String getCarrierCompanyName() {
		return this.carrierCompanyName;
	}
	public void setCarrierCompanyName(String carrierCompanyName) {
		this.carrierCompanyName = carrierCompanyName;
	}

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhone() {
		return this.courierPhone;
	}
	public void setCourierPhone(String courierPhone) {
		this.courierPhone = courierPhone;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getInboundAddress() {
		return this.inboundAddress;
	}
	public void setInboundAddress(String inboundAddress) {
		this.inboundAddress = inboundAddress;
	}

	public Date getInboundTime() {
		return this.inboundTime;
	}
	public void setInboundTime(Date inboundTime) {
		this.inboundTime = inboundTime;
	}

	public String getInsuredWeightAmount() {
		return this.insuredWeightAmount;
	}
	public void setInsuredWeightAmount(String insuredWeightAmount) {
		this.insuredWeightAmount = insuredWeightAmount;
	}

	public String getLogisticsMailNo() {
		return this.logisticsMailNo;
	}
	public void setLogisticsMailNo(String logisticsMailNo) {
		this.logisticsMailNo = logisticsMailNo;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getMainAmount() {
		return this.mainAmount;
	}
	public void setMainAmount(String mainAmount) {
		this.mainAmount = mainAmount;
	}

	public String getOpCode() {
		return this.opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutLogisticsNo() {
		return this.outLogisticsNo;
	}
	public void setOutLogisticsNo(String outLogisticsNo) {
		this.outLogisticsNo = outLogisticsNo;
	}

	public String getOverWeightAmount() {
		return this.overWeightAmount;
	}
	public void setOverWeightAmount(String overWeightAmount) {
		this.overWeightAmount = overWeightAmount;
	}

	public String getPackageAmount() {
		return this.packageAmount;
	}
	public void setPackageAmount(String packageAmount) {
		this.packageAmount = packageAmount;
	}

	public Long getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Long payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayUrl() {
		return this.payUrl;
	}
	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getReceiptAddition() {
		return this.receiptAddition;
	}
	public void setReceiptAddition(String receiptAddition) {
		this.receiptAddition = receiptAddition;
	}

	public String getReceiptFirst() {
		return this.receiptFirst;
	}
	public void setReceiptFirst(String receiptFirst) {
		this.receiptFirst = receiptFirst;
	}

	public String getReceiptTotal() {
		return this.receiptTotal;
	}
	public void setReceiptTotal(String receiptTotal) {
		this.receiptTotal = receiptTotal;
	}

	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getSignerAddress() {
		return this.signerAddress;
	}
	public void setSignerAddress(String signerAddress) {
		this.signerAddress = signerAddress;
	}

	public String getSignerName() {
		return this.signerName;
	}
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}

	public String getSignerPhone() {
		return this.signerPhone;
	}
	public void setSignerPhone(String signerPhone) {
		this.signerPhone = signerPhone;
	}

	public String getUserNeedPay() {
		return this.userNeedPay;
	}
	public void setUserNeedPay(String userNeedPay) {
		this.userNeedPay = userNeedPay;
	}

	public String getUserRealPay() {
		return this.userRealPay;
	}
	public void setUserRealPay(String userRealPay) {
		this.userRealPay = userRealPay;
	}

}
