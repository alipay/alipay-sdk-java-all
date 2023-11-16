package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个体工商户经营者信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OperatorInfo extends AlipayObject {

	private static final long serialVersionUID = 3396367271952248717L;

	/**
	 * 个体工商户经营者证件到期日，格式为YYYY-MM-DD
	 */
	@ApiField("operator_cert_indate")
	private String operatorCertIndate;

	/**
	 * 个体工商户经营者证件号码
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 个体工商户经营者证件照片背面图片（如证件类型为身份证则上传国徽面图片）
	 */
	@ApiField("operator_cert_pic_back")
	private String operatorCertPicBack;

	/**
	 * 个体工商户经营者证件正面照片（如证件类型为身份证则需要上传头像面图片）
	 */
	@ApiField("operator_cert_pic_front")
	private String operatorCertPicFront;

	/**
	 * 个体工商户经营者证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("operator_cert_type")
	private String operatorCertType;

	/**
	 * 张三
	 */
	@ApiField("operator_name")
	private String operatorName;

	public String getOperatorCertIndate() {
		return this.operatorCertIndate;
	}
	public void setOperatorCertIndate(String operatorCertIndate) {
		this.operatorCertIndate = operatorCertIndate;
	}

	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

	public String getOperatorCertPicBack() {
		return this.operatorCertPicBack;
	}
	public void setOperatorCertPicBack(String operatorCertPicBack) {
		this.operatorCertPicBack = operatorCertPicBack;
	}

	public String getOperatorCertPicFront() {
		return this.operatorCertPicFront;
	}
	public void setOperatorCertPicFront(String operatorCertPicFront) {
		this.operatorCertPicFront = operatorCertPicFront;
	}

	public String getOperatorCertType() {
		return this.operatorCertType;
	}
	public void setOperatorCertType(String operatorCertType) {
		this.operatorCertType = operatorCertType;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
