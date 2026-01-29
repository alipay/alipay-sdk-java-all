package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资格查询
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:22
 */
public class AlipayMarketingQualificationConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8273581354675447452L;

	/**
	 * 业务上下文信息
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("qual_consult_infos")
	@ApiField("qualification_consult_info")
	private List<QualificationConsultInfo> qualConsultInfos;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<QualificationConsultInfo> getQualConsultInfos() {
		return this.qualConsultInfos;
	}
	public void setQualConsultInfos(List<QualificationConsultInfo> qualConsultInfos) {
		this.qualConsultInfos = qualConsultInfos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
