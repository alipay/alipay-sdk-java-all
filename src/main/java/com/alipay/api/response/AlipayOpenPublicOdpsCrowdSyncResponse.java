package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.odps.crowd.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-25 16:30:02
 */
public class AlipayOpenPublicOdpsCrowdSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664427238214249523L;

	/** 
	 * 同步单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 生活号对应的人群id，不一定返回，成功同步情况下会返回
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/** 
	 * 没有dmp平台人群id
	 */
	@ApiField("dmp_id")
	private String dmpId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

	public void setDmpId(String dmpId) {
		this.dmpId = dmpId;
	}
	public String getDmpId( ) {
		return this.dmpId;
	}

}
