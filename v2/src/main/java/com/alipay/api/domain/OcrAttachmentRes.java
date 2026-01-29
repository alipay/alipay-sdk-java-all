package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-15 12:57:41
 */
public class OcrAttachmentRes extends AlipayObject {

	private static final long serialVersionUID = 3162492245445253799L;

	/**
	 * aq附件id
	 */
	@ApiField("aq_id")
	private String aqId;

	/**
	 * aq附件类型
	 */
	@ApiField("aq_type")
	private String aqType;

	/**
	 * aq附件地址
	 */
	@ApiField("aq_url")
	private String aqUrl;

	/**
	 * 附件id
	 */
	@ApiField("id")
	private String id;

	/**
	 * OCR结果
	 */
	@ApiField("ocr_res")
	private String ocrRes;

	/**
	 * 附件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 附件地址
	 */
	@ApiField("url")
	private String url;

	public String getAqId() {
		return this.aqId;
	}
	public void setAqId(String aqId) {
		this.aqId = aqId;
	}

	public String getAqType() {
		return this.aqType;
	}
	public void setAqType(String aqType) {
		this.aqType = aqType;
	}

	public String getAqUrl() {
		return this.aqUrl;
	}
	public void setAqUrl(String aqUrl) {
		this.aqUrl = aqUrl;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOcrRes() {
		return this.ocrRes;
	}
	public void setOcrRes(String ocrRes) {
		this.ocrRes = ocrRes;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
