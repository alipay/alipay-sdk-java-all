package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 上传芝识课程信息
 *
 * @author auto create
 * @since 1.0, 2023-03-28 19:36:51
 */
public class ZhimaCustomerJobworthCourseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3323171176621577955L;

	/**
	 * 章节列表
	 */
	@ApiListField("course_chapter_list")
	@ApiField("job_worth_course_chapter")
	private List<JobWorthCourseChapter> courseChapterList;

	/**
	 * 课程的详细描述文案
	 */
	@ApiField("course_desc")
	private String courseDesc;

	/**
	 * 课程描述图片file_id，通过素材上传接口获取，为了视觉效果，请保证最多3张图
	 */
	@ApiListField("course_desc_pic")
	@ApiField("string")
	private List<String> courseDescPic;

	/**
	 * 该套课程的id，全局唯一
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程主图file_id，通过素材上传接口获取
	 */
	@ApiField("course_pic")
	private String coursePic;

	/**
	 * 课程标题
	 */
	@ApiField("course_title")
	private String courseTitle;

	/**
	 * 商家的生活号程序id，商家的课程内容需上传的该生活号内
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 教师列表
	 */
	@ApiListField("teacher_list")
	@ApiField("job_worth_course_teacher")
	private List<JobWorthCourseTeacher> teacherList;

	public List<JobWorthCourseChapter> getCourseChapterList() {
		return this.courseChapterList;
	}
	public void setCourseChapterList(List<JobWorthCourseChapter> courseChapterList) {
		this.courseChapterList = courseChapterList;
	}

	public String getCourseDesc() {
		return this.courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public List<String> getCourseDescPic() {
		return this.courseDescPic;
	}
	public void setCourseDescPic(List<String> courseDescPic) {
		this.courseDescPic = courseDescPic;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCoursePic() {
		return this.coursePic;
	}
	public void setCoursePic(String coursePic) {
		this.coursePic = coursePic;
	}

	public String getCourseTitle() {
		return this.courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public List<JobWorthCourseTeacher> getTeacherList() {
		return this.teacherList;
	}
	public void setTeacherList(List<JobWorthCourseTeacher> teacherList) {
		this.teacherList = teacherList;
	}

}
