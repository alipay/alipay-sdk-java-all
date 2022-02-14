package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景（如消费/核身）消息上报接口
 *
 * @author auto create
 * @since 1.0, 2021-07-23 15:19:34
 */
public class AlipayCommerceKidsMsgSceneSendModel extends AlipayObject {

	private static final long serialVersionUID = 4852974781445742327L;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * operator_name：刷脸行为人，如学生或教职工，必填；school_name：学校名称，必填；school_stdcode：学校外标，必填；link：如alipays://platformapi/startapp?appId=xxxx，必填；memo：备注信息，必填；target_userid：消息接入人uid，必填；operator_userid：刷脸行为人UID，必填；
contact_info：联系信息，必填；
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务真实发生时间，如核身时间点，消费支付时间点。格式要求yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 外部业务唯一编号，重复报错
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务类型，确定数据使用场景。就餐提醒：school_facepay、离校提醒：school_entrance_out、入校提醒：school_entrance_in，考勤提醒：school_sign
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板版本号，默认为1.0
	 */
	@ApiField("template_code_version")
	private String templateCodeVersion;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateCodeVersion() {
		return this.templateCodeVersion;
	}
	public void setTemplateCodeVersion(String templateCodeVersion) {
		this.templateCodeVersion = templateCodeVersion;
	}

}
