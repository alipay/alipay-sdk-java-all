package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.security.knowledge.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 15:13:43
 */
public class AlipayEbppIndustrySecurityKnowledgeCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4616945112225188199L;

	/** 
	 * 检测未通过链接的索引列表
	 */
	@ApiListField("no_passed_link_index_list")
	@ApiField("number")
	private List<Long> noPassedLinkIndexList;

	/** 
	 * 检测未通过图片的索引列表
	 */
	@ApiListField("no_passed_pic_url_index_list")
	@ApiField("number")
	private List<Long> noPassedPicUrlIndexList;

	/** 
	 * 参数中传递的未通过检测的文本索引位置
	 */
	@ApiListField("no_passed_text_index_list")
	@ApiField("number")
	private List<Long> noPassedTextIndexList;

	/** 
	 * 检测是否安全
	 */
	@ApiField("safe")
	private Boolean safe;

	public void setNoPassedLinkIndexList(List<Long> noPassedLinkIndexList) {
		this.noPassedLinkIndexList = noPassedLinkIndexList;
	}
	public List<Long> getNoPassedLinkIndexList( ) {
		return this.noPassedLinkIndexList;
	}

	public void setNoPassedPicUrlIndexList(List<Long> noPassedPicUrlIndexList) {
		this.noPassedPicUrlIndexList = noPassedPicUrlIndexList;
	}
	public List<Long> getNoPassedPicUrlIndexList( ) {
		return this.noPassedPicUrlIndexList;
	}

	public void setNoPassedTextIndexList(List<Long> noPassedTextIndexList) {
		this.noPassedTextIndexList = noPassedTextIndexList;
	}
	public List<Long> getNoPassedTextIndexList( ) {
		return this.noPassedTextIndexList;
	}

	public void setSafe(Boolean safe) {
		this.safe = safe;
	}
	public Boolean getSafe( ) {
		return this.safe;
	}

}
