package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税号开通产品信息
 *
 * @author auto create
 * @since 1.0, 2020-06-18 22:20:46
 */
public class InvoiceOpenProductDTO extends AlipayObject {

	private static final long serialVersionUID = 5476521484666212176L;

	/**
	 * 税控产品发票类型 可选值：电票：0，纸质普票：1，纸质专票：2
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 税控服务商，由服务商在中台入驻后生成
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 产品类型，产品码由中台定义
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 服务有效周期-结束时间
	 */
	@ApiField("serv_end_time")
	private String servEndTime;

	/**
	 * 服务有效周期-起始时间
	 */
	@ApiField("serv_start_time")
	private String servStartTime;

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getServEndTime() {
		return this.servEndTime;
	}
	public void setServEndTime(String servEndTime) {
		this.servEndTime = servEndTime;
	}

	public String getServStartTime() {
		return this.servStartTime;
	}
	public void setServStartTime(String servStartTime) {
		this.servStartTime = servStartTime;
	}

}
