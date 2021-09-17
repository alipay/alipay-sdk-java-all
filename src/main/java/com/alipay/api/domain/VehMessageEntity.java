package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主统一消息实体类型
 *
 * @author auto create
 * @since 1.0, 2020-03-06 14:27:51
 */
public class VehMessageEntity extends AlipayObject {

	private static final long serialVersionUID = 1537545588585396367L;

	/**
	 * 证件号码.(certificate_type/certificate_number/certificate_username) 或者uid必须有一个不为空。两个都不为空则以uid为准. 该字段为敏感字段，须做md5处理后传输。示例中值的明文为310101198011110010.
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 证件类型, 01表示身份证.(certificate_type/certificate_number/certificate_username) 或者uid必须有一个不为空。两个都不为空则以uid为准.
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 证件用户名字.(certificate_type/certificate_number/certificate_username) 或者uid必须有一个不为空。两个都不为空则以uid为准.
	 */
	@ApiField("certificate_username")
	private String certificateUsername;

	/**
	 * 消息参数信息，json格式字符串. 该字段与msg_type对应，不同的sc需要传不同的参数信息，详情参考接口补充说明.
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息提示红点标记
	 */
	@ApiField("mark")
	private String mark;

	/**
	 * 消息模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/**
	 * identity字段：值为不大于64位的保证唯一的字符串；该字段用于保证消息唯一性，防止消息重复推送，相当于业务流水号，由接入方自行生成
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 消息跳转url。
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * (certificate_type/certificate_number/用户名字) 或者uid必须有一个不为空。两个都不为空则以uid为准
	 */
	@ApiField("uid")
	private String uid;

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateUsername() {
		return this.certificateUsername;
	}
	public void setCertificateUsername(String certificateUsername) {
		this.certificateUsername = certificateUsername;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMark() {
		return this.mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMsgTemplateId() {
		return this.msgTemplateId;
	}
	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
