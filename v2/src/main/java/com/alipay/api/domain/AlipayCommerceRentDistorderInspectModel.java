package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分销订单归还验货
 *
 * @author auto create
 * @since 1.0, 2026-09-21 14:57:51
 */
public class AlipayCommerceRentDistorderInspectModel extends AlipayObject {

	private static final long serialVersionUID = 8112776296788781248L;

	/**
	 * 分销订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 渠道买家ID
	 */
	@ApiField("channel_buyer_id")
	private String channelBuyerId;

	/**
	 * 渠道订单号
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/**
	 * null
	 */
	@ApiListField("deduct_fees")
	@ApiField("distribution_order_inspect_deduct_fee_d_t_o")
	private List<DistributionOrderInspectDeductFeeDTO> deductFees;

	/**
	 * 分销渠道
	 */
	@ApiField("distribution_channel")
	private String distributionChannel;

	/**
	 * 验货是否通过，未通过会发起赔付
	 */
	@ApiField("inspection_result")
	private Boolean inspectionResult;

	/**
	 * 验货异常描述凭证
	 */
	@ApiField("proof")
	private DistributionOrderInspectProofDTO proof;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getChannelBuyerId() {
		return this.channelBuyerId;
	}
	public void setChannelBuyerId(String channelBuyerId) {
		this.channelBuyerId = channelBuyerId;
	}

	public String getChannelOrderId() {
		return this.channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public List<DistributionOrderInspectDeductFeeDTO> getDeductFees() {
		return this.deductFees;
	}
	public void setDeductFees(List<DistributionOrderInspectDeductFeeDTO> deductFees) {
		this.deductFees = deductFees;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public Boolean getInspectionResult() {
		return this.inspectionResult;
	}
	public void setInspectionResult(Boolean inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

	public DistributionOrderInspectProofDTO getProof() {
		return this.proof;
	}
	public void setProof(DistributionOrderInspectProofDTO proof) {
		this.proof = proof;
	}

}
