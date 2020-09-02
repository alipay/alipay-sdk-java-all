package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户学生证信息同步
 *
 * @author auto create
 * @since 1.0, 2020-07-16 21:26:46
 */
public class AlipayCommerceEducateCampusCardUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6384797754791252669L;

	/**
	 * 学生证照片链接(可多张)。注：需要提供图片oss URL访问地址，且url需要长期有效
	 */
	@ApiListField("campus_card_picture")
	@ApiField("string")
	private List<String> campusCardPicture;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	public List<String> getCampusCardPicture() {
		return this.campusCardPicture;
	}
	public void setCampusCardPicture(List<String> campusCardPicture) {
		this.campusCardPicture = campusCardPicture;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
