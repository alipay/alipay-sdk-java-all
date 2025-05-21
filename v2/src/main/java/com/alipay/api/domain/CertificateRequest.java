package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资质证明
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:32:41
 */
public class CertificateRequest extends AlipayObject {

	private static final long serialVersionUID = 8883129672592917498L;

	/**
	 * 身份认证
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 频道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 提交的图片内容
	 */
	@ApiListField("materials")
	@ApiField("string")
	private List<String> materials;

	/**
	 * 常量值
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 来源标识，目前支持好大夫
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 认证值
	 */
	@ApiField("value")
	private String value;

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getMaterials() {
		return this.materials;
	}
	public void setMaterials(List<String> materials) {
		this.materials = materials;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
