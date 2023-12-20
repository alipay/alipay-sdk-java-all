package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR火眼识别
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:11:59
 */
public class AftAifinFireeyeOcrImageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7666581221343457863L;

	/**
	 * 用于ocr识别请求图片的BASE64编码
	 */
	@ApiField("image")
	private String image;

	/**
	 * ocr服务类型，例如银行卡bankcard, 营业执照businesslicense, 车架号carvin, 驾驶证driverlicense, 行驶证vehiclelicense, 身份证idcard, 车牌号vehicleplate, 发票inference等
	 */
	@ApiField("ocr_type")
	private String ocrType;

	/**
	 * 产品集群ID，默认填写示例值
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getOcrType() {
		return this.ocrType;
	}
	public void setOcrType(String ocrType) {
		this.ocrType = ocrType;
	}

	public String getProductInstanceId() {
		return this.productInstanceId;
	}
	public void setProductInstanceId(String productInstanceId) {
		this.productInstanceId = productInstanceId;
	}

}
