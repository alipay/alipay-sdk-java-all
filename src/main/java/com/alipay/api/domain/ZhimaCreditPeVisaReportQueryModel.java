package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用签证报告获取接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 10:14:54
 */
public class ZhimaCreditPeVisaReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2522719179125824853L;

	/**
	 * 接口是否要返回报告文件
	 */
	@ApiField("include_file")
	private Boolean includeFile;

	/**
	 * 申请场景，报告申请国家
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getIncludeFile() {
		return this.includeFile;
	}
	public void setIncludeFile(Boolean includeFile) {
		this.includeFile = includeFile;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
