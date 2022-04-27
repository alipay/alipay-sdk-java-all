package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专享价成员信息查询接口
 *
 * @author auto create
 * @since 1.0, 2022-04-11 17:11:15
 */
public class AlipayFundIdentitypayMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3483173889314437999L;

	/**
	 * 查询签约信息场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部成员Id（全局唯一）
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 外部组织Id（全局唯一）
	 */
	@ApiField("out_org_id")
	private String outOrgId;

	/**
	 * 查询签约信息产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getOutOrgId() {
		return this.outOrgId;
	}
	public void setOutOrgId(String outOrgId) {
		this.outOrgId = outOrgId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
