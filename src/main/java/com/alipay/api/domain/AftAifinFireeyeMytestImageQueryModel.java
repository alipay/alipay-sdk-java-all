package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 誉少金融云接口预发验证
 *
 * @author auto create
 * @since 1.0, 2019-03-11 15:11:06
 */
public class AftAifinFireeyeMytestImageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4677778223522137554L;

	/**
	 * 用于ocr识别的请求图片、base64编码
	 */
	@ApiField("image")
	private String image;

	/**
	 * ocr服务类型，例如carvin,idcard等
	 */
	@ApiField("ocr_type")
	private String ocrType;

	/**
	 * 产品集群ID，默认填写示例值
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	/**
	 * 可用地域
	 */
	@ApiField("region_name")
	private String regionName;

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

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
