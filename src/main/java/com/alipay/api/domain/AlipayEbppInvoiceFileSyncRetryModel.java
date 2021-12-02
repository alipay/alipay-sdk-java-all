package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件同步补偿接口
 *
 * @author auto create
 * @since 1.0, 2021-04-06 11:45:21
 */
public class AlipayEbppInvoiceFileSyncRetryModel extends AlipayObject {

	private static final long serialVersionUID = 2536557129782372674L;

	/**
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

	/**
	 * 文件下载链接，在is_url_replace为true的时候，该字段必填
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 是否需要替换文件下载链接
	 */
	@ApiField("is_url_replace")
	private Boolean isUrlReplace;

	/**
	 * 商户简称，userId未传的时候，该字段必填
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 外部交易流水号，userId未传的情况下，该字段必填
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID，该字段未传的情况下，商户简称和外部交易流水号必填
	 */
	@ApiField("user_id")
	private String userId;

	public String getEinvCode() {
		return this.einvCode;
	}
	public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

	public String getEinvNo() {
		return this.einvNo;
	}
	public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Boolean getIsUrlReplace() {
		return this.isUrlReplace;
	}
	public void setIsUrlReplace(Boolean isUrlReplace) {
		this.isUrlReplace = isUrlReplace;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
