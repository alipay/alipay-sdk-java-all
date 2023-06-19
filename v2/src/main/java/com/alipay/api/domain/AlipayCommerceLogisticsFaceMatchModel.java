package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递柜刷脸取件接口
 *
 * @author auto create
 * @since 1.0, 2021-05-11 17:10:15
 */
public class AlipayCommerceLogisticsFaceMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4269197435419668368L;

	/**
	 * 业务类型标识，比如 刷脸开柜，刷脸支付, 值由支付宝分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 人脸集合标识-对于自提柜刷脸开柜验证场景，对应 柜子编号,注意不是格口的编号 ，
	 */
	@ApiField("face_group")
	private String faceGroup;

	/**
	 * 刷脸取件用户的人脸图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 识别的人脸矩形，格式为 "left,top,width,height"
	 */
	@ApiField("face_rectangle")
	private String faceRectangle;

	/**
	 * 商户编码-物流体系里的编码
	 */
	@ApiField("merchant_code")
	private String merchantCode;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFaceGroup() {
		return this.faceGroup;
	}
	public void setFaceGroup(String faceGroup) {
		this.faceGroup = faceGroup;
	}

	public String getFaceImage() {
		return this.faceImage;
	}
	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public String getFaceRectangle() {
		return this.faceRectangle;
	}
	public void setFaceRectangle(String faceRectangle) {
		this.faceRectangle = faceRectangle;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

}
