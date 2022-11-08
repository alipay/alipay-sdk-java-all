package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票申请状态变更
 *
 * @author auto create
 * @since 1.0, 2022-06-22 09:58:31
 */
public class AlipayEbppInvoiceMerchantApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4816929834269842998L;

	/**
	 * 发票申请ID, 由支付宝发票平台生成，申请单唯一标识，接口幂等字段.
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 原因说明，申请失败时必填
	 */
	@ApiField("apply_result_memo")
	private String applyResultMemo;

	/**
	 * 申请状态，可选值：
apply_success: 申请受理成功
waiting_pull：待拉取 
inv_success: 开票成功；
inv_fail：开票失败
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 已开具成功的发票
申请状态为inv_success时必填
	 */
	@ApiListField("attach_invoices")
	@ApiField("merchant_invoice_u_k_d_t_o")
	private List<MerchantInvoiceUKDTO> attachInvoices;

	/**
	 * 批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyResultMemo() {
		return this.applyResultMemo;
	}
	public void setApplyResultMemo(String applyResultMemo) {
		this.applyResultMemo = applyResultMemo;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public List<MerchantInvoiceUKDTO> getAttachInvoices() {
		return this.attachInvoices;
	}
	public void setAttachInvoices(List<MerchantInvoiceUKDTO> attachInvoices) {
		this.attachInvoices = attachInvoices;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

}
