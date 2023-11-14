package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站添加机构信息开放接口
 *
 * @author auto create
 * @since 1.0, 2023-09-15 12:02:06
 */
public class AlipayOverseasOpenIndrbeneficiaryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4281592399145789465L;

	/**
	 * business_partner机构信息
	 */
	@ApiField("business_partner")
	private String businessPartner;

	/**
	 * 机构类型
	 */
	@ApiField("partner_type")
	private String partnerType;

	/**
	 * 附言
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景名称
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 机构状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 可用状态
	 */
	@ApiField("valid_status")
	private String validStatus;

	public String getBusinessPartner() {
		return this.businessPartner;
	}
	public void setBusinessPartner(String businessPartner) {
		this.businessPartner = businessPartner;
	}

	public String getPartnerType() {
		return this.partnerType;
	}
	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getValidStatus() {
		return this.validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

}
