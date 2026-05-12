package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗商业化订单上传接口入参ext_info
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:00:32
 */
public class MedicalCommercialOrderUploadExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8247953875456786639L;

	/**
	 * 精确到小数点后两位,单位是元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 费用明细
	 */
	@ApiListField("expense_details")
	@ApiField("medical_commercial_order_upload_amount_detail")
	private List<MedicalCommercialOrderUploadAmountDetail> expenseDetails;

	/**
	 * 中医茶饮订单传入商户或服务类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 体检人姓名
	 */
	@ApiField("medical_examination_user")
	private String medicalExaminationUser;

	/**
	 * 商户pid，商品对应主体的pid
	 */
	@ApiField("mrch_pid")
	private String mrchPid;

	/**
	 * 定点医疗机构编码
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 医院名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 支付时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 支付方式
	 */
	@ApiField("pay_way")
	private String payWay;

	/**
	 * 当订单状态为“已退款”、“部分退款”时必填，单位为元，不能大于订单金额，精确到小数点后2位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款说明，商户自定义
	 */
	@ApiField("refund_note")
	private String refundNote;

	/**
	 * 体检报告链接。当订单状态为“已出报告”时必填
	 */
	@ApiField("report_url")
	private String reportUrl;

	/**
	 * 场景卡片
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源标识
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 门店地址，当订单状态为“使用中”、“已完成”、“已出报告”状态时必填
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店名称，当订单状态为“使用中”、“已完成”、“已出报告”状态时必填
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 核销明细，当订单状态为“使用中”时必填
	 */
	@ApiListField("write_off_details")
	@ApiField("medical_commercial_order_upload_amount_detail")
	private List<MedicalCommercialOrderUploadAmountDetail> writeOffDetails;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<MedicalCommercialOrderUploadAmountDetail> getExpenseDetails() {
		return this.expenseDetails;
	}
	public void setExpenseDetails(List<MedicalCommercialOrderUploadAmountDetail> expenseDetails) {
		this.expenseDetails = expenseDetails;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getMedicalExaminationUser() {
		return this.medicalExaminationUser;
	}
	public void setMedicalExaminationUser(String medicalExaminationUser) {
		this.medicalExaminationUser = medicalExaminationUser;
	}

	public String getMrchPid() {
		return this.mrchPid;
	}
	public void setMrchPid(String mrchPid) {
		this.mrchPid = mrchPid;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPayWay() {
		return this.payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundNote() {
		return this.refundNote;
	}
	public void setRefundNote(String refundNote) {
		this.refundNote = refundNote;
	}

	public String getReportUrl() {
		return this.reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public List<MedicalCommercialOrderUploadAmountDetail> getWriteOffDetails() {
		return this.writeOffDetails;
	}
	public void setWriteOffDetails(List<MedicalCommercialOrderUploadAmountDetail> writeOffDetails) {
		this.writeOffDetails = writeOffDetails;
	}

}
