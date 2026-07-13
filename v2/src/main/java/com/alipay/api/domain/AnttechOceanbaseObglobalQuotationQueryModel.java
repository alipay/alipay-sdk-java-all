package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询海图多云报价单详情信息接口
 *
 * @author auto create
 * @since 1.0, 2026-06-10 17:37:57
 */
public class AnttechOceanbaseObglobalQuotationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4261476193125652919L;

	/**
	 * null
	 */
	@ApiListField("quotation_no_list")
	@ApiField("string")
	private List<String> quotationNoList;

	public List<String> getQuotationNoList() {
		return this.quotationNoList;
	}
	public void setQuotationNoList(List<String> quotationNoList) {
		this.quotationNoList = quotationNoList;
	}

}
