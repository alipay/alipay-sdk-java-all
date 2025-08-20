package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据SKUID维度藏品查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-17 11:38:07
 */
public class AnttechNftAssetbyskuidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5657732276126526942L;

	/**
	 * 用户标识
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 用户id类型，参考枚举 idType
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码从1开始，默认值1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页大小，默认值10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商品实例id
	 */
	@ApiField("product_instance_id")
	private String productInstanceId;

	/**
	 * 请求唯一ID，用于链路跟踪和问题排查
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/**
	 * 藏品标识skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductInstanceId() {
		return this.productInstanceId;
	}
	public void setProductInstanceId(String productInstanceId) {
		this.productInstanceId = productInstanceId;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
