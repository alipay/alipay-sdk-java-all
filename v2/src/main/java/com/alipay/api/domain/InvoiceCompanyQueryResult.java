package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业税务信息查询输出
 *
 * @author auto create
 * @since 1.0, 2020-06-18 22:32:37
 */
public class InvoiceCompanyQueryResult extends AlipayObject {

	private static final long serialVersionUID = 1463567424647379127L;

	/**
	 * 发票限额信息
	 */
	@ApiListField("amount_limit_dto_list")
	@ApiField("invoice_amount_limit_d_t_o")
	private List<InvoiceAmountLimitDTO> amountLimitDtoList;

	/**
	 * 企业税务信息
	 */
	@ApiField("invoice_company_dto")
	private InvoiceCompanyDTO invoiceCompanyDto;

	/**
	 * 税号已开通产品信息
	 */
	@ApiListField("invoice_open_product_dto_list")
	@ApiField("invoice_open_product_d_t_o")
	private List<InvoiceOpenProductDTO> invoiceOpenProductDtoList;

	/**
	 * 入驻工单ID
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 入驻工单状态
	 */
	@ApiField("register_status")
	private Long registerStatus;

	public List<InvoiceAmountLimitDTO> getAmountLimitDtoList() {
		return this.amountLimitDtoList;
	}
	public void setAmountLimitDtoList(List<InvoiceAmountLimitDTO> amountLimitDtoList) {
		this.amountLimitDtoList = amountLimitDtoList;
	}

	public InvoiceCompanyDTO getInvoiceCompanyDto() {
		return this.invoiceCompanyDto;
	}
	public void setInvoiceCompanyDto(InvoiceCompanyDTO invoiceCompanyDto) {
		this.invoiceCompanyDto = invoiceCompanyDto;
	}

	public List<InvoiceOpenProductDTO> getInvoiceOpenProductDtoList() {
		return this.invoiceOpenProductDtoList;
	}
	public void setInvoiceOpenProductDtoList(List<InvoiceOpenProductDTO> invoiceOpenProductDtoList) {
		this.invoiceOpenProductDtoList = invoiceOpenProductDtoList;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public Long getRegisterStatus() {
		return this.registerStatus;
	}
	public void setRegisterStatus(Long registerStatus) {
		this.registerStatus = registerStatus;
	}

}
