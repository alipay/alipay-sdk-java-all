package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统账单查询结果(交易账单)
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:53:54
 */
public class KbAdvertDealBillResponse extends AlipayObject {

	private static final long serialVersionUID = 7675946425269857569L;

	/**
	 * 账单下载地址(为空表示查无账单)
	 */
	@ApiField("download_url")
	private String downloadUrl;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

}
