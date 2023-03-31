package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区关系对象
 *
 * @author auto create
 * @since 1.0, 2020-06-22 16:26:29
 */
public class CommunityPartnerRelaData extends AlipayObject {

	private static final long serialVersionUID = 8373782357753548171L;

	/**
	 * 关系对象业务数据
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 关系类型
	 */
	@ApiField("rela_type")
	private String relaType;

	/**
	 * 来源对象id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 目标对象id
	 */
	@ApiField("target_id")
	private String targetId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getRelaType() {
		return this.relaType;
	}
	public void setRelaType(String relaType) {
		this.relaType = relaType;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
