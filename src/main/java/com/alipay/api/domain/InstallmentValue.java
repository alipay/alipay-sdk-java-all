package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分段数值，用于存储分期费用和分段还款的分段值
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:39
 */
public class InstallmentValue extends AlipayObject {

	private static final long serialVersionUID = 7125139171744424281L;

	/**
	 * 分段值
	 */
	@ApiListField("installment_values")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> installmentValues;

	public List<InstallmentMetaInfo> getInstallmentValues() {
		return this.installmentValues;
	}
	public void setInstallmentValues(List<InstallmentMetaInfo> installmentValues) {
		this.installmentValues = installmentValues;
	}

}
