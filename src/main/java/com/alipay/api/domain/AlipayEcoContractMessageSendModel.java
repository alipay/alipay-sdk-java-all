package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署平台消息推送
 *
 * @author auto create
 * @since 1.0, 2020-05-25 16:11:21
 */
public class AlipayEcoContractMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 5835116592582961874L;

	/**
	 * 调用批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 证件号
	 */
	@ApiListField("cert_no")
	@ApiField("string")
	private List<String> certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 供应商的appId
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 消息模板ID
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/**
	 * 签署平台的代码
	 */
	@ApiField("sign_platform_code")
	private String signPlatformCode;

	/**
	 * 支付宝账号Id,数组关联多个支付宝账号 （如果未注册支付宝账号 则为空）
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<String> getCertNo() {
		return this.certNo;
	}
	public void setCertNo(List<String> certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getMsgTemplateId() {
		return this.msgTemplateId;
	}
	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}

	public String getSignPlatformCode() {
		return this.signPlatformCode;
	}
	public void setSignPlatformCode(String signPlatformCode) {
		this.signPlatformCode = signPlatformCode;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
