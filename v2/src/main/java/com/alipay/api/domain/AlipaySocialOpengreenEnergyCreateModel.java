package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成绿色能量
 *
 * @author auto create
 * @since 1.0, 2023-06-05 10:18:16
 */
public class AlipaySocialOpengreenEnergyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1411836743688841289L;

	/**
	 * 用户进行绿色行为的时间，毫秒值，如果不传，默认为调用接口的时间
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 随机业务值，业务唯一单号，用户每一次绿色行为的唯一标识，幂等使用，最好32位，最长不能超过64位
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展字符串，用于承接业务方的一些特殊字段，也用于承接一些特殊绿色场景所需传递的特殊字符串，比如缴费场景需要传入户号信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 二级场景类目， 用于描述用户的绿色行为以及对应的业务值
	 */
	@ApiField("green_actions")
	private String greenActions;

	/**
	 * 商户在支付宝申请的商户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 请求场景码，业务方定义
	 */
	@ApiField("request_scene_code")
	private String requestSceneCode;

	/**
	 * 固定值，固定写openapi
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 系统来源
	 */
	@ApiField("source")
	private String source;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGreenActions() {
		return this.greenActions;
	}
	public void setGreenActions(String greenActions) {
		this.greenActions = greenActions;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRequestSceneCode() {
		return this.requestSceneCode;
	}
	public void setRequestSceneCode(String requestSceneCode) {
		this.requestSceneCode = requestSceneCode;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
