package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.bidata.blockinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-14 19:22:24
 */
public class AlipayCommerceMedicalBidataBlockinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1635776148538811278L;

	/** 
	 * 驾驶舱上不同区域的返回数据.
	 */
	@ApiField("block_content")
	private String blockContent;

	/** 
	 * 驾驶舱上不同区域的型，可选值如下："basic_info","trends","hot_words","channel_users","provide_service"
	 */
	@ApiField("block_type")
	private String blockType;

	public void setBlockContent(String blockContent) {
		this.blockContent = blockContent;
	}
	public String getBlockContent( ) {
		return this.blockContent;
	}

	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}
	public String getBlockType( ) {
		return this.blockType;
	}

}
