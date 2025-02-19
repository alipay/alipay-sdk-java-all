package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.recon.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 16:37:26
 */
public class AlipayEbppIndustrySalaryReconQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5747749731817142688L;

	/** 
	 * 账单日期，格式为yyyyMMdd
	 */
	@ApiField("date")
	private String date;

	/** 
	 * 对账文件下载链接(五分钟有效期)	String
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 外部交易号。由合作方系统生成，只能包含字母、数字、下划线；需保证合作方系统不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 响应加签xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/** 
	 * 下载账单类型
	 */
	@ApiField("type")
	private String type;

	public void setDate(String date) {
		this.date = date;
	}
	public String getDate( ) {
		return this.date;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
