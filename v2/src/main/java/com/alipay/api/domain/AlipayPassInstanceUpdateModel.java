package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2023-03-20 16:39:20
 */
public class AlipayPassInstanceUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3452733994198895817L;

	/**
	 * 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 支付宝用户ID，新接入商户必填，历史已接入商户请尽快补传
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户指定卡券唯一值，卡券JSON模板中fileInfo->serialNumber字段对应的值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 券状态，支持更新为USED、CLOSED两种状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

	/**
	 * 支付宝用户ID，新接入商户必填，历史已接入商户请尽快补传
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 历史遗留，已废弃。当状态变更为USED时，建议传，该值正常为模板中核销区域（Operation）对应的message值。
	 */
	@ApiField("verify_code")
	private String verifyCode;

	/**
	 * 历史遗留，已废弃。核销方式，该值正常为模板中核销区域（Operation）对应的format值。verify_code和verify_type需同时传入。
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
