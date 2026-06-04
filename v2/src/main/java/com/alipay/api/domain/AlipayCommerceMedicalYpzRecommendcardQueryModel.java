package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云陪诊统一查询推荐卡片接口
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:42:49
 */
public class AlipayCommerceMedicalYpzRecommendcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1116284448275276317L;

	/**
	 * 就医数据唯一ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 卡片编码
	 */
	@ApiField("card_code")
	private String cardCode;

	/**
	 * 渠道信息
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 投放场景
	 */
	@ApiField("delivery_scene")
	private String deliveryScene;

	/**
	 * 科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 平台openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构ID（医院）
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 机构名称（医院）
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 投放渠道
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 是否本人就医
	 */
	@ApiField("self")
	private Boolean self;

	/**
	 * 卡片状态编码
	 */
	@ApiField("status_card_code")
	private String statusCardCode;

	/**
	 * 业务类型
	 */
	@ApiField("table_type")
	private String tableType;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	/**
	 * 用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCardCode() {
		return this.cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getDeliveryScene() {
		return this.deliveryScene;
	}
	public void setDeliveryScene(String deliveryScene) {
		this.deliveryScene = deliveryScene;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Boolean getSelf() {
		return this.self;
	}
	public void setSelf(Boolean self) {
		this.self = self;
	}

	public String getStatusCardCode() {
		return this.statusCardCode;
	}
	public void setStatusCardCode(String statusCardCode) {
		this.statusCardCode = statusCardCode;
	}

	public String getTableType() {
		return this.tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
