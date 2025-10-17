package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceUkDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.status.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:17
 */
public class AlipayEbppInvoiceApplyStatusNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5231794998499947726L;

	/** 
	 * update_success=false时返回。
该申请下存在未归集成功的发票。即：attach_invoices 中携带的发票存在未回传成功的发票。
此时调用方，需先调用发票回传接口，完成发票回传。然后再重试此接口。
	 */
	@ApiListField("missing_invoices")
	@ApiField("invoice_uk_d_t_o")
	private List<InvoiceUkDTO> missingInvoices;

	/** 
	 * 事务执行结果，true成功，false失败
	 */
	@ApiField("update_success")
	private Boolean updateSuccess;

	public void setMissingInvoices(List<InvoiceUkDTO> missingInvoices) {
		this.missingInvoices = missingInvoices;
	}
	public List<InvoiceUkDTO> getMissingInvoices( ) {
		return this.missingInvoices;
	}

	public void setUpdateSuccess(Boolean updateSuccess) {
		this.updateSuccess = updateSuccess;
	}
	public Boolean getUpdateSuccess( ) {
		return this.updateSuccess;
	}

}
