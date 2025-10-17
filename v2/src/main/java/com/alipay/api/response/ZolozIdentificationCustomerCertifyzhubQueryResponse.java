package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FaceAttrInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certifyzhub.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:14
 */
public class ZolozIdentificationCustomerCertifyzhubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2641428246644652519L;

	/** 
	 * 是否为攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 人脸属性信息，提供对人脸base64图片的额外描述，包括不限于人脸矩形框。目前仅为矩形框，无需脱敏。
	 */
	@ApiField("face_attr_info")
	private FaceAttrInfo faceAttrInfo;

	/** 
	 * 图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("img_str")
	private String imgStr;

	/** 
	 * 人脸服务端返回码
	 */
	@ApiField("zim_code")
	private String zimCode;

	/** 
	 * 人脸服务端返回信息
	 */
	@ApiField("zim_msg")
	private String zimMsg;

	/** 
	 * 人脸识别token，目前用法是在客户端将作为秘钥用来解密人脸图片
	 */
	@ApiField("zim_token")
	private String zimToken;

	public void setAttack(Boolean attack) {
		this.attack = attack;
	}
	public Boolean getAttack( ) {
		return this.attack;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setFaceAttrInfo(FaceAttrInfo faceAttrInfo) {
		this.faceAttrInfo = faceAttrInfo;
	}
	public FaceAttrInfo getFaceAttrInfo( ) {
		return this.faceAttrInfo;
	}

	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}
	public String getImgStr( ) {
		return this.imgStr;
	}

	public void setZimCode(String zimCode) {
		this.zimCode = zimCode;
	}
	public String getZimCode( ) {
		return this.zimCode;
	}

	public void setZimMsg(String zimMsg) {
		this.zimMsg = zimMsg;
	}
	public String getZimMsg( ) {
		return this.zimMsg;
	}

	public void setZimToken(String zimToken) {
		this.zimToken = zimToken;
	}
	public String getZimToken( ) {
		return this.zimToken;
	}

}
