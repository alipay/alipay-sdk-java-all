package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态ISV及卖家有效订单数据查询
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:31:46
 */
public class AntMerchantExpandEcoQuantityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1696157967226418552L;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 查询年月 格式：yyyyMM
	 */
	@ApiField("month")
	private String month;

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

}
