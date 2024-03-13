package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品标品修改
 *
 * @author auto create
 * @since 1.0, 2024-02-29 14:05:49
 */
public class AlipayCommerceMedicalMedicineSpuModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5115647698143548569L;

	/**
	 * 药品标品信息
	 */
	@ApiField("spu")
	private MedicineSpu spu;

	public MedicineSpu getSpu() {
		return this.spu;
	}
	public void setSpu(MedicineSpu spu) {
		this.spu = spu;
	}

}
