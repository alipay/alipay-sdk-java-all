package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训教师信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 13:31:45
 */
public class TeacherVO extends AlipayObject {

	private static final long serialVersionUID = 3525923881435434213L;

	/**
	 * 教师简介
	 */
	@ApiField("teacher_introduce")
	private String teacherIntroduce;

	/**
	 * 教师名称
	 */
	@ApiField("teacher_name")
	private String teacherName;

	/**
	 * 调用<a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload?pathHash=a941a783" target="_blank">alipay.marketing.image.enhance.upload</a>，商品联系人头像场景(upload_scene): ITEM_HEAD_SCULPTURE_IMAGE;
尺寸要求:72*72px;
	 */
	@ApiField("teacher_picture")
	private String teacherPicture;

	public String getTeacherIntroduce() {
		return this.teacherIntroduce;
	}
	public void setTeacherIntroduce(String teacherIntroduce) {
		this.teacherIntroduce = teacherIntroduce;
	}

	public String getTeacherName() {
		return this.teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPicture() {
		return this.teacherPicture;
	}
	public void setTeacherPicture(String teacherPicture) {
		this.teacherPicture = teacherPicture;
	}

}
