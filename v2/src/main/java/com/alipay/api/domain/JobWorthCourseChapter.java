package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得课程章节信息
 *
 * @author auto create
 * @since 1.0, 2023-02-20 14:15:33
 */
public class JobWorthCourseChapter extends AlipayObject {

	private static final long serialVersionUID = 3521216317332851442L;

	/**
	 * 课程序号，在同层级内用作章节排序，序号小的靠后
	 */
	@ApiField("chapter_no")
	private Long chapterNo;

	/**
	 * 内容类型，非dir类型必填，pic(图片)/txt(纯文本)/video(视频)
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 课程章节id，在一套课程内全局唯一
	 */
	@ApiField("course_chapter_id")
	private String courseChapterId;

	/**
	 * 章节名称，会在C端透出
	 */
	@ApiField("name")
	private String name;

	/**
	 * dir代表章节，content代表目录
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 类似于指针，用于在章节树中指向父节点
	 */
	@ApiField("parent_chapter_id")
	private String parentChapterId;

	/**
	 * 生活号视频资源Id
	 */
	@ApiField("video_content_id")
	private String videoContentId;

	public Long getChapterNo() {
		return this.chapterNo;
	}
	public void setChapterNo(Long chapterNo) {
		this.chapterNo = chapterNo;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getCourseChapterId() {
		return this.courseChapterId;
	}
	public void setCourseChapterId(String courseChapterId) {
		this.courseChapterId = courseChapterId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getParentChapterId() {
		return this.parentChapterId;
	}
	public void setParentChapterId(String parentChapterId) {
		this.parentChapterId = parentChapterId;
	}

	public String getVideoContentId() {
		return this.videoContentId;
	}
	public void setVideoContentId(String videoContentId) {
		this.videoContentId = videoContentId;
	}

}
