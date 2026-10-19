package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.attach.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-26 15:57:18
 */
public class AlipayCommerceMedicalHdfAttachQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6385391912891591759L;

	/** 
	 * 附件Id
	 */
	@ApiField("attachement_id")
	private String attachementId;

	/** 
	 * 路径
	 */
	@ApiField("file_path")
	private String filePath;

	/** 
	 * 链接
	 */
	@ApiField("murl")
	private String murl;

	/** 
	 * 链接
	 */
	@ApiField("nurl")
	private String nurl;

	/** 
	 * 链接
	 */
	@ApiField("turl")
	private String turl;

	/** 
	 * 链接
	 */
	@ApiField("url")
	private String url;

	public void setAttachementId(String attachementId) {
		this.attachementId = attachementId;
	}
	public String getAttachementId( ) {
		return this.attachementId;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFilePath( ) {
		return this.filePath;
	}

	public void setMurl(String murl) {
		this.murl = murl;
	}
	public String getMurl( ) {
		return this.murl;
	}

	public void setNurl(String nurl) {
		this.nurl = nurl;
	}
	public String getNurl( ) {
		return this.nurl;
	}

	public void setTurl(String turl) {
		this.turl = turl;
	}
	public String getTurl( ) {
		return this.turl;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
