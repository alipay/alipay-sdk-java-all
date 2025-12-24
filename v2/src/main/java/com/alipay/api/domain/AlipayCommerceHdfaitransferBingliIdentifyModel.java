package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病历信息抽取
 *
 * @author auto create
 * @since 1.0, 2025-11-18 19:47:41
 */
public class AlipayCommerceHdfaitransferBingliIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4768685543498923494L;

	/**
	 * OCR文本内容
	 */
	@ApiField("ocr_content")
	private String ocrContent;

	/**
	 * 调用该接口的场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getOcrContent() {
		return this.ocrContent;
	}
	public void setOcrContent(String ocrContent) {
		this.ocrContent = ocrContent;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
