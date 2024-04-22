package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸验证
 *
 * @author auto create
 * @since 1.0, 2018-03-02 16:10:32
 */
public class ZolozAuthenticationCustomerFaceverifyMatchModel extends AlipayObject {

	private static final long serialVersionUID = 1327418662587477658L;

	/**
	 * 活体照片的二进制内容，然后做base64编码
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * C0：手机端采集的人脸图片
C1：机具端采集的人脸图片
	 */
	@ApiField("auth_img_channel")
	private String authImgChannel;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证件名字
（若type=2，此为必填项）
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
(若type=2，此为必填项)
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
(若type=2，此为必填项)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 业务方使用的账户唯一标示（如果type=1，此为必填项）
	 */
	@ApiField("merchant_uid")
	private String merchantUid;

	/**
	 * 比对源照片的二进制内容，然后做base64编码
（如果type=1，此为必填项）
	 */
	@ApiField("ref_img")
	private String refImg;

	/**
	 * 验证类型：
1：用户自定义
2：实名
	 */
	@ApiField("type")
	private String type;

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getAuthImgChannel() {
		return this.authImgChannel;
	}
	public void setAuthImgChannel(String authImgChannel) {
		this.authImgChannel = authImgChannel;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMerchantUid() {
		return this.merchantUid;
	}
	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

	public String getRefImg() {
		return this.refImg;
	}
	public void setRefImg(String refImg) {
		this.refImg = refImg;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
