package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印指令
 *
 * @author auto create
 * @since 1.0, 2019-10-17 19:57:06
 */
public class AlipayCommerceIotSdarttoolPrintSendModel extends AlipayObject {

	private static final long serialVersionUID = 5465848725399543572L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

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

	/**
	 * 走纸行数默为03
	 */
	@ApiField("walk_paper")
	private String walkPaper;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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

	public String getWalkPaper() {
		return this.walkPaper;
	}
	public void setWalkPaper(String walkPaper) {
		this.walkPaper = walkPaper;
	}

}
