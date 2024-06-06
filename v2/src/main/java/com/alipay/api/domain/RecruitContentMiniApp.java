package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名提交的小程序
 *
 * @author auto create
 * @since 1.0, 2023-06-06 11:09:22
 */
public class RecruitContentMiniApp extends AlipayObject {

	private static final long serialVersionUID = 4688377376212988652L;

	/**
	 * 小程序配置信息列表。
	 */
	@ApiListField("content_configs")
	@ApiField("recruit_content_config")
	private List<RecruitContentConfig> contentConfigs;

	/**
	 * 小程序ID。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public List<RecruitContentConfig> getContentConfigs() {
		return this.contentConfigs;
	}
	public void setContentConfigs(List<RecruitContentConfig> contentConfigs) {
		this.contentConfigs = contentConfigs;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
