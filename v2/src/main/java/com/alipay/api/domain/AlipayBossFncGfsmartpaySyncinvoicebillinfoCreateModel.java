package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁财务智付核心根据核销关系创建开票账单
 *
 * @author auto create
 * @since 1.0, 2023-08-25 15:04:24
 */
public class AlipayBossFncGfsmartpaySyncinvoicebillinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6623682439453815215L;

	/**
	 * 核销单DTO
	 */
	@ApiField("invoice_bill_info_dto")
	private BizInvoiceBillInfoDTO invoiceBillInfoDto;

	public BizInvoiceBillInfoDTO getInvoiceBillInfoDto() {
		return this.invoiceBillInfoDto;
	}
	public void setInvoiceBillInfoDto(BizInvoiceBillInfoDTO invoiceBillInfoDto) {
		this.invoiceBillInfoDto = invoiceBillInfoDto;
	}

}
