package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收估价查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:41:26
 */
public class AlipayCommerceRecycleAssessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7841183688636358345L;

	/**
	 * 用户回收地址信息
	 */
	@ApiField("address_info")
	private RecycleAddressInfo addressInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品code
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 回收方式
	 */
	@ApiField("recycle_approach")
	private String recycleApproach;

	/**
	 * 问卷选项关系id集合
	 */
	@ApiListField("relation_id_list")
	@ApiField("string")
	private List<String> relationIdList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RecycleAddressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RecycleAddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRecycleApproach() {
		return this.recycleApproach;
	}
	public void setRecycleApproach(String recycleApproach) {
		this.recycleApproach = recycleApproach;
	}

	public List<String> getRelationIdList() {
		return this.relationIdList;
	}
	public void setRelationIdList(List<String> relationIdList) {
		this.relationIdList = relationIdList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
