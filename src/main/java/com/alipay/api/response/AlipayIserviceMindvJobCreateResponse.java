package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.job.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceMindvJobCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343328248868881139L;

	/** 
	 * 任务创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 新增的问卷id数据
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 任务创建后发布的域名信息，枚举值:
ALIPAY(1, "surveys.alipay.com"),
ALIBABA_INC(2, "surveys.alibaba-inc.com"),
HEMAOS(3, "surveys.hemaos.com");
	 */
	@ApiField("job_domain")
	private String jobDomain;

	/** 
	 * 任务状态信息_枚举值_用于判断当前任务状态_可通过检索任务获取

枚举值如下: WAIT_PUBLISH(等待发布),INNER_PUBLISHED(对内投放),TEST_PUBLISHED(测试投放),MANUAL_PUBLISHED(手动投放),GREY_PUBLISHED(灰度投放),FULL_PUBLISHED(全量投放),WAIT_TEST_PUBLISH(等待测试投放),WAIT_MANUAL_PUBLISH(等待全量投放),SCENE_PUBLISHED(场景投放)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 问卷/试卷标题信息
	 */
	@ApiField("title")
	private String title;

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setJobDomain(String jobDomain) {
		this.jobDomain = jobDomain;
	}
	public String getJobDomain( ) {
		return this.jobDomain;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
