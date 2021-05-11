package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸关闭支付申请
 *
 * @author auto create
 * @since 1.0, 2020-11-27 16:21:07
 */
public class AlipayCommerceEducateFacepayCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4627829646761778994L;

	/**
	 * 采集人脸学生uid
	 */
	@ApiField("face_uid")
	private String faceUid;

	/**
	 * 场景码:
K12
COLLEGE
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 学生所在学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	public String getFaceUid() {
		return this.faceUid;
	}
	public void setFaceUid(String faceUid) {
		this.faceUid = faceUid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

}
