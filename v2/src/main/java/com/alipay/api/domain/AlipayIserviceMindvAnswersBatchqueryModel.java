package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角_用户作答结果查询
 *
 * @author auto create
 * @since 1.0, 2023-02-03 16:05:17
 */
public class AlipayIserviceMindvAnswersBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3412676995163542469L;

	/**
	 * 对应填写的任务id_用以获取指定任务的结果数据

snapshot_id 和 job_id 有且只能有一个不为空
	 */
	@ApiField("job_id")
	private Long jobId;

	/**
	 * 分页数据页码，默认从0开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页数据中每页的数据数量，默认为 10
	 */
	@ApiField("per_page_size")
	private Long perPageSize;

	/**
	 * 问卷快照id_用以查询指定用户指定快照的答案数据

snapshot_id 和 job_id 有且只能有一个不为空
	 */
	@ApiField("snapshot_id")
	private Long snapshotId;

	/**
	 * 对应账号类型下的唯一账号主键_用以区分对应的填写用户
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

	public Long getJobId() {
		return this.jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPerPageSize() {
		return this.perPageSize;
	}
	public void setPerPageSize(Long perPageSize) {
		this.perPageSize = perPageSize;
	}

	public Long getSnapshotId() {
		return this.snapshotId;
	}
	public void setSnapshotId(Long snapshotId) {
		this.snapshotId = snapshotId;
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
