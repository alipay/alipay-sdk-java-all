package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.attachment.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-14 10:02:07
 */
public class AlipayIserviceCcmSwAttachmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6141285726262476371L;

	/** 
	 * 附件id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
