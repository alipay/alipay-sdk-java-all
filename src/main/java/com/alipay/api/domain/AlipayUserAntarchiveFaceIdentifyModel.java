package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁档案人像管理平台人像比对服务
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:58:31
 */
public class AlipayUserAntarchiveFaceIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7674219638163667413L;

	/**
	 * 比对业务场景，用于计费和限流等功能
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 证件上的姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,取值范围为:
100 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 请求人像，jpg格式，BASE64转换后字符串，大小限制为30K以内
	 */
	@ApiField("portrait")
	private String portrait;

	/**
	 * 人脸区域坐标，格式为：left,top,right,bottom
	 */
	@ApiField("portrait_auth_rect")
	private String portraitAuthRect;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getPortrait() {
		return this.portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getPortraitAuthRect() {
		return this.portraitAuthRect;
	}
	public void setPortraitAuthRect(String portraitAuthRect) {
		this.portraitAuthRect = portraitAuthRect;
	}

}
