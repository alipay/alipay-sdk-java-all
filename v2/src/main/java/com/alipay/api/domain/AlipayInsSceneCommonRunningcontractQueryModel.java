package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定产品的用户在途合约
 *
 * @author auto create
 * @since 1.0, 2025-03-04 14:14:28
 */
public class AlipayInsSceneCommonRunningcontractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7299182556668568747L;

	/**
	 * 合作商ID，由蚂蚁保统一分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 由蚂蚁保提供，合作的产品的唯一标识
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 如果是订购人纬度，该值为订购用户的ID；如果是商品纬度，该值为订购商品的ID
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 订购主体类型，蚂蚁保合作时确定
	 */
	@ApiField("subject_type")
	private String subjectType;

	/**
	 * 订购用户的ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
