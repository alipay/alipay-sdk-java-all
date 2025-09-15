package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁售后费用项信息
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:18
 */
public class RentAftersaleFundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5269446138884171282L;

	/**
	 * 费用项明细列表
	 */
	@ApiListField("fund_item_list")
	@ApiField("rent_aftersale_fund_item_v_o")
	private List<RentAftersaleFundItemVO> fundItemList;

	/**
	 * 总金额，单位：元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public List<RentAftersaleFundItemVO> getFundItemList() {
		return this.fundItemList;
	}
	public void setFundItemList(List<RentAftersaleFundItemVO> fundItemList) {
		this.fundItemList = fundItemList;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
