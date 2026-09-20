package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取客户维度的账单下载链接
 *
 * @author auto create
 * @since 1.0, 2026-08-21 16:27:48
 */
public class AnttechMorseMarketingEquityCustbilldownloadQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8346413743745218355L;

	/**
	 * 根据创建接口获取到的账单任务id
	 */
	@ApiField("bill_application_id")
	private String billApplicationId;

	public String getBillApplicationId() {
		return this.billApplicationId;
	}
	public void setBillApplicationId(String billApplicationId) {
		this.billApplicationId = billApplicationId;
	}

}
