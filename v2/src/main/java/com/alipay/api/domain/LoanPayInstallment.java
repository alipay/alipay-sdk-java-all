package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期方案
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:25:04
 */
public class LoanPayInstallment extends AlipayObject {

	private static final long serialVersionUID = 5511334854848292215L;

	/**
	 * 摘要要素，为JSON大字段
	 */
	@ApiField("base_element")
	private String baseElement;

	/**
	 * 分期要素详情，为JSON大字段
	 */
	@ApiField("details_element")
	private String detailsElement;

	/**
	 * 扩展要素，为JSONArray大字段
	 */
	@ApiField("extends_element")
	private String extendsElement;

	/**
	 * 分期id
	 */
	@ApiField("installment_id")
	private String installmentId;

	public String getBaseElement() {
		return this.baseElement;
	}
	public void setBaseElement(String baseElement) {
		this.baseElement = baseElement;
	}

	public String getDetailsElement() {
		return this.detailsElement;
	}
	public void setDetailsElement(String detailsElement) {
		this.detailsElement = detailsElement;
	}

	public String getExtendsElement() {
		return this.extendsElement;
	}
	public void setExtendsElement(String extendsElement) {
		this.extendsElement = extendsElement;
	}

	public String getInstallmentId() {
		return this.installmentId;
	}
	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}

}
