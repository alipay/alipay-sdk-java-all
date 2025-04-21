package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 实时信息变更同步
 *
 * @author auto create
 * @since 1.0, 2025-03-26 14:26:27
 */
public class AlipayCommerceMedicalIndustrydataUserdoctorrelationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1293273968986245384L;

	/**
	 * 用户信息同步--USER
医生信息同步--
DOCTOR
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * user	
AUTH 授权后 全量同步备选信息
CANCEL 取消授权
ADDITION 增量同步备选信息
doctor	
DOCTOR_INTRODUCTION 医生介绍信息 带团队信息 更新
PATIENT_EVALUATION	患者评价信息更新
DOCTOR_VISIT 医生出诊信息更新
DOCTOR_ARTICLE	医生科普信息更新
MEDICAL_RECORD 病程记录信息更新
DELETE_DOCTOR	医生下架 需要删除该医生下的被备选信息
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 医生id，biz_type为doctor时必传，元素最多50个
	 */
	@ApiListField("doctor_id_list")
	@ApiField("string")
	private List<String> doctorIdList;

	/**
	 * 用户id，biz_type为USER时必传，元素最多50个
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	/**
	 * 用户id，biz_type为USER时必传，元素最多50个
	 */
	@ApiListField("user_id_list_open_ids")
	@ApiField("string")
	private List<String> userIdListOpenIds;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<String> getDoctorIdList() {
		return this.doctorIdList;
	}
	public void setDoctorIdList(List<String> doctorIdList) {
		this.doctorIdList = doctorIdList;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

	public List<String> getUserIdListOpenIds() {
		return this.userIdListOpenIds;
	}
	public void setUserIdListOpenIds(List<String> userIdListOpenIds) {
		this.userIdListOpenIds = userIdListOpenIds;
	}

}
