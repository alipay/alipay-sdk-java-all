package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关闭追偿单
 *
 * @author auto create
 * @since 1.0, 2025-10-29 16:07:29
 */
public class AlipayInsSceneClaimOverdueCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3178911129383819245L;

	/**
	 * 赔案单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 外部订单单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 追偿单号
	 */
	@ApiField("overdue_no")
	private String overdueNo;

	/**
	 * 合作商id
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 当前支付信息
	 */
	@ApiField("pay_entry_dto")
	private InsPayEntryDTO payEntryDto;

	/**
	 * 支付信息列表
	 */
	@ApiListField("pay_entry_dto_list")
	@ApiField("ins_pay_entry_d_t_o")
	private List<InsPayEntryDTO> payEntryDtoList;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOverdueNo() {
		return this.overdueNo;
	}
	public void setOverdueNo(String overdueNo) {
		this.overdueNo = overdueNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public InsPayEntryDTO getPayEntryDto() {
		return this.payEntryDto;
	}
	public void setPayEntryDto(InsPayEntryDTO payEntryDto) {
		this.payEntryDto = payEntryDto;
	}

	public List<InsPayEntryDTO> getPayEntryDtoList() {
		return this.payEntryDtoList;
	}
	public void setPayEntryDtoList(List<InsPayEntryDTO> payEntryDtoList) {
		this.payEntryDtoList = payEntryDtoList;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}
