package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR端云一体化识别初始化
 *
 * @author auto create
 * @since 1.0, 2023-05-17 19:15:16
 */
public class DatadigitalFincloudGeneralsaasOcrMobileInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4676346152579725512L;

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
