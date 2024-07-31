package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财务智付核心根据核销关系创建开票账单
 *
 * @author auto create
 * @since 1.0, 2023-09-11 18:02:09
 */
public class AlipayBossFncGfsmartpaySyncinvoicebillinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4417379619953812226L;

	/**
	 * 核销单DTO
	 */
	@ApiField("invoice_bill_info_dto")
	private BizInvoiceBillInfoDTO invoiceBillInfoDto;

	/**
	 * 影子标记
	 */
	@ApiField("test_mode")
	private Boolean testMode;

	public BizInvoiceBillInfoDTO getInvoiceBillInfoDto() {
		return this.invoiceBillInfoDto;
	}
	public void setInvoiceBillInfoDto(BizInvoiceBillInfoDTO invoiceBillInfoDto) {
		this.invoiceBillInfoDto = invoiceBillInfoDto;
	}

	public Boolean getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}

}
