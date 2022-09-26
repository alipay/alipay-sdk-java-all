package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-28 00:00:21
 */
public class AlipayAssetPointVoucherprodBenefittemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1133386362418288481L;

	/** 
	 * 修改后模版的过期时间
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

}
