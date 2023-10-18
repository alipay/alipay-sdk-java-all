package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 种树详细信息
 *
 * @author auto create
 * @since 1.0, 2020-09-23 16:02:20
 */
public class TreeDetailData extends AlipayObject {

	private static final long serialVersionUID = 1392176957888298517L;

	/**
	 * 证书申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 兑换树种获得的证书id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 是否合种。true：是合种，false：不是合种
	 */
	@ApiField("cooperation")
	private Boolean cooperation;

	/**
	 * 树种别名
	 */
	@ApiField("tree_alias")
	private String treeAlias;

	/**
	 * 树种类型，保护地【RESERVE】还是树苗【TREE】
	 */
	@ApiField("tree_type")
	private String treeType;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public Boolean getCooperation() {
		return this.cooperation;
	}
	public void setCooperation(Boolean cooperation) {
		this.cooperation = cooperation;
	}

	public String getTreeAlias() {
		return this.treeAlias;
	}
	public void setTreeAlias(String treeAlias) {
		this.treeAlias = treeAlias;
	}

	public String getTreeType() {
		return this.treeType;
	}
	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}

}
