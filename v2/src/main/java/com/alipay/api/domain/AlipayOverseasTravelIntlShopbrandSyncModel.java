package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * A+店铺品牌同步
 *
 * @author auto create
 * @since 1.0, 2023-12-15 13:42:17
 */
public class AlipayOverseasTravelIntlShopbrandSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4852651488421648793L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 店铺ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
