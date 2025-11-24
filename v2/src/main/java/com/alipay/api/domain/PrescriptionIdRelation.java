package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝内部处方编号与外部处方编号映射关系，一个支付宝内部处方编号对应一个外部处方编号
 *
 * @author auto create
 * @since 1.0, 2025-04-10 16:09:49
 */
public class PrescriptionIdRelation extends AlipayObject {

	private static final long serialVersionUID = 5484173551223234267L;

	/**
	 * 外部处方单编号
	 */
	@ApiField("prescription_code")
	private String prescriptionCode;

	/**
	 * 支付宝内部存储处方id
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	public String getPrescriptionCode() {
		return this.prescriptionCode;
	}
	public void setPrescriptionCode(String prescriptionCode) {
		this.prescriptionCode = prescriptionCode;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

}
