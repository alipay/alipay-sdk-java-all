package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户入驻流程状态查询
 *
 * @author auto create
 * @since 1.0, 2019-11-18 17:32:41
 */
public class AlipayEbppInvoiceMerchantEnterstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1269227515695389737L;

	/**
	 * 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 工单流水号（如果不填则默认查询最近一条工单）
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 商户门店入驻的产品码,STANDARD_INVOICE:扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销，PAYMENT_OPEN:支付即开票，PAY_FEE_OPEN:缴费后开票。
	 */
	@ApiField("product_code")
	private String productCode;

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
