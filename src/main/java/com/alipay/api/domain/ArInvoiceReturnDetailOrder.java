package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退换票申请明细
 *
 * @author auto create
 * @since 1.0, 2021-09-03 15:24:39
 */
public class ArInvoiceReturnDetailOrder extends AlipayObject {

	private static final long serialVersionUID = 3273653776692812459L;

	/**
	 * 附件地址
如果是附件类型AttchTypeEnum.HTTP_DOWNLOAD_URL格式为（文件后缀不带.）||下载url
例：下载一个pdf文件
pdf||http://www.xxx.com/download?filename=xxx.pdf&xxx

如果附件类型是发票的oss key直接写osskey即可
	 */
	@ApiListField("attach_urls")
	@ApiField("string")
	private List<String> attachUrls;

	/**
	 * 附件类型
INVOICE_OSS_KEY表示上传到发票oss的key
HTTP_DOWNLOAD_URL表示附件是一个http get方式的下载链接
	 */
	@ApiField("attch_type")
	private String attchType;

	/**
	 * 是否通过税务认证,默认为false true:通过,false:不通过
	 */
	@ApiField("auth")
	private Boolean auth;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 红冲税务通知单号,认证通过之后必填
	 */
	@ApiField("red_notice_no")
	private String redNoticeNo;

	public List<String> getAttachUrls() {
		return this.attachUrls;
	}
	public void setAttachUrls(List<String> attachUrls) {
		this.attachUrls = attachUrls;
	}

	public String getAttchType() {
		return this.attchType;
	}
	public void setAttchType(String attchType) {
		this.attchType = attchType;
	}

	public Boolean getAuth() {
		return this.auth;
	}
	public void setAuth(Boolean auth) {
		this.auth = auth;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getRedNoticeNo() {
		return this.redNoticeNo;
	}
	public void setRedNoticeNo(String redNoticeNo) {
		this.redNoticeNo = redNoticeNo;
	}

}
