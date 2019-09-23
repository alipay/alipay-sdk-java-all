package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 基于门店id的优惠查询服务
 *
 * @author auto create
 * @since 1.0, 2018-01-05 10:43:59
 */
public class AlipayOfflineMarketShopDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3483363796263714284L;

	/**
	 * 活动业务类型列表，当query_type为MERCHANT且user_id不为空时生效，对返回结果进行过滤，返回列表中指定业务类型的活动，默认为空，代表不过滤，返回所有活动。业务类型：CONSUME_SEND：消费送；MRT_DISCOUNT:商户立减；OBTAIN:通用领券
	 */
	@ApiListField("camp_biz_type_list")
	@ApiField("string")
	private List<String> campBizTypeList;

	/**
	 * 查询类型 目前取值：MERCHANT(商户活动)，  如果不传递该参数或者指定参数值，出参只返回item_list，discount_list， 反之返回camp_num,camp_list
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 门店id，注意:必须传递isv授权商户下的门店，否则无权限查询
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 用户id，当query_type为MERCHANT时生效，如果查询的优惠活动需要过用户规则，则用户id必须传入，目前只支持查询活动列表的场景
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCampBizTypeList() {
		return this.campBizTypeList;
	}
	public void setCampBizTypeList(List<String> campBizTypeList) {
		this.campBizTypeList = campBizTypeList;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
