package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 泛行业教培点评信息同步
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:32:38
 */
public class AlipayCommerceFhyeduEvaluationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8541616915732862231L;

	/**
	 * 课后点评内容
	 */
	@ApiField("assessment")
	private String assessment;

	/**
	 * 课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 点评id
	 */
	@ApiField("evaluation_id")
	private String evaluationId;

	/**
	 * 点评时间
	 */
	@ApiField("evaluation_time")
	private Date evaluationTime;

	/**
	 * 点评人
	 */
	@ApiField("evaluator")
	private String evaluator;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 课次id
	 */
	@ApiField("sched_id")
	private String schedId;

	/**
	 * null
	 */
	@ApiListField("score_list")
	@ApiField("edu_assessment_score")
	private List<EduAssessmentScore> scoreList;

	/**
	 * 学员id
	 */
	@ApiField("student_id")
	private String studentId;

	public String getAssessment() {
		return this.assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
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

	public String getEvaluationId() {
		return this.evaluationId;
	}
	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public Date getEvaluationTime() {
		return this.evaluationTime;
	}
	public void setEvaluationTime(Date evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	public String getEvaluator() {
		return this.evaluator;
	}
	public void setEvaluator(String evaluator) {
		this.evaluator = evaluator;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSchedId() {
		return this.schedId;
	}
	public void setSchedId(String schedId) {
		this.schedId = schedId;
	}

	public List<EduAssessmentScore> getScoreList() {
		return this.scoreList;
	}
	public void setScoreList(List<EduAssessmentScore> scoreList) {
		this.scoreList = scoreList;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
