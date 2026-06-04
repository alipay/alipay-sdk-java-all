package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TPA渠道直付状态同步
 *
 * @author auto create
 * @since 1.0, 2026-04-13 20:47:44
 */
public class AlipayCommerceMedicalInsuranceTpadirectpaystatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8331718634184977664L;

	/**
	 * 订单信息回传必传 
	 */
	@ApiField("claim_application")
	private String claimApplication;

	/**
	 * 直付码值
	 */
	@ApiField("code_data")
	private String codeData;

	/**
	 * 回传事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 业务需要拓展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 个单号
	 */
	@ApiField("individual_policy_no")
	private String individualPolicyNo;

	/**
	 * null
	 */
	@ApiListField("medicine_list")
	@ApiField("insurance_medicine_info")
	private List<InsuranceMedicineInfo> medicineList;

	/**
	 * 是否需要自费
	 */
	@ApiField("need_self_pay")
	private Boolean needSelfPay;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单总金额(单位：元，保留2位小数，退款为负数）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 线上：online
线下：offline
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 门店参数
	 */
	@ApiField("outlet_info")
	private OutletInfo outletInfo;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 发票回传状态必传
	 */
	@ApiField("recipe_image")
	private String recipeImage;

	/**
	 * 退款金额(单位：元，保留2位小数，退款为负数）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getClaimApplication() {
		return this.claimApplication;
	}
	public void setClaimApplication(String claimApplication) {
		this.claimApplication = claimApplication;
	}

	public String getCodeData() {
		return this.codeData;
	}
	public void setCodeData(String codeData) {
		this.codeData = codeData;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getIndividualPolicyNo() {
		return this.individualPolicyNo;
	}
	public void setIndividualPolicyNo(String individualPolicyNo) {
		this.individualPolicyNo = individualPolicyNo;
	}

	public List<InsuranceMedicineInfo> getMedicineList() {
		return this.medicineList;
	}
	public void setMedicineList(List<InsuranceMedicineInfo> medicineList) {
		this.medicineList = medicineList;
	}

	public Boolean getNeedSelfPay() {
		return this.needSelfPay;
	}
	public void setNeedSelfPay(Boolean needSelfPay) {
		this.needSelfPay = needSelfPay;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public OutletInfo getOutletInfo() {
		return this.outletInfo;
	}
	public void setOutletInfo(OutletInfo outletInfo) {
		this.outletInfo = outletInfo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRecipeImage() {
		return this.recipeImage;
	}
	public void setRecipeImage(String recipeImage) {
		this.recipeImage = recipeImage;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
