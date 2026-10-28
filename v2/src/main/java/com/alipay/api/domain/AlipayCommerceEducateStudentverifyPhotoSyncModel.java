package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生认证照片同步
 *
 * @author auto create
 * @since 1.0, 2026-10-08 10:52:56
 */
public class AlipayCommerceEducateStudentverifyPhotoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3889246385629774554L;

	/**
	 * 宿主小程序 ID
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 学生 ID（省码 2 位 + 全省统一学号）
	 */
	@ApiField("out_student_id")
	private String outStudentId;

	/**
	 * 注册底片地址AFTS _URL
	 */
	@ApiField("photo_url")
	private String photoUrl;

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getOutStudentId() {
		return this.outStudentId;
	}
	public void setOutStudentId(String outStudentId) {
		this.outStudentId = outStudentId;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
