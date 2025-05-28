package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 制卡任务详情
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:22:30
 */
public class CardApplyTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 2138359773581394291L;

	/**
	 * 卡操作的类型
枚举值：
● NEW：制新卡
● REPLACE：覆盖卡权限
● MODIFY：修改卡权限
● DELETE：删卡
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * null
	 */
	@ApiListField("auth_devices")
	@ApiField("gate_device_info")
	private List<GateDeviceInfo> authDevices;

	/**
	 * 卡号，该制卡任务对应的卡号。hex string格式，两位字母标识一个字节。大小写不敏感，长度视卡协议类型而定，可能是8（4字节）、14（7字节）等、16（8字节）。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 制卡模板code，卡模板为客户入驻后在平台配置的内容，包括对应小区、卡协议、密钥等
	 */
	@ApiField("card_template_code")
	private String cardTemplateCode;

	/**
	 * 日期格式
	 */
	@ApiField("complete_time")
	private Date completeTime;

	/**
	 * 日期格式
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * null
	 */
	@ApiListField("forbid_devices")
	@ApiField("gate_device_info")
	private List<GateDeviceInfo> forbidDevices;

	/**
	 * 用于标记支付宝用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部客户保证唯一性，平台以此字段作幂等性处理
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 制卡任务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 制卡请求受理后的制卡任务唯一ID，与out_biz_id一一对应
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 平台接收来自客户系统的请求，给到发卡设备消费
	 */
	@ApiField("transparent_data")
	private String transparentData;

	/**
	 * 支付宝用户UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public List<GateDeviceInfo> getAuthDevices() {
		return this.authDevices;
	}
	public void setAuthDevices(List<GateDeviceInfo> authDevices) {
		this.authDevices = authDevices;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardTemplateCode() {
		return this.cardTemplateCode;
	}
	public void setCardTemplateCode(String cardTemplateCode) {
		this.cardTemplateCode = cardTemplateCode;
	}

	public Date getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<GateDeviceInfo> getForbidDevices() {
		return this.forbidDevices;
	}
	public void setForbidDevices(List<GateDeviceInfo> forbidDevices) {
		this.forbidDevices = forbidDevices;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTransparentData() {
		return this.transparentData;
	}
	public void setTransparentData(String transparentData) {
		this.transparentData = transparentData;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
