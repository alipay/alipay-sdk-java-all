package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融资服务文件附件
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:02:43
 */
public class FinAttachment extends AlipayObject {

	private static final long serialVersionUID = 5645634414329171616L;

	/**
	 * 协议编码，当type为AGREEMENT时必填
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 文件后缀
	 */
	@ApiField("file_suffix")
	private String fileSuffix;

	/**
	 * 文件名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 附件类型:
AGREEMENT：协议
PERSON_ID_CARD_FRONT：法人身份证正面影像件
PERSON_ID_CARD_BACK：法人身份证反面影像件
COMPANY_LICENSE：营业执照影像件
	 */
	@ApiField("type")
	private String type;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileSuffix() {
		return this.fileSuffix;
	}
	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
