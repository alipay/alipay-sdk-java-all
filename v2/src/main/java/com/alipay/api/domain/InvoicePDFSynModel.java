package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票同步简单模式下的发票信息入参模型
 *
 * @author auto create
 * @since 1.0, 2023-09-11 20:05:28
 */
public class InvoicePDFSynModel extends AlipayObject {

	private static final long serialVersionUID = 5719187826244168724L;

	/**
	 * 支付宝开票申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 预留的扩展字段，格式如：key1=value1\nkey2=value2\nkey3=value3，字段之间以\n(换行符)分隔。
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * base64化的字符串，与file_download_url不可同时为空。
	 */
	@ApiField("file_base")
	private String fileBase;

	/**
	 * 文件类型，必填。
PDF类型文件填写PDF，
OFD类型文件填写ofd，
JPG类型文件填写JPG(JPG文件请先询问对接人当前是否支持)
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 发票文件下载地址，和file_base不可同时为空。
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户id，当apply_id为空时，open_id必填
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部ISV的唯一发票标识
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 压缩方式
	 */
	@ApiField("zip")
	private String zip;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getFileBase() {
		return this.fileBase;
	}
	public void setFileBase(String fileBase) {
		this.fileBase = fileBase;
	}

	public String getFileDownloadType() {
		return this.fileDownloadType;
	}
	public void setFileDownloadType(String fileDownloadType) {
		this.fileDownloadType = fileDownloadType;
	}

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutInvoiceId() {
		return this.outInvoiceId;
	}
	public void setOutInvoiceId(String outInvoiceId) {
		this.outInvoiceId = outInvoiceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
