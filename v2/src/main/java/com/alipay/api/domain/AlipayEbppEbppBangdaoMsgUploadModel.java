package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邦道缴费账单提醒推送
 *
 * @author auto create
 * @since 1.0, 2026-09-28 10:42:19
 */
public class AlipayEbppEbppBangdaoMsgUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1571515312833972157L;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 消息数据内容，JSON格式字符串
	 */
	@ApiField("msg_notify_content")
	private String msgNotifyContent;

	/**
	 * 消息通知类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 账单消息子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getMsgNotifyContent() {
		return this.msgNotifyContent;
	}
	public void setMsgNotifyContent(String msgNotifyContent) {
		this.msgNotifyContent = msgNotifyContent;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
