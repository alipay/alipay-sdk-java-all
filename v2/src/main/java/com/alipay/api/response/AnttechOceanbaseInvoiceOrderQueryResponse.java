package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObcInvoiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.invoice.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 10:17:30
 */
public class AnttechOceanbaseInvoiceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1549844385935318937L;

	/** 
	 * 申请单id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 发票单列表
	 */
	@ApiListField("invoices")
	@ApiField("obc_invoice_result")
	private List<ObcInvoiceResult> invoices;

	/** 
	 * 申请单状态备注，对该申请单开票状态的一些说明
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 发票申请单发票开具状态
	 */
	@ApiField("status")
	private String status;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setInvoices(List<ObcInvoiceResult> invoices) {
		this.invoices = invoices;
	}
	public List<ObcInvoiceResult> getInvoices( ) {
		return this.invoices;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
