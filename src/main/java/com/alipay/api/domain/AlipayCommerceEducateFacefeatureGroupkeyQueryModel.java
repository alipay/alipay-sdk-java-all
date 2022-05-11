package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询人脸库key接口
 *
 * @author auto create
 * @since 1.0, 2022-04-27 22:33:36
 */
public class AlipayCommerceEducateFacefeatureGroupkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7421842245583173496L;

	/**
	 * 人脸特征场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 服务商英文简称（SCHOOL_PAYMENT场景不需要提供）
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 国家统一分配的学校社会信用代码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

}
