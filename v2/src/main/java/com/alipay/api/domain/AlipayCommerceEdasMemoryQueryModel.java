package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态用户记忆查询服务
 *
 * @author auto create
 * @since 1.0, 2026-03-05 15:02:43
 */
public class AlipayCommerceEdasMemoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6785183742235388861L;

	/**
	 * 数据场景code，该字段为数据场景编码（Code），对应数据平台的场景标识。
	 */
	@ApiField("data_scene_code")
	private String dataSceneCode;

	/**
	 * 行业项目ID，该字段为源自数据服务平台商户绑定关系的智能体应用ID，通常映射为智能体应用ID。
	 */
	@ApiField("industry_id")
	private String industryId;

	/**
	 * 租户id，该字段为关联数据服务平台鉴权体系的租户唯一标识。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 用户标识id，该字段为智能体应用用户的唯一身份标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户标识id，该字段为智能体应用用户的唯一身份标识
	 */
	@ApiField("user_id")
	private String userId;

	public String getDataSceneCode() {
		return this.dataSceneCode;
	}
	public void setDataSceneCode(String dataSceneCode) {
		this.dataSceneCode = dataSceneCode;
	}

	public String getIndustryId() {
		return this.industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
