package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:21:58
 */
public class AlipayEbppInvoiceTitleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2193579648366774793L;

	/** 
	 * 发票要素列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 依据条件查询到的发票总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}
	public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
