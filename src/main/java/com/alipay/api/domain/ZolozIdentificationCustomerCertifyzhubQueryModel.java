package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸服务的结果查询(一体化)
 *
 * @author auto create
 * @since 1.0, 2021-12-24 19:13:07
 */
public class ZolozIdentificationCustomerCertifyzhubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5351622491436949763L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证   3：实名转匿名注册
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * 是否需要返回人脸图片
	 */
	@ApiField("need_img")
	private Boolean needImg;

	/**
	 * zimId，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getFaceType() {
		return this.faceType;
	}
	public void setFaceType(Long faceType) {
		this.faceType = faceType;
	}

	public Boolean getNeedImg() {
		return this.needImg;
	}
	public void setNeedImg(Boolean needImg) {
		this.needImg = needImg;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
