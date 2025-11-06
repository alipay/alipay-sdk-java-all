package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询视频录像
 *
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:02
 */
public class AlipayCommerceMedicalHdfrtcVideorecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8332323683379814191L;

	/**
	 * 角色类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 好大夫侧获取外部来源ID，如执行单ID
	 */
	@ApiField("source_id")
	private Long sourceId;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
