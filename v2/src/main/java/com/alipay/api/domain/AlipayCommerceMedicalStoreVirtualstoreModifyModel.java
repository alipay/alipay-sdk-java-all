package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改虚拟门店
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:32:54
 */
public class AlipayCommerceMedicalStoreVirtualstoreModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1136777826498714558L;

	/**
	 * 好大夫主医院ID
	 */
	@ApiField("hdf_primary_hospital_id")
	private String hdfPrimaryHospitalId;

	/**
	 * 好大夫医生doctorId
	 */
	@ApiField("hdf_space_code")
	private String hdfSpaceCode;

	/**
	 * 团队领衔spaceId
	 */
	@ApiField("hdf_space_leader_code")
	private String hdfSpaceLeaderCode;

	/**
	 * 好大夫医生用户名
	 */
	@ApiField("hdf_space_user_name")
	private String hdfSpaceUserName;

	/**
	 * 好大夫主体编码
	 */
	@ApiField("hdf_subject_code")
	private String hdfSubjectCode;

	/**
	 * 好大夫主体名称
	 */
	@ApiField("hdf_subject_name")
	private String hdfSubjectName;

	/**
	 * 好大夫主体类型
	 */
	@ApiField("hdf_subject_type")
	private String hdfSubjectType;

	/**
	 * 门店状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private Long storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getHdfPrimaryHospitalId() {
		return this.hdfPrimaryHospitalId;
	}
	public void setHdfPrimaryHospitalId(String hdfPrimaryHospitalId) {
		this.hdfPrimaryHospitalId = hdfPrimaryHospitalId;
	}

	public String getHdfSpaceCode() {
		return this.hdfSpaceCode;
	}
	public void setHdfSpaceCode(String hdfSpaceCode) {
		this.hdfSpaceCode = hdfSpaceCode;
	}

	public String getHdfSpaceLeaderCode() {
		return this.hdfSpaceLeaderCode;
	}
	public void setHdfSpaceLeaderCode(String hdfSpaceLeaderCode) {
		this.hdfSpaceLeaderCode = hdfSpaceLeaderCode;
	}

	public String getHdfSpaceUserName() {
		return this.hdfSpaceUserName;
	}
	public void setHdfSpaceUserName(String hdfSpaceUserName) {
		this.hdfSpaceUserName = hdfSpaceUserName;
	}

	public String getHdfSubjectCode() {
		return this.hdfSubjectCode;
	}
	public void setHdfSubjectCode(String hdfSubjectCode) {
		this.hdfSubjectCode = hdfSubjectCode;
	}

	public String getHdfSubjectName() {
		return this.hdfSubjectName;
	}
	public void setHdfSubjectName(String hdfSubjectName) {
		this.hdfSubjectName = hdfSubjectName;
	}

	public String getHdfSubjectType() {
		return this.hdfSubjectType;
	}
	public void setHdfSubjectType(String hdfSubjectType) {
		this.hdfSubjectType = hdfSubjectType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
