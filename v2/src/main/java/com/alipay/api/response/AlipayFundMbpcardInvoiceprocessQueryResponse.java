package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceAuditInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.invoiceprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:26:57
 */
public class AlipayFundMbpcardInvoiceprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8741994852517561248L;

	/** 
	 * 发票审核列表
	 */
	@ApiListField("invoice_list")
	@ApiField("invoice_audit_info")
	private List<InvoiceAuditInfo> invoiceList;

	/** 
	 * 回票处理流程id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 回票处理流程状态
	 */
	@ApiField("process_status")
	private String processStatus;

	public void setInvoiceList(List<InvoiceAuditInfo> invoiceList) {
		this.invoiceList = invoiceList;
	}
	public List<InvoiceAuditInfo> getInvoiceList( ) {
		return this.invoiceList;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getProcessStatus( ) {
		return this.processStatus;
	}

}
