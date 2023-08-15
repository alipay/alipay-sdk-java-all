package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票申请状态变更
 *
 * @author auto create
 * @since 1.0, 2023-05-04 14:21:16
 */
public class AlipayEbppInvoiceMerchantApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4335194971778314485L;

	/**
	 * 发票申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请失败原因说明
	 */
	@ApiField("apply_result_memo")
	private String applyResultMemo;

	/**
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 已开具成功的发票
	 */
	@ApiListField("attach_invoices")
	@ApiField("merchant_invoice_u_k_d_t_o")
	private List<MerchantInvoiceUKDTO> attachInvoices;

	/**
	 * 批次ID
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
