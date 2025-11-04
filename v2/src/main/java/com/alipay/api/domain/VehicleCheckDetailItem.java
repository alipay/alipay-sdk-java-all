package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆检测结果明细汇总数据
 *
 * @author auto create
 * @since 1.0, 2025-04-01 10:56:19
 */
public class VehicleCheckDetailItem extends AlipayObject {

	private static final long serialVersionUID = 4812659654827854983L;

	/**
	 * 检测明细title
	 */
	@ApiField("check_item_code")
	private String checkItemCode;

	/**
	 * 检测明细结果
	 */
	@ApiField("check_item_result")
	private Long checkItemResult;

	public String getCheckItemCode() {
		return this.checkItemCode;
	}
	public void setCheckItemCode(String checkItemCode) {
		this.checkItemCode = checkItemCode;
	}

	public Long getCheckItemResult() {
		return this.checkItemResult;
	}
	public void setCheckItemResult(Long checkItemResult) {
		this.checkItemResult = checkItemResult;
	}

}
