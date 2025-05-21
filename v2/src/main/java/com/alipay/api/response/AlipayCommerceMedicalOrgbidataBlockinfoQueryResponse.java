package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.orgbidata.blockinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 19:47:24
 */
public class AlipayCommerceMedicalOrgbidataBlockinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2834214235447529223L;

	/** 
	 * 数据返回
	 */
	@ApiField("block_content")
	private String blockContent;

	/** 
	 * 聚合数据的不同类型：
"org_aggr_statistics","org_statistics_detail"
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
