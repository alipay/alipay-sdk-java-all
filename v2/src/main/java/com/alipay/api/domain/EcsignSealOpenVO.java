package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约印章配置查询列表服务中返回参数模型。
 *
 * @author auto create
 * @since 1.0, 2023-05-16 15:23:26
 */
public class EcsignSealOpenVO extends AlipayObject {

	private static final long serialVersionUID = 4386372527234157553L;

	/**
	 * 企业社会统一信用代码，无需唯一，用户企业信息校验及授权，需要与企业名称对应。
	 */
	@ApiField("enterprise_cert_no")
	private String enterpriseCertNo;

	/**
	 * 企业名称，无需唯一，用于验证统一社会信用代码及授权，需要与企业社会信用代码对应。
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 印章创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 印章更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 印章图片预览链接,唯一值，每一个印章ID对应一个预览链接，由系统生成。
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 印章描述，无需唯一，用于描述印章，用户自行定义。
	 */
	@ApiField("seal_description")
	private String sealDescription;

	/**
	 * 印章ID，如果有则为唯一值，用于印章更新场景，在创建完和更新完均会返回该值。
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 印章名称，无需唯一，用于印章命名，来源是用户自定义。
	 */
	@ApiField("seal_name")
	private String sealName;

	/**
	 * 印章状态，只有NORMAL是代表印章是可用状态。
	 */
	@ApiField("seal_status")
	private String sealStatus;

	/**
	 * 印章类型，无需唯一，用于生成印章图片，枚举值。
	 */
	@ApiField("seal_type")
	private String sealType;

	public String getEnterpriseCertNo() {
		return this.enterpriseCertNo;
	}
	public void setEnterpriseCertNo(String enterpriseCertNo) {
		this.enterpriseCertNo = enterpriseCertNo;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getSealDescription() {
		return this.sealDescription;
	}
	public void setSealDescription(String sealDescription) {
		this.sealDescription = sealDescription;
	}

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

	public String getSealName() {
		return this.sealName;
	}
	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getSealStatus() {
		return this.sealStatus;
	}
	public void setSealStatus(String sealStatus) {
		this.sealStatus = sealStatus;
	}

	public String getSealType() {
		return this.sealType;
	}
	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

}
