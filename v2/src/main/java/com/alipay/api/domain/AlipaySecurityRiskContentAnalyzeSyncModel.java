package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险同步识别接口服务
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class AlipaySecurityRiskContentAnalyzeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3161321487347147661L;

	/**
	 * 来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 调用者信息
	 */
	@ApiField("invoker")
	private SaaSInvoker invoker;

	/**
	 * 唯一请求ID
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/**
	 * 内容安全检测业务同步请求体
	 */
	@ApiField("request")
	private InfoSecAnalyzeSyncContent request;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public SaaSInvoker getInvoker() {
		return this.invoker;
	}
	public void setInvoker(SaaSInvoker invoker) {
		this.invoker = invoker;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

	public InfoSecAnalyzeSyncContent getRequest() {
		return this.request;
	}
	public void setRequest(InfoSecAnalyzeSyncContent request) {
		this.request = request;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
