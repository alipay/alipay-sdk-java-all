package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加档案身份关系
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:59:02
 */
public class AlipayUserAntarchiveIdentityrelationAddModel extends AlipayObject {

	private static final long serialVersionUID = 5251767348547139158L;

	/**
	 * 扩展信息,Map格式JSON序列化表示
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 关系业务类型
	 */
	@ApiField("rel_biz_type")
	private String relBizType;

	/**
	 * 关系类型
	 */
	@ApiField("rel_type")
	private String relType;

	/**
	 * 源身份信息
	 */
	@ApiField("source_identity_certificate")
	private AntArchiveIdentityCertificate sourceIdentityCertificate;

	/**
	 * 目标身份信息
	 */
	@ApiField("target_identity_certificate")
	private AntArchiveIdentityCertificate targetIdentityCertificate;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRelBizType() {
		return this.relBizType;
	}
	public void setRelBizType(String relBizType) {
		this.relBizType = relBizType;
	}

	public String getRelType() {
		return this.relType;
	}
	public void setRelType(String relType) {
		this.relType = relType;
	}

	public AntArchiveIdentityCertificate getSourceIdentityCertificate() {
		return this.sourceIdentityCertificate;
	}
	public void setSourceIdentityCertificate(AntArchiveIdentityCertificate sourceIdentityCertificate) {
		this.sourceIdentityCertificate = sourceIdentityCertificate;
	}

	public AntArchiveIdentityCertificate getTargetIdentityCertificate() {
		return this.targetIdentityCertificate;
	}
	public void setTargetIdentityCertificate(AntArchiveIdentityCertificate targetIdentityCertificate) {
		this.targetIdentityCertificate = targetIdentityCertificate;
	}

}
