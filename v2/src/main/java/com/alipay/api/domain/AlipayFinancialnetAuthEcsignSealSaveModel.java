package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约印章配置保存印章服务
 *
 * @author auto create
 * @since 1.0, 2023-05-19 09:33:50
 */
public class AlipayFinancialnetAuthEcsignSealSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5654812478193322976L;

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

	public String getSealType() {
		return this.sealType;
	}
	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

}
