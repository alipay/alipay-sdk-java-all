package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业数据回流
 *
 * @author auto create
 * @since 1.0, 2017-03-02 09:50:59
 */
public class AlipayEcoMedicalcareCommonDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1848164595452882763L;

	/**
	 * 为了区分相同ISV不同应用的编码，数据来源是类目平台
当data_type为CALLBACK时必填
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 业务主体，data_body根据不同的模板ID传入对应的JSON格式
注意：业务data_body与模板teaplate_id对应，具体实例：
http://medicalcare.oss-cn-hangzhou.aliyuncs.com/prod/data/transfer/[template_id].html
	 */
	@ApiField("data_body")
	private String dataBody;

	/**
	 * 业务数据类型
APP	应用类Card
REMIND	提醒类Card
CALLBACK	 数据回流
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 医疗服务平台提供数据模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户ID,可以通过获取会员信息产品 获取支付宝用户ID
当data_type为CALLBACK时必填
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getDataBody() {
		return this.dataBody;
	}
	public void setDataBody(String dataBody) {
		this.dataBody = dataBody;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
