package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预提事项详情查询openapi接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:06:51
 */
public class AlipayBossFncAggregationDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7651857189159562278L;

	/**
	 * 采购系统PO单?
	 */
	@ApiField("po_no")
	private String poNo;

	public String getPoNo() {
		return this.poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

}
