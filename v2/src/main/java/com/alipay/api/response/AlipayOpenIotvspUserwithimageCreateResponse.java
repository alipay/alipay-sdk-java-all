package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithimage.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 14:34:09
 */
public class AlipayOpenIotvspUserwithimageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7678415914767663389L;

	/** 
	 * 相似脸vid
	 */
	@ApiField("similar_vid")
	private String similarVid;

	/** 
	 * 增加相似脸vid列表
	 */
	@ApiListField("similar_vid_list")
	@ApiField("string")
	private List<String> similarVidList;

	/** 
	 * 用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

	public void setSimilarVid(String similarVid) {
		this.similarVid = similarVid;
	}
	public String getSimilarVid( ) {
		return this.similarVid;
	}

	public void setSimilarVidList(List<String> similarVidList) {
		this.similarVidList = similarVidList;
	}
	public List<String> getSimilarVidList( ) {
		return this.similarVidList;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
