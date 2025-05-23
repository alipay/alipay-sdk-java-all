package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到异常数据同步详情
 *
 * @author auto create
 * @since 1.0, 2025-05-08 17:14:55
 */
public class CheckInUnusualNotifyDetail extends AlipayObject {

	private static final long serialVersionUID = 6314582331651695263L;

	/**
	 * 已打卡人数。
	 */
	@ApiField("checked_total")
	private Long checkedTotal;

	/**
	 * 推送时间。
	 */
	@ApiField("gmt_push")
	private Date gmtPush;

	/**
	 * 由支付宝为学校生产的唯一编号。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学校名称。
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 总人数。
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 未打卡人数。
	 */
	@ApiField("unchecked_total")
	private Long uncheckedTotal;

	public Long getCheckedTotal() {
		return this.checkedTotal;
	}
	public void setCheckedTotal(Long checkedTotal) {
		this.checkedTotal = checkedTotal;
	}

	public Date getGmtPush() {
		return this.gmtPush;
	}
	public void setGmtPush(Date gmtPush) {
		this.gmtPush = gmtPush;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getUncheckedTotal() {
		return this.uncheckedTotal;
	}
	public void setUncheckedTotal(Long uncheckedTotal) {
		this.uncheckedTotal = uncheckedTotal;
	}

}
