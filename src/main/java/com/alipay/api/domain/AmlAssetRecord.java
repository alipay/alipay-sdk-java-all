package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反洗钱风险资产记录详情
 *
 * @author auto create
 * @since 1.0, 2020-05-26 13:40:45
 */
public class AmlAssetRecord extends AlipayObject {

	private static final long serialVersionUID = 6629474966718257881L;

	/**
	 * 数据生效时间
	 */
	@ApiField("active_date")
	private Date activeDate;

	/**
	 * 名单或风险标签ID
	 */
	@ApiField("lid")
	private String lid;

	/**
	 * 客户ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 风险资产标签值
	 */
	@ApiField("value")
	private String value;

	public Date getActiveDate() {
		return this.activeDate;
	}
	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public String getLid() {
		return this.lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
