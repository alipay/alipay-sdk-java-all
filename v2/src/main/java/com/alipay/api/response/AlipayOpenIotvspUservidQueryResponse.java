package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityOrgUserVidInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.uservid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:20:04
 */
public class AlipayOpenIotvspUservidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7684647853141616481L;

	/** 
	 * 返回刷脸vid
	 */
	@ApiField("vid_info_list")
	private IotIdentityOrgUserVidInfoResponse vidInfoList;

	public void setVidInfoList(IotIdentityOrgUserVidInfoResponse vidInfoList) {
		this.vidInfoList = vidInfoList;
	}
	public IotIdentityOrgUserVidInfoResponse getVidInfoList( ) {
		return this.vidInfoList;
	}

}
