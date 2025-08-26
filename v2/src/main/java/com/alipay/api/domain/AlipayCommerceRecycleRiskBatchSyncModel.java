package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收行业黑名单批量同步
 *
 * @author auto create
 * @since 1.0, 2025-08-14 14:39:26
 */
public class AlipayCommerceRecycleRiskBatchSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2533424595145591246L;

	/**
	 * 黑名单列表
	 */
	@ApiListField("black_list")
	@ApiField("recycle_black_list")
	private List<RecycleBlackList> blackList;

	/**
	 * 下单人支付宝用户id:USER_ID；
取件人手机号:MOBILE；
取件人地址:ADDRESS；
支付宝交易组件订单id:ORDER；
下单人支付宝用户openid:OPEN_ID
	 */
	@ApiField("black_list_type")
	private String blackListType;

	/**
	 * 服务类目编码
	 */
	@ApiField("service_category_code")
	private String serviceCategoryCode;

	public List<RecycleBlackList> getBlackList() {
		return this.blackList;
	}
	public void setBlackList(List<RecycleBlackList> blackList) {
		this.blackList = blackList;
	}

	public String getBlackListType() {
		return this.blackListType;
	}
	public void setBlackListType(String blackListType) {
		this.blackListType = blackListType;
	}

	public String getServiceCategoryCode() {
		return this.serviceCategoryCode;
	}
	public void setServiceCategoryCode(String serviceCategoryCode) {
		this.serviceCategoryCode = serviceCategoryCode;
	}

}
