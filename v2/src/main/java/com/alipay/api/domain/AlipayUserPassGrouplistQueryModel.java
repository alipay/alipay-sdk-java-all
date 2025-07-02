package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付包卡包列表数据
 *
 * @author auto create
 * @since 1.0, 2018-01-02 10:51:31
 */
public class AlipayUserPassGrouplistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5377262864685611924L;

	/**
	 * 城市编码，国标码，如果need_shopinfo=true，必须传值
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 卡券分组标识，当前值：card（卡）、voucher（券）、ticket（票）、cert（证件）
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 是否需要店铺信息，true表需要，false或空表不需要
	 */
	@ApiField("need_shopinfo")
	private Boolean needShopinfo;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * pass有效状态: CURRENT：当前的, PAST：失效的
	 */
	@ApiField("time_status")
	private String timeStatus;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public Boolean getNeedShopinfo() {
		return this.needShopinfo;
	}
	public void setNeedShopinfo(Boolean needShopinfo) {
		this.needShopinfo = needShopinfo;
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTimeStatus() {
		return this.timeStatus;
	}
	public void setTimeStatus(String timeStatus) {
		this.timeStatus = timeStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
