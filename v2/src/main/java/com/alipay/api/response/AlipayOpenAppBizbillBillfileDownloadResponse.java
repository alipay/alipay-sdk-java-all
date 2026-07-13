package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.bizbill.billfile.download response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 10:17:55
 */
public class AlipayOpenAppBizbillBillfileDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8546183159793538523L;

	/** 
	 * 查询的账单日期，格式yyyy-MM-dd
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * null
	 */
	@ApiListField("file_urls")
	@ApiField("string")
	private List<String> fileUrls;

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setFileUrls(List<String> fileUrls) {
		this.fileUrls = fileUrls;
	}
	public List<String> getFileUrls( ) {
		return this.fileUrls;
	}

}
