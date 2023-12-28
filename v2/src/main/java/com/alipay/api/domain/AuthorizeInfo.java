package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交品牌认证时商户的授权信息
 *
 * @author auto create
 * @since 1.0, 2020-10-21 11:44:15
 */
public class AuthorizeInfo extends AlipayObject {

	private static final long serialVersionUID = 3491558993653812371L;

	/**
	 * 授权方身份证明(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片,可以上传多个授权方身份证明)
	 */
	@ApiListField("auth_ids")
	@ApiField("string")
	private List<String> authIds;

	/**
	 * 授权有效资质(当前只支持图片类型，请调用alipay.open.mini.miniapp.brand.upload接口上传图片，可以上传多个授权有效资质)
	 */
	@ApiListField("auth_materials")
	@ApiField("string")
	private List<String> authMaterials;

	/**
	 * 被授权人名称
	 */
	@ApiField("auth_name")
	private String authName;

	/**
	 * 授权有效期(结束日期)
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 授权有效期(开始日期)
	 */
	@ApiField("start_date")
	private Date startDate;

	public List<String> getAuthIds() {
		return this.authIds;
	}
	public void setAuthIds(List<String> authIds) {
		this.authIds = authIds;
	}

	public List<String> getAuthMaterials() {
		return this.authMaterials;
	}
	public void setAuthMaterials(List<String> authMaterials) {
		this.authMaterials = authMaterials;
	}

	public String getAuthName() {
		return this.authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
