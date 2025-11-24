package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方履约问诊订单信息回传API
 *
 * @author auto create
 * @since 1.0, 2025-11-03 16:12:40
 */
public class AlipayCommerceMedicalOuterorderStatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5428883135749571977L;

	/**
	 * 咨询场景
	 */
	@ApiField("consult_business")
	private String consultBusiness;

	/**
	 * 小结链接
	 */
	@ApiField("consult_summary_url")
	private String consultSummaryUrl;

	/**
	 * 咨询时间
	 */
	@ApiField("consult_time")
	private Date consultTime;

	/**
	 * 医生头像图片的网络地址（URL）用于展示医生形象。
	 */
	@ApiField("doctor_avatar_url")
	private String doctorAvatarUrl;

	/**
	 * 提供服务的医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 履约单id
	 */
	@ApiField("fulfillment_order_id")
	private String fulfillmentOrderId;

	/**
	 * 主单的状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部单号
	 */
	@ApiField("partner_order_id")
	private String partnerOrderId;

	/**
	 * 处方链接
	 */
	@ApiField("prescription_url")
	private String prescriptionUrl;

	/**
	 * 订单金额：单位元
	 */
	@ApiField("price")
	private String price;

	public String getConsultBusiness() {
		return this.consultBusiness;
	}
	public void setConsultBusiness(String consultBusiness) {
		this.consultBusiness = consultBusiness;
	}

	public String getConsultSummaryUrl() {
		return this.consultSummaryUrl;
	}
	public void setConsultSummaryUrl(String consultSummaryUrl) {
		this.consultSummaryUrl = consultSummaryUrl;
	}

	public Date getConsultTime() {
		return this.consultTime;
	}
	public void setConsultTime(Date consultTime) {
		this.consultTime = consultTime;
	}

	public String getDoctorAvatarUrl() {
		return this.doctorAvatarUrl;
	}
	public void setDoctorAvatarUrl(String doctorAvatarUrl) {
		this.doctorAvatarUrl = doctorAvatarUrl;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getFulfillmentOrderId() {
		return this.fulfillmentOrderId;
	}
	public void setFulfillmentOrderId(String fulfillmentOrderId) {
		this.fulfillmentOrderId = fulfillmentOrderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPartnerOrderId() {
		return this.partnerOrderId;
	}
	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}

	public String getPrescriptionUrl() {
		return this.prescriptionUrl;
	}
	public void setPrescriptionUrl(String prescriptionUrl) {
		this.prescriptionUrl = prescriptionUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
