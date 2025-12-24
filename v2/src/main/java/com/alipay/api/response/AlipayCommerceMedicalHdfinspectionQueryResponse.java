package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfinspection.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 11:17:42
 */
public class AlipayCommerceMedicalHdfinspectionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7769364175868755577L;

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
	 * 履约单下的标准项目
	 */
	@ApiField("inspection_item_sku_ids")
	private String inspectionItemSkuIds;

	/** 
	 * 履约单下的组合项目
	 */
	@ApiField("inspection_package_sku_ids")
	private String inspectionPackageSkuIds;

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

	public void setInspectionItemSkuIds(String inspectionItemSkuIds) {
		this.inspectionItemSkuIds = inspectionItemSkuIds;
	}
	public String getInspectionItemSkuIds( ) {
		return this.inspectionItemSkuIds;
	}

	public void setInspectionPackageSkuIds(String inspectionPackageSkuIds) {
		this.inspectionPackageSkuIds = inspectionPackageSkuIds;
	}
	public String getInspectionPackageSkuIds( ) {
		return this.inspectionPackageSkuIds;
	}

}
