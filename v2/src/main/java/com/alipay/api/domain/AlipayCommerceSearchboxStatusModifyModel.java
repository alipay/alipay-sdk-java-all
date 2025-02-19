package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业搜索BOX状态修改
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:53:14
 */
public class AlipayCommerceSearchboxStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1821747721855795212L;

	/**
	 * 类目ID,建议长度控制在 128 字符之内
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商户生效渠道
	 */
	@ApiListField("client_type")
	@ApiField("string")
	private List<String> clientType;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 修改类型
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 目标状态
	 */
	@ApiField("status")
	private String status;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<String> getClientType() {
		return this.clientType;
	}
	public void setClientType(List<String> clientType) {
		this.clientType = clientType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
