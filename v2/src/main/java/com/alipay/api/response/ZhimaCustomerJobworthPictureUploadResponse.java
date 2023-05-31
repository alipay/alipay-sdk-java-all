package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.picture.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:31:43
 */
public class ZhimaCustomerJobworthPictureUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5484495263568338145L;

	/** 
	 * 图片返回ID
	 */
	@ApiField("pic_id")
	private String picId;

	/** 
	 * 错误码
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 错误原因
	 */
	@ApiField("sub_msg")
	private String subMsg;

	public void setPicId(String picId) {
		this.picId = picId;
	}
	public String getPicId( ) {
		return this.picId;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

}
