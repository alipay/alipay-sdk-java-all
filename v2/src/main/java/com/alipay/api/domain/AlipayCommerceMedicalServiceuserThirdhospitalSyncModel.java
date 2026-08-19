package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步三方互医数据
 *
 * @author auto create
 * @since 1.0, 2026-07-30 20:12:41
 */
public class AlipayCommerceMedicalServiceuserThirdhospitalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6733765812569624679L;

	/**
	 * 头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 个人简介
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扁鹊侧医生ID
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 医院ID
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 调用方来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 职称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocId() {
		return this.docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
