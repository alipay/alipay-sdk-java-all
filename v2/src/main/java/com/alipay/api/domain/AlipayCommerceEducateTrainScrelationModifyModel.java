package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺商品关系接口
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:20:21
 */
public class AlipayCommerceEducateTrainScrelationModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2769252468326152268L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝内部课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 支付宝内部店铺id列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
