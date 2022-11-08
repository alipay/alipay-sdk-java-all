package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR端云一体化识别初始化
 *
 * @author auto create
 * @since 1.0, 2022-07-22 17:47:29
 */
public class DatadigitalFincloudGeneralsaasOcrMobileInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7673992863232923126L;

	/**
	 * bizCode，代表当前使用的能力类型。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 客户业务单据号。请保持唯一。
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}
