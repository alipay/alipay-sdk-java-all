package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取捐赠票据对账文件接口
 *
 * @author auto create
 * @since 1.0, 2025-06-16 15:41:09
 */
public class AlipayFundInvoiceSummaryDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 3499859858781666859L;

	/**
	 * 校验日期，yyyymmdd
	 */
	@ApiField("check_date")
	private String checkDate;

	public String getCheckDate() {
		return this.checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

}
