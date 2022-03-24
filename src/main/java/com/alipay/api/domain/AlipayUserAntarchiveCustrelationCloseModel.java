package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭蚂蚁档案客户关联
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:58:49
 */
public class AlipayUserAntarchiveCustrelationCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2185635873954488244L;

	/**
	 * 关闭时间,可空.标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("close_date")
	private Date closeDate;

	/**
	 * 待关闭蚂蚁档案关联的客户id
	 */
	@ApiField("cust_id")
	private String custId;

	public Date getCloseDate() {
		return this.closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getCustId() {
		return this.custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

}
