package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GetInspectionDetailDiagnosisInfo;
import com.alipay.api.domain.GetInspectionDetailItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfcheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-26 11:07:43
 */
public class AlipayCommerceMedicalHdfcheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3535768757326824373L;

	/** 
	 * 科室名称
	 */
	@ApiField("apply_department_name")
	private String applyDepartmentName;

	/** 
	 * 申请时间
	 */
	@ApiField("apply_time")
	private String applyTime;

	/** 
	 * 诊断内容
	 */
	@ApiField("diagnosis_info")
	private GetInspectionDetailDiagnosisInfo diagnosisInfo;

	/** 
	 * hdf的履约单号
	 */
	@ApiField("hdf_check_no")
	private String hdfCheckNo;

	/** 
	 * hdf的用户年龄
	 */
	@ApiField("hdf_user_age")
	private String hdfUserAge;

	/** 
	 * hdf的用户号码
	 */
	@ApiField("hdf_user_mb")
	private String hdfUserMb;

	/** 
	 * hdf的用户名
	 */
	@ApiField("hdf_user_name")
	private String hdfUserName;

	/** 
	 * hdf的用户编码
	 */
	@ApiField("hdf_user_no")
	private String hdfUserNo;

	/** 
	 * 用户性别
	 */
	@ApiField("hdf_user_sex")
	private String hdfUserSex;

	/** 
	 * null
	 */
	@ApiListField("item_info_list")
	@ApiField("get_inspection_detail_item_info")
	private List<GetInspectionDetailItemInfo> itemInfoList;

	public void setApplyDepartmentName(String applyDepartmentName) {
		this.applyDepartmentName = applyDepartmentName;
	}
	public String getApplyDepartmentName( ) {
		return this.applyDepartmentName;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getApplyTime( ) {
		return this.applyTime;
	}

	public void setDiagnosisInfo(GetInspectionDetailDiagnosisInfo diagnosisInfo) {
		this.diagnosisInfo = diagnosisInfo;
	}
	public GetInspectionDetailDiagnosisInfo getDiagnosisInfo( ) {
		return this.diagnosisInfo;
	}

	public void setHdfCheckNo(String hdfCheckNo) {
		this.hdfCheckNo = hdfCheckNo;
	}
	public String getHdfCheckNo( ) {
		return this.hdfCheckNo;
	}

	public void setHdfUserAge(String hdfUserAge) {
		this.hdfUserAge = hdfUserAge;
	}
	public String getHdfUserAge( ) {
		return this.hdfUserAge;
	}

	public void setHdfUserMb(String hdfUserMb) {
		this.hdfUserMb = hdfUserMb;
	}
	public String getHdfUserMb( ) {
		return this.hdfUserMb;
	}

	public void setHdfUserName(String hdfUserName) {
		this.hdfUserName = hdfUserName;
	}
	public String getHdfUserName( ) {
		return this.hdfUserName;
	}

	public void setHdfUserNo(String hdfUserNo) {
		this.hdfUserNo = hdfUserNo;
	}
	public String getHdfUserNo( ) {
		return this.hdfUserNo;
	}

	public void setHdfUserSex(String hdfUserSex) {
		this.hdfUserSex = hdfUserSex;
	}
	public String getHdfUserSex( ) {
		return this.hdfUserSex;
	}

	public void setItemInfoList(List<GetInspectionDetailItemInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}
	public List<GetInspectionDetailItemInfo> getItemInfoList( ) {
		return this.itemInfoList;
	}

}
