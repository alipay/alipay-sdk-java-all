package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户消费（领取、核销）特权数据同步
 *
 * @author auto create
 * @since 1.0, 2021-08-27 17:09:22
 */
public class AlipayUserPartnerPrivilegeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4423268371255759744L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 当前用户在特权周期内已经享有次数
	 */
	@ApiField("current_count")
	private Long currentCount;

	/**
	 * 当前用户在商家侧的等级英文编码（如 golden 可表示黄金会员），如果商家没有等级体系，则使用默认等级码：member
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 当前用户在特权记账周期内最大享有次数。例如，5元话费充值现金券，用户每月可领取并使用一次，那么，在记账周期（月）内用户最大享有次数为 1 次。
	 */
	@ApiField("max_count")
	private Long maxCount;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商家特权的ID，可唯一定位一个特权。可以是特权配置ID或数据库ID
	 */
	@ApiField("privilege_id")
	private String privilegeId;

	/**
	 * 当前用户消费商家特权的状态：1.INIT（领取）；2.USED（已使用）；3.EXPIRED（已过期）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商家特权标题或名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 特权记账周期：1.LIFE（终身）；2.YEAR（年）；3.SEASON（季度）；4.MONTH（月）；5.WEEK（周）；6.DAY（日）
	 */
	@ApiField("trans_quantum")
	private String transQuantum;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public Long getCurrentCount() {
		return this.currentCount;
	}
	public void setCurrentCount(Long currentCount) {
		this.currentCount = currentCount;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Long getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrivilegeId() {
		return this.privilegeId;
	}
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTransQuantum() {
		return this.transQuantum;
	}
	public void setTransQuantum(String transQuantum) {
		this.transQuantum = transQuantum;
	}

}
