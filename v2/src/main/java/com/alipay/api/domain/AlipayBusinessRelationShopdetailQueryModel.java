package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系门店详情查询
 *
 * @author auto create
 * @since 1.0, 2023-06-19 14:43:19
 */
public class AlipayBusinessRelationShopdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2155973833499931762L;

	/**
	 * 商业关系组织id 由组织信息创建接口返回或bd分配
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 外部门店编号，此字段与real_shop_id至少传参一个，优先使用real_shop_id。
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

}
