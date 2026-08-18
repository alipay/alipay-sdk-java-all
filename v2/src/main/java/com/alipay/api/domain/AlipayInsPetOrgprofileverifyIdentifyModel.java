package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险机构档案同宠校验接口
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:12:54
 */
public class AlipayInsPetOrgprofileverifyIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 1785486755746866616L;

	/**
	 * 外部业务单号，用于接口幂等，每次请求需保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 宠物正脸照链接
	 */
	@ApiField("pet_face_url")
	private String petFaceUrl;

	/**
	 * 建档接口返回的宠物档案唯一标识
	 */
	@ApiField("pet_id")
	private String petId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPetFaceUrl() {
		return this.petFaceUrl;
	}
	public void setPetFaceUrl(String petFaceUrl) {
		this.petFaceUrl = petFaceUrl;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}
