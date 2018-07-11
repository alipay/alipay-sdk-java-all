package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸注册或者认证的结果查询
 *
 * @author auto create
 * @since 1.0, 2018-04-03 16:46:06
 */
public class ZolozIdentificationCustomerEnrollcertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5795456361992446172L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证
	 */
	@ApiField("face_type")
	private Long faceType;

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

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
