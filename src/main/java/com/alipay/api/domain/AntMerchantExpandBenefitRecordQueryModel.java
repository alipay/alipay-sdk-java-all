package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家权益发放记录
 *
 * @author auto create
 * @since 1.0, 2019-08-19 17:43:01
 */
public class AntMerchantExpandBenefitRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5832594299368441439L;

	/**
	 * 任务有奖-1688 L1会场优惠资格权益
	 */
	@ApiField("benefit_instance_id")
	private String benefitInstanceId;

	/**
	 * 查询额外所需要的扩展信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/**
	 * 外部传入的账号
CBU的userId
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 查询数据的页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 查询的分页 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 发放记录的状态
GRANTED:发放成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitInstanceId() {
		return this.benefitInstanceId;
	}
	public void setBenefitInstanceId(String benefitInstanceId) {
		this.benefitInstanceId = benefitInstanceId;
	}

	public String getBizExt() {
		return this.bizExt;
	}
	public void setBizExt(String bizExt) {
		this.bizExt = bizExt;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
