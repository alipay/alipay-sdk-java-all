package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N核身用户加密数据查询
 *
 * @author auto create
 * @since 1.0, 2026-03-23 10:12:45
 */
public class AlipayOfflineProviderNpassporterPrivacyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6651522951119498827L;

	/**
	 * 支付宝uid
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("out_encrypt_cert_no_list")
	@ApiField("string")
	private List<String> outEncryptCertNoList;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 方案类型
	 */
	@ApiField("solution_type")
	private String solutionType;

	/**
	 * 接入方传入具体活动场次唯一ID即可，此字段作为密算证件号的关键信息，即同一场次下的人群传统一ID即可，若不填写默认以“projectID”字段作为密算计算信息。接入方调用支付宝传入的场次ID，需跟自己按密算规则传入的ID保持一致，否则会出现两侧密算后信息无法匹配。
	 */
	@ApiField("sub_project_id")
	private String subProjectId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOutEncryptCertNoList() {
		return this.outEncryptCertNoList;
	}
	public void setOutEncryptCertNoList(List<String> outEncryptCertNoList) {
		this.outEncryptCertNoList = outEncryptCertNoList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSolutionType() {
		return this.solutionType;
	}
	public void setSolutionType(String solutionType) {
		this.solutionType = solutionType;
	}

	public String getSubProjectId() {
		return this.subProjectId;
	}
	public void setSubProjectId(String subProjectId) {
		this.subProjectId = subProjectId;
	}

}
