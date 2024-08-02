package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸入库 期望机构ID 和入库时间
 *
 * @author auto create
 * @since 1.0, 2021-03-02 17:31:50
 */
public class InstitutionInfo extends AlipayObject {

	private static final long serialVersionUID = 2248173899938432267L;

	/**
	 * 期望入库时间 不传则立即入库
	 */
	@ApiField("face_in_time")
	private String faceInTime;

	/**
	 * 机构ID
	 */
	@ApiField("id")
	private String id;

	public String getFaceInTime() {
		return this.faceInTime;
	}
	public void setFaceInTime(String faceInTime) {
		this.faceInTime = faceInTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
