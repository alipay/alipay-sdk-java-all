package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class HDFDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 6456882682169874724L;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生头像链接
	 */
	@ApiField("head_image")
	private String headImage;

	/**
	 * 0  是女、1 男、2 未知
	 */
	@ApiField("sex")
	private Long sex;

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHeadImage() {
		return this.headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public Long getSex() {
		return this.sex;
	}
	public void setSex(Long sex) {
		this.sex = sex;
	}

}
