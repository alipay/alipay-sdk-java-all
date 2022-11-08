package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 基于商业关系的异动门店信息

 *
 * @author auto create
 * @since 1.0, 2022-01-13 14:31:20
 */
public class BusinessRelationChangeShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7572536827918771395L;

	/**
	 * 异动收单信息列表
	 */
	@ApiListField("change_member_infos")
	@ApiField("business_relation_change_member_info")
	private List<BusinessRelationChangeMemberInfo> changeMemberInfos;

	/**
	 * 异动数据新增时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 异动数据更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 商业关系异动门店状态，已处理/未处理，PROCESSED/UNPROCESSED
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 外部门店编号，用于ISV系统内部门店标识等
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 代运营商业关系门店名称，即当前组织下可运营门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public List<BusinessRelationChangeMemberInfo> getChangeMemberInfos() {
		return this.changeMemberInfos;
	}
	public void setChangeMemberInfos(List<BusinessRelationChangeMemberInfo> changeMemberInfos) {
		this.changeMemberInfos = changeMemberInfos;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
