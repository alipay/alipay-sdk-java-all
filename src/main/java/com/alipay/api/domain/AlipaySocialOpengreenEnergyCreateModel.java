package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成绿色能量
 *
 * @author auto create
 * @since 1.0, 2022-02-25 17:25:21
 */
public class AlipaySocialOpengreenEnergyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7739737645223964522L;

	/**
	 * 当前时间毫秒值
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 随机数，每个用户不唯一
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 二级场景类目
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
