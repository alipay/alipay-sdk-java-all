package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生学籍信息修改
 *
 * @author auto create
 * @since 1.0, 2019-08-14 14:02:34
 */
public class AlipayCommerceEducateStudentEnrollmentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4374381293574162536L;

	/**
	 * 班级名称
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 学生所在班级
	 */
	@ApiField("class_num")
	private String classNum;

	/**
	 * 入学年份，YYYY格式。
	 */
	@ApiField("enroll_date")
	private String enrollDate;

	/**
	 * 学生学籍号。调用改接口时enroll_no、school_stdcode、phase三个参数必须存在。如果三个参数对应的记录存在，则更新部位空的字段；如果不存在，在插入记录，所有字段必须不为空。
	 */
	@ApiField("enroll_no")
	private String enrollNo;

	/**
	 * 学籍状态：
01 在读
02 休学
03 退学
04 停学
05 复学
06 流失
07 毕业
08 结业
09 肄业
10 转学（转出）	
11 死亡
12 保留入学资格
13 公派出国
14 开除
15 下落不明
99 其他
	 */
	@ApiField("enroll_status")
	private String enrollStatus;

	/**
	 * 学生所在年级，年份表示的年级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 年级名称
	 */
	@ApiField("grade_name")
	private String gradeName;

	/**
	 * 机构编码，学籍认证机构编码，可以是官方教育厅、局，也可以是一个学校、教育集团等。
	 */
	@ApiField("institute_code")
	private String instituteCode;

	/**
	 * 当前教育阶段：
1	小学阶段
2	初中阶段
3	高中阶段
4	大学阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 当前教育阶段学制，例如小学6年制
	 */
	@ApiField("phase_len")
	private Long phaseLen;

	/**
	 * 学校标识码。由教育部按照国家标准及编码规则编制，赋予每一个学校在全国范围内唯一的、始终不变的10位识别代码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * Y/T 1001 JDFS 就读方式代码，1走读2住校3借宿9其他
	 */
	@ApiField("study_way")
	private String studyWay;

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassNum() {
		return this.classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public String getEnrollDate() {
		return this.enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getEnrollNo() {
		return this.enrollNo;
	}
	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
	}

	public String getEnrollStatus() {
		return this.enrollStatus;
	}
	public void setEnrollStatus(String enrollStatus) {
		this.enrollStatus = enrollStatus;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGradeName() {
		return this.gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getInstituteCode() {
		return this.instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Long getPhaseLen() {
		return this.phaseLen;
	}
	public void setPhaseLen(Long phaseLen) {
		this.phaseLen = phaseLen;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getStudyWay() {
		return this.studyWay;
	}
	public void setStudyWay(String studyWay) {
		this.studyWay = studyWay;
	}

}
