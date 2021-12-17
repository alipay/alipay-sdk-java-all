package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模版主核销区信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateOperationDTO extends AlipayObject {

	private static final long serialVersionUID = 2716667236899485423L;

	/**
	 * 核销区行动点提示文案。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("alt_text")
	private String altText;

	/**
	 * 核销操作类型，支持：qrcode（二维码方式）、barcode（条形码）、text（文本文案）、url（网页链接）、自定义核销（exchange）。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("format_type")
	private String formatType;

	/**
	 * 核销区具体行动，当核销操作类型为：qrcode（二维码方式）、barcode（条形码）、自定义核销（exchange）时为具体核销操作值；当核销操作类型为：url（网页链接）时为对应跳转服务地址，需带上http、https、alipays等协议头。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("message")
	private String message;

	/**
	 * 核销区提示信息标准编码格式，如gbk、utf-8（默认）等。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("message_encoding")
	private String messageEncoding;

	/**
	 * 核销区文本信息描述，当核销操作类型为：text（文本文案）时必填，用于描述具体文本文案内容。
	 */
	@ApiListField("text_messages")
	@ApiField("template_text_message_d_t_o")
	private List<TemplateTextMessageDTO> textMessages;

	public String getAltText() {
		return this.altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}

	public String getFormatType() {
		return this.formatType;
	}
	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageEncoding() {
		return this.messageEncoding;
	}
	public void setMessageEncoding(String messageEncoding) {
		this.messageEncoding = messageEncoding;
	}

	public List<TemplateTextMessageDTO> getTextMessages() {
		return this.textMessages;
	}
	public void setTextMessages(List<TemplateTextMessageDTO> textMessages) {
		this.textMessages = textMessages;
	}

}
