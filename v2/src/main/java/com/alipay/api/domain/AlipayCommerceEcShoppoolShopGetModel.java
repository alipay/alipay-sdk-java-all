package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店池门店获取
 *
 * @author auto create
 * @since 1.0, 2024-05-06 17:02:24
 */
public class AlipayCommerceEcShoppoolShopGetModel extends AlipayObject {

	private static final long serialVersionUID = 8152845628745562277L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业码门店组id，和shop_id_list二选一
	 */
	@ApiField("shop_group_id")
	private String shopGroupId;

	/**
	 * 企业码门店id列表，最大支持50个，和shop_group_id二选一
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getShopGroupId() {
		return this.shopGroupId;
	}
	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
