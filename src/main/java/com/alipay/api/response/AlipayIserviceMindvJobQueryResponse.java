package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.job.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceMindvJobQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8866155194438219836L;

	/** 
	 * 任务创建时间_显示任务的创建时间_通过检索结果返回
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 任务信息主键_唯一_可通过任务信息主键和用户主键共同检索作答情况
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 任务创建后发布的域名信息，枚举值:
ALIPAY(1, "surveys.alipay.com"),
ALIBABA_INC(2, "surveys.alibaba-inc.com"),
HEMAOS(3, "surveys.hemaos.com");
	 */
	@ApiField("job_domain")
	private String jobDomain;

	/** 
	 * 任务名称_由任务对应的问卷/试卷标题构成, 用于前端界面展示

同用户名无关，不需要脱敏
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 任务状态信息_枚举值_用于判断当前任务状态_可通过检索任务获取

枚举值如下: WAIT_PUBLISH(等待发布),INNER_PUBLISHED(对内投放),TEST_PUBLISHED(测试投放),MANUAL_PUBLISHED(手动投放),GREY_PUBLISHED(灰度投放),FULL_PUBLISHED(全量投放),WAIT_TEST_PUBLISH(等待测试投放),WAIT_MANUAL_PUBLISH(等待全量投放),SCENE_PUBLISHED(场景投放)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 已阅卷过的问卷数量
	 */
	@ApiField("submit_complete_count")
	private Long submitCompleteCount;

	/** 
	 * 试卷总的提交量
	 */
	@ApiField("total_submit_count")
	private Long totalSubmitCount;

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setJobDomain(String jobDomain) {
		this.jobDomain = jobDomain;
	}
	public String getJobDomain( ) {
		return this.jobDomain;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubmitCompleteCount(Long submitCompleteCount) {
		this.submitCompleteCount = submitCompleteCount;
	}
	public Long getSubmitCompleteCount( ) {
		return this.submitCompleteCount;
	}

	public void setTotalSubmitCount(Long totalSubmitCount) {
		this.totalSubmitCount = totalSubmitCount;
	}
	public Long getTotalSubmitCount( ) {
		return this.totalSubmitCount;
	}

}
