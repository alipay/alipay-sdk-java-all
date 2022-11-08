package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一脸通行服务配置申请
 *
 * @author auto create
 * @since 1.0, 2022-10-14 16:03:48
 */
public class AlipayCommerceEducateSceneConfigCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8777763919662232426L;

	/**
	 * 经营场景，若传签约收款商户pid，则经营场景必传
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 签约收款商户的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校外标（内外标不可同时为空，都传入时以内标为准）
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 签约小程序appid
	 */
	@ApiField("sign_app_id")
	private String signAppId;

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public String getSignAppId() {
		return this.signAppId;
	}
	public void setSignAppId(String signAppId) {
		this.signAppId = signAppId;
	}

}
