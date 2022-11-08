package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人才就业电子合同查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-24 16:11:13
 */
public class AlipayEbppIndustryJobContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4681291566486218438L;

	/**
	 * 创建电子合同的订单号
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

}
