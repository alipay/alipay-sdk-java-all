package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销报表下载
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:35:32
 */
public class KoubeiMarketingDataActivityBillDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 5798689526589614294L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
