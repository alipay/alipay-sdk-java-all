package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁财务智付核心录入发票
 *
 * @author auto create
 * @since 1.0, 2023-09-11 18:02:06
 */
public class AlipayBossFncGfsmartpayInvoiceserviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7662218125357774259L;

	/**
	 * 发票录入人
	 */
	@ApiField("entry_by")
	private String entryBy;

	/**
	 * 指定的到票关系列表
	 */
	@ApiListField("invoice_specifics_dtos")
	@ApiField("invoice_specifics_d_t_o")
	private List<InvoiceSpecificsDTO> invoiceSpecificsDtos;

	/**
	 * 是否按批输入
	 */
	@ApiField("is_batch")
	private Boolean isBatch;

	/**
	 * 影子标记
	 */
	@ApiField("test_mode")
	private Boolean testMode;

	public String getEntryBy() {
		return this.entryBy;
	}
	public void setEntryBy(String entryBy) {
		this.entryBy = entryBy;
	}

	public List<InvoiceSpecificsDTO> getInvoiceSpecificsDtos() {
		return this.invoiceSpecificsDtos;
	}
	public void setInvoiceSpecificsDtos(List<InvoiceSpecificsDTO> invoiceSpecificsDtos) {
		this.invoiceSpecificsDtos = invoiceSpecificsDtos;
	}

	public Boolean getIsBatch() {
		return this.isBatch;
	}
	public void setIsBatch(Boolean isBatch) {
		this.isBatch = isBatch;
	}

	public Boolean getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}

}
