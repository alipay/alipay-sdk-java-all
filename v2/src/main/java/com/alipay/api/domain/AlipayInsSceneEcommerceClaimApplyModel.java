package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电商申请报案
 *
 * @author auto create
 * @since 1.0, 2025-06-04 10:02:01
 */
public class AlipayInsSceneEcommerceClaimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6733135143946549722L;

	/**
	 * 申请报案金额（单位：分）
	 */
	@ApiField("apply_amout")
	private Long applyAmout;

	/**
	 * 报案材料
	 */
	@ApiListField("attachments")
	@ApiField("ins_open_attachment_d_t_o")
	private List<InsOpenAttachmentDTO> attachments;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 理赔支付模式
	 */
	@ApiField("claim_pay_mode")
	private String claimPayMode;

	/**
	 * 理赔业务数据
	 */
	@ApiField("claim_report_biz_info")
	private String claimReportBizInfo;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 蚂蚁保系统生成的责任编号
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 订单
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单列表
	 */
	@ApiListField("policy_no_list")
	@ApiField("string")
	private List<String> policyNoList;

	/**
	 * 逆向纠纷单
	 */
	@ApiField("refund_dispute")
	private EcomRefundDisputeDTO refundDispute;

	/**
	 * 退货物流信息
	 */
	@ApiField("refund_logistics_order")
	private EcomLogisticsOrderDTO refundLogisticsOrder;

	/**
	 * 报案操作人类型
	 */
	@ApiField("report_operator_type")
	private String reportOperatorType;

	/**
	 * 报案业务单号（用于幂等）
	 */
	@ApiField("report_out_biz_no")
	private String reportOutBizNo;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 报案来源
	 */
	@ApiField("source")
	private String source;

	public Long getApplyAmout() {
		return this.applyAmout;
	}
	public void setApplyAmout(Long applyAmout) {
		this.applyAmout = applyAmout;
	}

	public List<InsOpenAttachmentDTO> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<InsOpenAttachmentDTO> attachments) {
		this.attachments = attachments;
	}

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public String getClaimPayMode() {
		return this.claimPayMode;
	}
	public void setClaimPayMode(String claimPayMode) {
		this.claimPayMode = claimPayMode;
	}

	public String getClaimReportBizInfo() {
		return this.claimReportBizInfo;
	}
	public void setClaimReportBizInfo(String claimReportBizInfo) {
		this.claimReportBizInfo = claimReportBizInfo;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public String getLiabilityNo() {
		return this.liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public List<String> getPolicyNoList() {
		return this.policyNoList;
	}
	public void setPolicyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	public EcomRefundDisputeDTO getRefundDispute() {
		return this.refundDispute;
	}
	public void setRefundDispute(EcomRefundDisputeDTO refundDispute) {
		this.refundDispute = refundDispute;
	}

	public EcomLogisticsOrderDTO getRefundLogisticsOrder() {
		return this.refundLogisticsOrder;
	}
	public void setRefundLogisticsOrder(EcomLogisticsOrderDTO refundLogisticsOrder) {
		this.refundLogisticsOrder = refundLogisticsOrder;
	}

	public String getReportOperatorType() {
		return this.reportOperatorType;
	}
	public void setReportOperatorType(String reportOperatorType) {
		this.reportOperatorType = reportOperatorType;
	}

	public String getReportOutBizNo() {
		return this.reportOutBizNo;
	}
	public void setReportOutBizNo(String reportOutBizNo) {
		this.reportOutBizNo = reportOutBizNo;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
