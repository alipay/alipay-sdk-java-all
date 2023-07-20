package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询对账下载地址
 *
 * @author auto create
 * @since 1.0, 2022-10-19 11:38:24
 */
public class KoubeiTradeBillDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5237868111555994434L;

	/**
	 * 账单数据的产生时间
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 对应账单类型，如业务帐
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 账单的生成类型，如日账单/周账单/月账单
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 查询文件的格式
	 */
	@ApiField("file_type")
	private String fileType;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
