package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询机构缴费信息
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:07:51
 */
public class AlipayOverseasTransferInstitutionpaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8887618317936899457L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_scene_type")
	private String bizSceneType;

	/**
	 * 搜索关键字(学校名/机构ID)
	 */
	@ApiField("institution_keyword")
	private String institutionKeyword;

	/**
	 * 收款机构所在国家，2位编码
	 */
	@ApiField("institution_region")
	private String institutionRegion;

	/**
	 * 透传字段，json map格式
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public String getBizSceneType() {
		return this.bizSceneType;
	}
	public void setBizSceneType(String bizSceneType) {
		this.bizSceneType = bizSceneType;
	}

	public String getInstitutionKeyword() {
		return this.institutionKeyword;
	}
	public void setInstitutionKeyword(String institutionKeyword) {
		this.institutionKeyword = institutionKeyword;
	}

	public String getInstitutionRegion() {
		return this.institutionRegion;
	}
	public void setInstitutionRegion(String institutionRegion) {
		this.institutionRegion = institutionRegion;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

}
