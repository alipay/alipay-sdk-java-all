package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料供给模板信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:57:51
 */
public class AssetSupplyDetail extends AlipayObject {

	private static final long serialVersionUID = 2159369112891929915L;

	/**
	 * 作业模式
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 组包方式
	 */
	@ApiField("assemble_type")
	private String assembleType;

	/**
	 * 物料管控详细信息
	 */
	@ApiListField("management_details")
	@ApiField("asset_management_detail")
	private List<AssetManagementDetail> managementDetails;

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getAssembleType() {
		return this.assembleType;
	}
	public void setAssembleType(String assembleType) {
		this.assembleType = assembleType;
	}

	public List<AssetManagementDetail> getManagementDetails() {
		return this.managementDetails;
	}
	public void setManagementDetails(List<AssetManagementDetail> managementDetails) {
		this.managementDetails = managementDetails;
	}

}
