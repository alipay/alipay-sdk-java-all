package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁计划创建并发布
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:06:59
 */
public class AlipayCommerceLeasePlanPublishModel extends AlipayObject {

	private static final long serialVersionUID = 2244553982314527237L;

	/**
	 * 品牌关系标签
	 */
	@ApiField("brand_tag")
	private String brandTag;

	/**
	 * 计划结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 供给租赁商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 计划开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBrandTag() {
		return this.brandTag;
	}
	public void setBrandTag(String brandTag) {
		this.brandTag = brandTag;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
