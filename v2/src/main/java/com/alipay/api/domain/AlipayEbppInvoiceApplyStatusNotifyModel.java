package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票申请状态变更
 *
 * @author auto create
 * @since 1.0, 2022-11-08 13:48:14
 */
public class AlipayEbppInvoiceApplyStatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6172629468725433982L;

	/**
	 * 发票申请ID，由阿里发票平台生成。字母或数字组成。
申请单的唯一标识，幂等字段。
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请状态，可选值：
applying: 申请中，初始状态；
cancelled: 申请已取消、或商户已驳回；
creating_inv: 商户已受理/开票中，待发票结果回传；
inv_failed: 开票失败；
inv_success: 开票成功；
inv_part_success: 部分成功（拆单场景下存在。举例：发票申请拆单之后有10张票，其中有1张开票成功时，此时申请状态为inv_part_success，当10张票全部成功申请状态则为inv_success）
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 该申请下所有已开具成功的发票。
状态变更为 apply_status=inv_success 时该字段必传
	 */
	@ApiListField("invoice_uks")
	@ApiField("invoice_uk_d_t_o")
	private List<InvoiceUkDTO> invoiceUks;

	/**
	 * 说明信息：驳回或失败原因
apply_status=inv_failed 或 apply_status=cancelled 时必传
	 */
	@ApiField("message")
	private String message;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public List<InvoiceUkDTO> getInvoiceUks() {
		return this.invoiceUks;
	}
	public void setInvoiceUks(List<InvoiceUkDTO> invoiceUks) {
		this.invoiceUks = invoiceUks;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
