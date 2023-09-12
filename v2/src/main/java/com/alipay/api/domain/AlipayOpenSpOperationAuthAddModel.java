package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加服务商代运营记录
 *
 * @author auto create
 * @since 1.0, 2020-12-30 10:36:08
 */
public class AlipayOpenSpOperationAuthAddModel extends AlipayObject {

	private static final long serialVersionUID = 2422625546751955244L;

	/**
	 * 授权产品码，零售通填写KX_ECOLOGY_SOLUTION
	 */
	@ApiField("auth_product_code")
	private String authProductCode;

	/**
	 * 直连商户PID
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 外部操作流水，ISV自定义。每次操作需要确保唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAuthProductCode() {
		return this.authProductCode;
	}
	public void setAuthProductCode(String authProductCode) {
		this.authProductCode = authProductCode;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
