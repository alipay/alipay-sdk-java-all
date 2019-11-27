package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * xxxxx
 *
 * @author auto create
 * @since 1.0, 2019-01-24 18:06:41
 */
public class AlipaySecurityProdXxxxxxxxRefuseModel extends AlipayObject {

	private static final long serialVersionUID = 7762281866964421845L;

	/**
	 * 金额
	 */
	@ApiListField("total_fee_list")
	@ApiField("price")
	private List<String> totalFeeList;

	public List<String> getTotalFeeList() {
		return this.totalFeeList;
	}
	public void setTotalFeeList(List<String> totalFeeList) {
		this.totalFeeList = totalFeeList;
	}

}
