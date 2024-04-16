package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品标品修改
 *
 * @author auto create
 * @since 1.0, 2024-03-20 13:58:14
 */
public class AlipayCommerceMedicalMedicineSpuModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3554296712524112898L;

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
