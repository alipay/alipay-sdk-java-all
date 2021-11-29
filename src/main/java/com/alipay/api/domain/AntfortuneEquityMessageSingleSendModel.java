package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数金机构单发模板消息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 10:59:50
 */
public class AntfortuneEquityMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 2629191182663365431L;

	/**
	 * TA编码
	 */
	@ApiField("ta_code")
	private String taCode;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private MessageTemplate template;

	/**
	 * 基金交易账号
	 */
	@ApiField("trade_account")
	private String tradeAccount;

	public String getTaCode() {
		return this.taCode;
	}
	public void setTaCode(String taCode) {
		this.taCode = taCode;
	}

	public MessageTemplate getTemplate() {
		return this.template;
	}
	public void setTemplate(MessageTemplate template) {
		this.template = template;
	}

	public String getTradeAccount() {
		return this.tradeAccount;
	}
	public void setTradeAccount(String tradeAccount) {
		this.tradeAccount = tradeAccount;
	}

}
