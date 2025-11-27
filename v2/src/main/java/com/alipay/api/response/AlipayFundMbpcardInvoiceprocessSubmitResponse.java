package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceOutIndexInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.invoiceprocess.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:31:58
 */
public class AlipayFundMbpcardInvoiceprocessSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1725886683661852455L;

	/** 
	 * 发票外部索引信息
	 */
	@ApiListField("invoice_list")
	@ApiField("invoice_out_index_info")
	private List<InvoiceOutIndexInfo> invoiceList;

	/** 
	 * 流程ID
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 流程状态
	 */
	@ApiField("process_status")
	private String processStatus;

	public void setInvoiceList(List<InvoiceOutIndexInfo> invoiceList) {
		this.invoiceList = invoiceList;
	}
	public List<InvoiceOutIndexInfo> getInvoiceList( ) {
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
