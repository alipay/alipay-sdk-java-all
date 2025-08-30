package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询职业培训课程信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingCourseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3736257512243533191L;

	/**
	 * （用于支付宝一方页面的分类筛选）
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * ● 湖南省全省:  430000  
● 浙江省-杭州市:  330100  
● 浙江省-杭州市-余杭区:  330110 
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 导游一月速成班
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 外部课程ID
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	/**
	 * 页码	
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数: 最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
