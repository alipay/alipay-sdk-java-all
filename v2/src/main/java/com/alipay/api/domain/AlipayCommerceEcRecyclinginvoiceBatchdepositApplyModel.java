package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量发起入账申请
 *
 * @author auto create
 * @since 1.0, 2026-07-29 09:51:31
 */
public class AlipayCommerceEcRecyclinginvoiceBatchdepositApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7394352361447831974L;

	/**
	 * 待出资的订单ID列表
	 */
	@ApiListField("order_id_list")
	@ApiField("string")
	private List<String> orderIdList;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public List<String> getOrderIdList() {
		return this.orderIdList;
	}
	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
