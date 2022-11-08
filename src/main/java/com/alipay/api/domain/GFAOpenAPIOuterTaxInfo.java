package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部计税信息。在外部计税时传入
 *
 * @author auto create
 * @since 1.0, 2022-06-29 15:14:26
 */
public class GFAOpenAPIOuterTaxInfo extends AlipayObject {

	private static final long serialVersionUID = 3536637422677642666L;

	/**
	 * 外部计税明细列表，支持一费多税模式
	 */
	@ApiListField("tax_info_detail_list")
	@ApiField("g_f_a_open_a_p_i_outer_tax_info_detail")
	private List<GFAOpenAPIOuterTaxInfoDetail> taxInfoDetailList;

	public List<GFAOpenAPIOuterTaxInfoDetail> getTaxInfoDetailList() {
		return this.taxInfoDetailList;
	}
	public void setTaxInfoDetailList(List<GFAOpenAPIOuterTaxInfoDetail> taxInfoDetailList) {
		this.taxInfoDetailList = taxInfoDetailList;
	}

}
