package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户提交的问卷结果数据对象信息
 *
 * @author auto create
 * @since 1.0, 2018-09-19 16:54:40
 */
public class UserSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5465981625368957495L;

	/**
	 * 提交答案中每道题的具体答案数据
	 */
	@ApiListField("answers")
	@ApiField("answer_model")
	private List<AnswerModel> answers;

	/**
	 * 用户答案提交时间
	 */
	@ApiField("gmt_submit")
	private String gmtSubmit;

	/**
	 * 对应的任务id信息，根据入参的 job_id 或 snapshot_id 返回
	 */
	@ApiField("job_id")
	private Long jobId;

	/**
	 * 填写来源标记
	 */
	@ApiField("referrer")
	private String referrer;

	/**
	 * 试卷得分
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 答案对应的问卷快照版本_通过传入的 job_id 和 snapshot_id 获取
	 */
	@ApiField("snapshot_id")
	private Long snapshotId;

	/**
	 * 用户提交问卷时的随机码信息
	 */
	@ApiField("submit_id")
	private String submitId;

	/**
	 * 对应账号类型下的唯一账号主键_用以区分对应的填写用户
和入参参数一致，不需要脱敏
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 账号类型_用以区分不同账号体系的用户

ALIPAY-支付宝
HEMA-盒马
ALIBABA_INC-内部域账号
	 */
	@ApiField("user_type")
	private String userType;

	public List<AnswerModel> getAnswers() {
		return this.answers;
	}
	public void setAnswers(List<AnswerModel> answers) {
		this.answers = answers;
	}

	public String getGmtSubmit() {
		return this.gmtSubmit;
	}
	public void setGmtSubmit(String gmtSubmit) {
		this.gmtSubmit = gmtSubmit;
	}

	public Long getJobId() {
		return this.jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getReferrer() {
		return this.referrer;
	}
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getSnapshotId() {
		return this.snapshotId;
	}
	public void setSnapshotId(Long snapshotId) {
		this.snapshotId = snapshotId;
	}

	public String getSubmitId() {
		return this.submitId;
	}
	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
