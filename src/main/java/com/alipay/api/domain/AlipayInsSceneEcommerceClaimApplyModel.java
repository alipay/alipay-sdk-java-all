package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电商申请报案
 *
 * @author auto create
 * @since 1.0, 2022-08-30 22:09:12
 */
public class AlipayInsSceneEcommerceClaimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3557269596429435782L;

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
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

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
	 * 逆向纠纷单
	 */
	@ApiField("refund_dispute")
	private EcomRefundDisputeDTO refundDispute;

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

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
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

	public EcomRefundDisputeDTO getRefundDispute() {
		return this.refundDispute;
	}
	public void setRefundDispute(EcomRefundDisputeDTO refundDispute) {
		this.refundDispute = refundDispute;
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

}
