package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IotIdentityOrgUserVidInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.uservid.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-18 10:16:43
 */
public class AlipayOpenIotvspUservidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5682675872572751896L;

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
