package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印指令
 *
 * @author auto create
 * @since 1.0, 2019-09-11 09:12:39
 */
public class AlipayCommerceIotSdarttoolPrintSendModel extends AlipayObject {

	private static final long serialVersionUID = 7325121915883396868L;

	/**
	 * 唯一请求流水号
	 */
	@ApiField("outer_no")
	private String outerNo;

	/**
	 * 打印内容
	 */
	@ApiField("print_content")
	private String printContent;

	/**
	 * 打印模板
	 */
	@ApiField("print_template")
	private String printTemplate;

	/**
	 * 打印的业务场景
	 */
	@ApiField("sence")
	private String sence;

	/**
	 * 设备sn号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getOuterNo() {
		return this.outerNo;
	}
	public void setOuterNo(String outerNo) {
		this.outerNo = outerNo;
	}

	public String getPrintContent() {
		return this.printContent;
	}
	public void setPrintContent(String printContent) {
		this.printContent = printContent;
	}

	public String getPrintTemplate() {
		return this.printTemplate;
	}
	public void setPrintTemplate(String printTemplate) {
		this.printTemplate = printTemplate;
	}

	public String getSence() {
		return this.sence;
	}
	public void setSence(String sence) {
		this.sence = sence;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
