package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景（如消费/核身）消息上报接口
 *
 * @author auto create
 * @since 1.0, 2019-12-01 19:54:34
 */
public class AlipayCommerceKidsMsgSceneSendModel extends AlipayObject {

	private static final long serialVersionUID = 1899743434784194888L;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * json数据格式，title：标题；child_name：孩子名称；school_name：学校名称；school_stdcode：学校外标；action：行为；link：isv详情链接；memo：辅助信息，比如有疑问请咨询xxxx（isv传），可为空，为空不展示；parent_userid：家长uid；child_userid：孩子uid
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务真实发生时间，如核身时间点，消费支付时间点
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 外部业务唯一编号，重复报错
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务类型，确定数据使用场景。刷脸支付：facepay、核身门禁：entrance、核身考勤：sign
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
