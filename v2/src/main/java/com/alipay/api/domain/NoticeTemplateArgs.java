package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知内容模板
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:05
 */
public class NoticeTemplateArgs extends AlipayObject {

	private static final long serialVersionUID = 4641819232674723789L;

	/**
	 * 课程开始时间
	 */
	@ApiField("course_start_time")
	private Date courseStartTime;

	public Date getCourseStartTime() {
		return this.courseStartTime;
	}
	public void setCourseStartTime(Date courseStartTime) {
		this.courseStartTime = courseStartTime;
	}

}
