package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 牛客回调参数请求对象
 *
 * @author auto create
 * @since 1.0, 2022-06-06 10:52:03
 */
public class NiukeExamCallbackRequest extends AlipayObject {

	private static final long serialVersionUID = 5476948843865239363L;

	/**
	 * 考生具体每一类题型的得分情况。这个参数会有多个，每一个的参数格式是score|categoryId|categoryName 如1.5|100|选择题。
	 */
	@ApiListField("category_scores")
	@ApiField("string")
	private List<String> categoryScores;

	/**
	 * true、false 是否作弊，疑似作弊时为null
	 */
	@ApiField("is_cheated")
	private String isCheated;

	/**
	 * 唯一id，即应聘id
	 */
	@ApiField("key")
	private String key;

	/**
	 * 试卷id
	 */
	@ApiField("paper_id")
	private String paperId;

	/**
	 * 试卷名称
	 */
	@ApiField("paper_name")
	private String paperName;

	/**
	 * 试卷满分
	 */
	@ApiField("paper_score")
	private Long paperScore;

	/**
	 * 测评成绩报告的PDF的URL
	 */
	@ApiField("result_pdf_url")
	private String resultPdfUrl;

	/**
	 * 考生试卷总得分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 测评的状态 NOT_DO-未做题,DOING-正在做题,DONE-做完题,JUDGED-人工阅卷完成, CHEAT_DETECT_DONE-作弊检测完成，DELETE-删除
	 */
	@ApiField("status")
	private String status;

	/**
	 * 考生交卷时间(毫秒级时间戳)
	 */
	@ApiField("test_finish_time")
	private Long testFinishTime;

	/**
	 * 考生考试开始时间(毫秒级时间戳)
	 */
	@ApiField("test_start_time")
	private Long testStartTime;

	public List<String> getCategoryScores() {
		return this.categoryScores;
	}
	public void setCategoryScores(List<String> categoryScores) {
		this.categoryScores = categoryScores;
	}

	public String getIsCheated() {
		return this.isCheated;
	}
	public void setIsCheated(String isCheated) {
		this.isCheated = isCheated;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getPaperId() {
		return this.paperId;
	}
	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public String getPaperName() {
		return this.paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public Long getPaperScore() {
		return this.paperScore;
	}
	public void setPaperScore(Long paperScore) {
		this.paperScore = paperScore;
	}

	public String getResultPdfUrl() {
		return this.resultPdfUrl;
	}
	public void setResultPdfUrl(String resultPdfUrl) {
		this.resultPdfUrl = resultPdfUrl;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTestFinishTime() {
		return this.testFinishTime;
	}
	public void setTestFinishTime(Long testFinishTime) {
		this.testFinishTime = testFinishTime;
	}

	public Long getTestStartTime() {
		return this.testStartTime;
	}
	public void setTestStartTime(Long testStartTime) {
		this.testStartTime = testStartTime;
	}

}
