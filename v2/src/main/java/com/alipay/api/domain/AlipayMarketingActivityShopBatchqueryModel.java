package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券可用门店
 *
 * @author auto create
 * @since 1.0, 2024-01-25 21:03:01
 */
public class AlipayMarketingActivityShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8414958491721615961L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 商户PID,默认为当前接口调用商户。
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

	/**
	 * 版本号

枚举值:
2.0.0
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
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

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
