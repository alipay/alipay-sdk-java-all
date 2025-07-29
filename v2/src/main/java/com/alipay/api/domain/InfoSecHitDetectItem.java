package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险识别接口服务-命中结果
 *
 * @author auto create
 * @since 1.0, 2022-05-24 14:47:30
 */
public class InfoSecHitDetectItem extends AlipayObject {

	private static final long serialVersionUID = 5178875184422175814L;

	/**
	 * 级别
	 */
	@ApiField("detect_resource_level")
	private String detectResourceLevel;

	/**
	 * RULEORMODEL("RULEORMODEL", "规则或模型"),
		KEYWORDS("KEYWORDS", "关键字检测 "),
		REPEAT_MODEL("REPEAT_MODEL", "防重复模型"),
		REGEX("regex", "正则表达式"),
		URL("url", "URL检测"),
		SEXY_PIC("sexyPic", "黄图检测"),
		SAMPLE_PIC("samplePic", "样图检测"),
		OCR("ocr", "图文识别"),
		PICTURE_FACE("picture_face","图片人脸检测"),
		QRCODE("QRCode", "二维码检测"),
		MDP_MODEL("mdpModel", "mdp检测"),
		ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
	 */
	@ApiField("detect_type_code")
	private String detectTypeCode;

	/**
	 * 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
	 */
	@ApiField("hit_content")
	private String hitContent;

	/**
	 * 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
	 */
	@ApiField("hit_detect_resource")
	private String hitDetectResource;

	public String getDetectResourceLevel() {
		return this.detectResourceLevel;
	}
	public void setDetectResourceLevel(String detectResourceLevel) {
		this.detectResourceLevel = detectResourceLevel;
	}

	public String getDetectTypeCode() {
		return this.detectTypeCode;
	}
	public void setDetectTypeCode(String detectTypeCode) {
		this.detectTypeCode = detectTypeCode;
	}

	public String getHitContent() {
		return this.hitContent;
	}
	public void setHitContent(String hitContent) {
		this.hitContent = hitContent;
	}

	public String getHitDetectResource() {
		return this.hitDetectResource;
	}
	public void setHitDetectResource(String hitDetectResource) {
		this.hitDetectResource = hitDetectResource;
	}

}
