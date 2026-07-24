package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫医带患小B模式获取报到码短链
 *
 * @author auto create
 * @since 1.0, 2026-03-12 17:21:36
 */
public class AlipayCommerceMedicalPromotionlinkGetModel extends AlipayObject {

	private static final long serialVersionUID = 1774372457548628362L;

	/**
	 * 好大夫医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 小B用户ID
	 */
	@ApiField("promotion_u_id")
	private String promotionUId;

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPromotionUId() {
		return this.promotionUId;
	}
	public void setPromotionUId(String promotionUId) {
		this.promotionUId = promotionUId;
	}

}
