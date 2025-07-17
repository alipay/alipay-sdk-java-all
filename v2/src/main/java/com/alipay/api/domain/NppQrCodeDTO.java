package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展码数据模型
 *
 * @author auto create
 * @since 1.0, 2025-04-17 15:10:52
 */
public class NppQrCodeDTO extends AlipayObject {

	private static final long serialVersionUID = 8476222371639375639L;

	/**
	 * 可用于标注特殊票种
0：正常，常规白色底
1：特殊，渐变蓝色
	 */
	@ApiField("code_color")
	private String codeColor;

	/**
	 * 码介绍
	 */
	@ApiField("code_intro")
	private String codeIntro;

	/**
	 * 可用户“票号”
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 码状态（
未核销:0
已核销:1
已作废:2
）
	 */
	@ApiField("code_status")
	private String codeStatus;

	/**
	 * 生成二维码的字符串
	 */
	@ApiField("code_value")
	private String codeValue;

	public String getCodeColor() {
		return this.codeColor;
	}
	public void setCodeColor(String codeColor) {
		this.codeColor = codeColor;
	}

	public String getCodeIntro() {
		return this.codeIntro;
	}
	public void setCodeIntro(String codeIntro) {
		this.codeIntro = codeIntro;
	}

	public String getCodeNo() {
		return this.codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeStatus() {
		return this.codeStatus;
	}
	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

}
