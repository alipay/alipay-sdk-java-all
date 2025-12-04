package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票到票DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 16:38:04
 */
public class InvoiceArrivalDTO extends AlipayObject {

	private static final long serialVersionUID = 1438763768239234487L;

	/**
	 * 发票到票明细DTO列表
	 */
	@ApiListField("invoice_arrival_detail_dtos")
	@ApiField("invoice_arrival_detail_d_t_o")
	private List<InvoiceArrivalDetailDTO> invoiceArrivalDetailDtos;

	/**
	 * 发票账单ID
	 */
	@ApiField("invoice_bill_id")
	private String invoiceBillId;

	/**
	 * 开票账单号
	 */
	@ApiField("invoice_bill_no")
	private String invoiceBillNo;

	/**
	 * 使用金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("use_amount")
	private String useAmount;

	/**
	 * 代扣税金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("wht_amount")
	private String whtAmount;

	/**
	 * 代扣税税率
	 */
	@ApiField("wht_rate")
	private String whtRate;

	public List<InvoiceArrivalDetailDTO> getInvoiceArrivalDetailDtos() {
		return this.invoiceArrivalDetailDtos;
	}
	public void setInvoiceArrivalDetailDtos(List<InvoiceArrivalDetailDTO> invoiceArrivalDetailDtos) {
		this.invoiceArrivalDetailDtos = invoiceArrivalDetailDtos;
	}

	public String getInvoiceBillId() {
		return this.invoiceBillId;
	}
	public void setInvoiceBillId(String invoiceBillId) {
		this.invoiceBillId = invoiceBillId;
	}

	public String getInvoiceBillNo() {
		return this.invoiceBillNo;
	}
	public void setInvoiceBillNo(String invoiceBillNo) {
		this.invoiceBillNo = invoiceBillNo;
	}

	public String getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

	public String getWhtAmount() {
		return this.whtAmount;
	}
	public void setWhtAmount(String whtAmount) {
		this.whtAmount = whtAmount;
	}

	public String getWhtRate() {
		return this.whtRate;
	}
	public void setWhtRate(String whtRate) {
		this.whtRate = whtRate;
	}

}
