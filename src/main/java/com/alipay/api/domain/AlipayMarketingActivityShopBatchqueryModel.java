package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券可用门店
 *
 * @author auto create
 * @since 1.0, 2021-11-25 22:40:47
 */
public class AlipayMarketingActivityShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2226343863945666275L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户PID,默认为当前接口调用商户 
限制: 
接口调用者必须有商户代运营权限。 

代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 分页查询页码。 
限制: 
必须为大于0的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。 
限制: 
1.必须为大于0的整数 
2.每页最大值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
